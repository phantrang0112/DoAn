package com.Trang.webyte.controller;

import com.Trang.webyte.DTO.AccountDTO;
import com.Trang.webyte.DTO.PatientDTO;
import com.Trang.webyte.model.Account;
import com.Trang.webyte.model.AccountKey;
import com.Trang.webyte.model.Patient;
import com.Trang.webyte.service.AccountService;
import com.Trang.webyte.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/webyte/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @Autowired
    PatientService patientService;

    @GetMapping("/get-all-account")
    public List<Account> getAllAccount() {
        List<Account> accountList = accountService.getAllListAccount();
        if (accountList != null) {
            return accountList;
        } else {
            return null;
        }
    }

    @GetMapping("/{key}")
    public Account getAccount(@PathVariable("key") AccountKey accountKey) {
        if (accountKey != null) {
            Account account = accountService.getAccount(accountKey);
            return account;
        } else {
            return null;
        }

    }

    @PostMapping("/signup")
    public Account newAccount(@RequestBody AccountDTO accountDTO) {
        System.out.println("hvghfg");
        if (accountDTO != null) {
            Account account = accountService.insertAccount(accountDTO);
            return account;
        } else {
            return null;
        }

    }

    @PostMapping("/signupUser")
    public Account newAccount(@RequestBody List<Map> register) {
        AccountDTO accountDTO = new AccountDTO(register.get(0));
        PatientDTO patientDTO = new PatientDTO(register.get(1));
        if (accountDTO != null && patientDTO != null) {
            Account account = accountService.insertAccount(accountDTO);
            PatientDTO patient = patientService.insertPatientSignup(account.getId(), patientDTO);
            if (account != null && patient != null) {
                return account;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @PutMapping("")
    public AccountDTO updateAccount(@RequestBody AccountDTO accountDTO) {
        if (accountDTO != null) {
            AccountDTO accountUpdate = accountService.updateAccount(accountDTO);
            return accountDTO;
        } else {
            return null;
        }
    }

    @DeleteMapping("/{key}")
    public String deleteAccount(@PathVariable("key") AccountKey accountKey) {

        return null;
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody AccountDTO accountDTO) {
        Map<String, Object> account = accountService.login(accountDTO);
        if (account != null) {
            return account;
        }
        return null;
    }
}
