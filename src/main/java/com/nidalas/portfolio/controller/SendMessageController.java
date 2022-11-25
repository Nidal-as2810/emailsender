package com.nidalas.portfolio.controller;

import com.nidalas.portfolio.Message;
import com.nidalas.portfolio.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SendMessageController {
    @Autowired
    private SendEmailService service;

    @PostMapping("/send-email")
    public void sendEmail(@RequestBody Message message){
        service.sendEmail(message.getEmail(),message.getMessage(),message.getName());
    }
}
