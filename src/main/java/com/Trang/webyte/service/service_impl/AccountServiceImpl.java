package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.DTO.AccountDTO;
import com.Trang.webyte.mapper.AccountMapper;
import com.Trang.webyte.model.Account;
import com.Trang.webyte.model.AccountExample;
import com.Trang.webyte.model.AccountKey;
import com.Trang.webyte.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;
    @Override
    public List<Account> getAllListAccount() {
        AccountExample accountExample= new AccountExample();
        List<Account> listAccount= accountMapper.selectByExample(accountExample);
        return listAccount;
    }

    @Override
    public Account getAccount(AccountKey key) {
        Account account= accountMapper.selectByPrimaryKey(key);
        if( account!=null)
        {
            return  account;
        }
       return  null;
    }

    @Override
    public AccountDTO insertAccount(AccountDTO accountDTO) {
        Account acc= new Account();
        acc.setIdrole(accountDTO.getIdrole());
        acc.setId(accountDTO.getId());
        acc.setUsername(accountDTO.getUsername());
        int success= accountMapper.insertSelective(acc);
        if(success>0){
            return  accountDTO;
        }
        else {
            return  null;
        }
    }

    @Override
    public AccountDTO updateAccount(AccountDTO accountDTO) {
        Account accountUpdate= new Account();
        accountUpdate.setIdrole(accountDTO.getIdrole());
        accountUpdate.setId(accountDTO.getId());
        accountUpdate.setUsername(accountDTO.getUsername());
        int success=accountMapper.updateByPrimaryKeySelective(accountUpdate);
        if(success>0){
            return accountDTO;
        }
        else {
            return  null;
        }

    }

    @Override
    public int deleteAccount(int id) {
        AccountKey key= new AccountKey();
        key.setId(id);
        int success= accountMapper.deleteByPrimaryKey(key);
        return  success;
    }
}
