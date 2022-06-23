package com.Trang.webyte.service;

import com.Trang.webyte.DTO.DataMailDTO;
import javax.mail.MessagingException;
import org.springframework.scheduling.annotation.Async;



public interface MailService {
    @Async
    void sendHtmlMail(DataMailDTO dataMail, String templateName) throws MessagingException;
}
