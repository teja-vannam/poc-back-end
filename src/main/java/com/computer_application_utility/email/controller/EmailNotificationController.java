package com.computer_application_utility.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.computer_application_utility.email.bean.EmailData;
import com.computer_application_utility.email.service.NotificationService;

@RestController
public class EmailNotificationController {

    @Autowired
    public NotificationService notificationService;

    @PostMapping("/sendSimpleMail")
    public String sendSimpleMail(@RequestBody EmailData emailData) {
        return notificationService.sendSimpleMail(emailData);
    }

    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(@RequestBody EmailData emailData) {
        return notificationService.sendMailWithAttachment(emailData);
    }

    @PostMapping("/sendMailWithHTML_Body")
    public String sendMailWithHTML_Body(@RequestBody EmailData emailData) {
        return notificationService.sendMailWithHTML_Body(emailData);
    }

    @PostMapping("/sendMailWithDynamic_HTML_Body")
    public String sendMailWithDynamic_HTML_Body(@RequestBody EmailData emailData) {
        return notificationService.sendMailWithDynamic_HTML_Body(emailData);
    }
}