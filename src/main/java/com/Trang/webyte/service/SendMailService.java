package com.Trang.webyte.service;

import com.Trang.webyte.model.Patient;


public interface SendMailService {
    Boolean signup(Patient sdi, String token);

    Boolean create(Patient sdi, String password);

    void forgotPassword(Patient sdi, String password);
}
