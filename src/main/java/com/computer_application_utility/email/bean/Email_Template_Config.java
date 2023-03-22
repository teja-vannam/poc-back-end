package com.computer_application_utility.email.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Email_Template_Config {
    @Id
    @Column
    private String Id;
    @Column
    private String applicationName;
    @Column
    private String templateName;
    @Column
    private String dynamic_email_body;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getDynamic_email_body() {
        return dynamic_email_body;
    }

    public void setDynamic_email_body(String dynamic_email_body) {
        this.dynamic_email_body = dynamic_email_body;
    }

    @Override
    public String toString() {
        return "Email_Template_Config{" +
                "Id='" + Id + '\'' +
                ", applicationName='" + applicationName + '\'' +
                ", templateName='" + templateName + '\'' +
                ", dynamic_email_body='" + dynamic_email_body + '\'' +
                '}';
    }
}
