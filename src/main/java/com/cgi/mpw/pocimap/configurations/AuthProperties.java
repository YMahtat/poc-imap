package com.cgi.mpw.pocimap.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AuthProperties {

    @Value("${ms-confidential.user.email}")
    private String userEmail;

    @Value("${ms-confidential.user.password}")
    private String userPassword;


    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }



    @Override
    public String toString() {
        return "AuthProperties{" +
                ", userEmail='" + this.getUserEmail() + '\'' +
                ", userPassword='" + this.getUserPassword() + '\'' +
                '}';
    }
}
