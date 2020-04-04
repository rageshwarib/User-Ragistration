package com.BridgeLabz.userRegistration;

import java.util.regex.Pattern;

public class UserRegistration {
    static String NamePattern = "^[A-Z][a-zA-Z]{2,}$";
    static String EmailPattern = "^[a-zA-z0-9]+.?[a-zA-z0-9]+?@[a-zA-Z0-9]+.[a-zA-Z]+.?[a-zA-Z]+?$";


    public boolean checkName(String UserName) {
        return Pattern.matches(NamePattern, UserName);
    }

    public boolean checkEmail(String Email) {
        return Pattern.matches(EmailPattern, Email);
    }
}

