package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.mapper.AccountMapper;
import com.Trang.webyte.mapper.RoleMapper;
import com.Trang.webyte.model.Account;
import com.Trang.webyte.model.AccountExample;
import com.Trang.webyte.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountDetailServiceImpl implements UserDetailsService {
    @Autowired
    AccountMapper accountMapper;
    @Autowired
    RoleMapper roleMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AccountExample accountExample= new AccountExample();
        accountExample.createCriteria().andUsernameEqualTo(username);
        List<Account> accountDTO= accountMapper.selectByExample(accountExample);
        List<GrantedAuthority> grantedAuthorities= new ArrayList<GrantedAuthority>();
        if(accountDTO.size()>0){
            Account account= accountDTO.get(0);
            Role role= roleMapper.selectByKey(account.getIdrole());
            GrantedAuthority authorit= new SimpleGrantedAuthority("ROLE_"+ role.getRole());
            grantedAuthorities.add(authorit);
            UserDetails userDetails= new User(account.getUsername(),account.getPassword(),grantedAuthorities);
            return userDetails;
        }
        else {
            new UsernameNotFoundException("Không tìm thấy username");
        }
        return null;
    }
}
