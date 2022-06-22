package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.DTO.DataMailDTO;
import com.Trang.webyte.model.Patient;
import com.Trang.webyte.service.MailService;
import com.Trang.webyte.service.SendMailService;
import com.Trang.webyte.util.Const;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

import java.util.HashMap;
import java.util.Map;

@Service
public class SendMailServiceImpl implements SendMailService {

    @Autowired
    MailService mailService;

    @Override
    public Boolean signup(Patient sdi, String token) {
        return null;
    }

    @Override
    public Boolean create(Patient sdi, String password) {
        return null;
    }

    @Override
    public void forgotPassword(Patient sdi, String password) {
        try {
            DataMailDTO dataMail = new DataMailDTO();

            dataMail.setTo(sdi.getEmail());
            dataMail.setSubject(Const.SEND_MAIL_SUBJECT.CLIENT_FORGET_PASSWORD);

            Map<String, Object> props = new HashMap<>();
            props.put("fullname", sdi.getFullname());
            props.put("password", password);
            dataMail.setProps(props);

            mailService.sendHtmlMail(dataMail, Const.TEMPLATE_FILE_NAME.CLIENT_FORGET_PASSWORD);
        } catch (MessagingException exp) {
            exp.printStackTrace();
        }
    }
}
