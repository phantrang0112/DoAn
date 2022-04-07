package com.Trang.webyte.service;


import com.Trang.webyte.DTO.AccountDTO;
import com.Trang.webyte.mapper.AccountMapper;
import com.Trang.webyte.model.Account;
import com.Trang.webyte.model.AccountKey;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface AccountService {

    public List<Account> getAllListAccount();
    public Account getAccount(AccountKey key);
    public AccountDTO insertAccount(AccountDTO account);
    public AccountDTO updateAccount(AccountDTO accountDTO);
    public int deleteAccount(int id);
}
