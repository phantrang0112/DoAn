package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.DTO.AccountDTO;
import com.Trang.webyte.mapper.AccountMapper;
import com.Trang.webyte.mapper.RoleMapper;
import com.Trang.webyte.model.*;
import com.Trang.webyte.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;

    @Autowired
    RoleMapper roleMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    com.Trang.webyte.util.jwtUtil jwtUtil;

    @Override
    public List<Account> getAllListAccount() {
        AccountExample accountExample = new AccountExample();
        List<Account> listAccount = accountMapper.selectByExample(accountExample);
        return listAccount;
    }

    @Override
    public Account getAccount(AccountKey key) {
        Account account = accountMapper.selectByPrimaryKey(key);
        if (account != null) {
            return account;
        }
        return null;
    }

    @Override
    public Account insertAccount(AccountDTO accountDTO) {
        Account acc = new Account();
        acc.setIdrole(accountDTO.getIdrole());
        acc.setUsername(accountDTO.getUsername());
        acc.setPassword(passwordEncoder.encode(accountDTO.getPassword()));
        int success = accountMapper.insertSelective(acc);
        AccountExample accountExample = new AccountExample();
        accountExample.createCriteria().andUsernameEqualTo(acc.getUsername());
        List<Account> account = accountMapper.selectByExample(accountExample);
        if (success > 0) {
            return account.get(0);
        } else {
            return null;
        }
    }

    @Override
    public AccountDTO updateAccount(AccountDTO accountDTO) {
        Account accountUpdate = new Account();
        accountUpdate.setIdrole(accountDTO.getIdrole());
        accountUpdate.setId(accountDTO.getId());
        accountUpdate.setUsername(accountDTO.getUsername());
        int success = accountMapper.updateByPrimaryKeySelective(accountUpdate);
        if (success > 0) {
            return accountDTO;
        } else {
            return null;
        }

    }

    @Override
    public int deleteAccount(int id) {
        AccountKey key = new AccountKey();
        key.setId(id);
        int success = accountMapper.deleteByPrimaryKey(key);
        return success;
    }

    @Override
    public Map<String, Object> login(AccountDTO accountDTO) {
        Map<String, Object> paren = new HashMap<String, Object>();
        AccountExample accountExample = new AccountExample();
        String role = "";
        System.out.println(accountDTO.getPassword() + accountDTO.getUsername());
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(accountDTO.getUsername(), accountDTO.getPassword()));
            accountExample.createCriteria().andUsernameEqualTo(accountDTO.getUsername());

            List<Account> listEmployee = accountMapper.selectByExample(accountExample);
            switch (listEmployee.get(0).getIdrole()) {
                case 1:
                    role = "user";
                    break;
                case 2:
                    role = "admin";
                    break;
                case 3:
                    role = "doctor";
                    break;
                default:
                    role = "";
                    break;
            }
            paren.put("username", listEmployee.get(0).getUsername());
            paren.put("role", role);
            paren.put("id", listEmployee.get(0).getId());
            paren.put("message", "Đăng nhập thành công");
            paren.put("token", jwtUtil.generateToken(accountDTO.getUsername()));
            return paren;
        } catch (Exception ex) {
            System.out.println(ex);
            paren.put("username", null);
            paren.put("role", null);
            paren.put("message", "Đăng nhập thất bại");
            paren.put("token", null);
            return paren;
        }

    }
}
