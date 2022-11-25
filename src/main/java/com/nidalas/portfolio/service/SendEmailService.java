package com.nidalas.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String fromEmail, String body, String name){
        SimpleMailMessage message=new SimpleMailMessage();
        message.setFrom("Nidalas.com");
        message.setTo("nidal@nidalas.com");
        message.setText(body);
        message.setSubject(name +": "+ fromEmail);

        javaMailSender.send(message);
    }
}
