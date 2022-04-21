package com.Trang.webyte.controller;

import com.Trang.webyte.DTO.AccountDTO;
import com.Trang.webyte.model.Account;
import com.Trang.webyte.model.AccountKey;
import com.Trang.webyte.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/webyte/account")
public class AccountController {
    @Autowired
    AccountService accountService;
    @GetMapping("/get-all-account")
    public List<Account> getAllAccount(){
        List<Account> accountList= accountService.getAllListAccount();
        if(accountList!=null){
             return  accountList;
        }
        else{
            return null;
        }
    }
    @GetMapping("/{key}")
    public  Account getAccount(@PathVariable("key") AccountKey accountKey){
        Account account= accountService.getAccount(accountKey);
        return  account;
    }
    @PostMapping("")
    public AccountDTO newAccount(@RequestBody AccountDTO accountDTO){
        AccountDTO account= accountService.insertAccount(accountDTO);
        return  account;
    }
    @PutMapping("")
    public  AccountDTO updateAccount(@RequestBody AccountDTO accountDTO){
        AccountDTO accountUpdate= accountService.updateAccount(accountDTO);
        return accountDTO;
    }
    @DeleteMapping("/{key}")
    public String deleteAccount(@PathVariable("key") AccountKey accountKey){
        return  "null";
    }
}
