package com.Trang.webyte.controller;

import com.Trang.webyte.DTO.AccountDTO;
import com.Trang.webyte.DTO.DoctorDTO;
import com.Trang.webyte.DTO.PatientDTO;
import com.Trang.webyte.mapper.DoctorMapper;
import com.Trang.webyte.model.Account;
import com.Trang.webyte.model.AccountKey;
import com.Trang.webyte.model.Doctor;
import com.Trang.webyte.service.AccountService;
import com.Trang.webyte.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CrossOrigin
@RestController
@RequestMapping("/webyte/account")
public class AccountController {
    @Autowired
    AccountService accountService;
    private String fileUpload;
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
        System.out.println(register.get(0).get("idrole"));
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

    @Autowired
    DoctorMapper doctorMapper;

    @PutMapping("/upload/{id}")
    public Doctor UploadImg(@RequestParam("img") MultipartFile img,@RequestParam("data") DoctorDTO doctorDTO, @PathVariable("id") int id) throws IOException {
        System.out.println(doctorDTO.getFullname()+doctorDTO.getPhone());
        String fileUpload = "Y:\\";
        doctorDTO.setImg(img);
        if (doctorDTO != null) {
            Doctor doctor = doctorMapper.selectByPrimaryKey(doctorDTO.getDoctorid());
            if (doctor != null) {

                try {
                    MultipartFile multipartFile = doctorDTO.getImg();
                    String fileName = ((MultipartFile) multipartFile).getOriginalFilename();
                    FileCopyUtils.copy(doctorDTO.getImg().getBytes(), new File(fileUpload + fileName));
                    Doctor doctorUpdate = new Doctor(doctorDTO, fileName);
                    doctorMapper.updateByPrimaryKeySelective(doctorUpdate);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        return null;
    }

    @GetMapping("/forgotPassword/{email}")
    public ResponseEntity<Boolean> forgotPassword(@PathVariable String email) {
        Account account = accountService.getAccountByEmail(email);
        return new ResponseEntity<>(accountService.forgotPassword(account), HttpStatus.OK);
    }

    @PutMapping("/change-password/{id}")
    public boolean changePassword(@PathVariable("id") int id, @RequestBody String password) {
        boolean success = accountService.changePassword( id, password);
        if (success) {
            return true;
        } else {
            return false;
        }
    }

    @PostMapping("/check-password/{id}")
    public boolean checkPassword(@PathVariable("id") int id, @RequestBody String password) {
        System.out.println(id +" " +password);
        if (Objects.nonNull(accountService.checkPassword(id, password))){
            return true;
        } else {
            return false;
        }
    }
}
