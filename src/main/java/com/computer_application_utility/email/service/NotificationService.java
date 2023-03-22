package com.computer_application_utility.email.service;

import com.computer_application_utility.email.bean.EmailData;


public interface NotificationService {
    public String sendSimpleMail(EmailData emailData);
    public String sendMailWithAttachment(EmailData emailData);
    public String sendMailWithHTML_Body(EmailData emailData);
    public String sendMailWithDynamic_HTML_Body(EmailData emailData);

}
