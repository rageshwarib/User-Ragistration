package com.BridgeLabz.userRegistration;

import java.util.regex.Pattern;

public class UserRegistration {
    static String NamePattern = "^[A-Z][a-zA-Z]{2,}$";
    static String EmailPattern = "^[a-zA-z0-9]+.?[a-zA-z0-9]+?@[a-zA-Z0-9]+.[a-zA-Z]+.?[a-zA-Z]+?$";
    static String MobilePattern = "^[1-9]{2}[ ][0-9]{10}$";
    static String PasswordPattern = "^[a-zA-Z0-9]{8,}$";


    public boolean checkName(String UserName) {
        return Pattern.matches(NamePattern, UserName);
    }

    public boolean checkEmail(String Email) {
        return Pattern.matches(EmailPattern, Email);
    }

    public boolean checkMobileNumber(String MobileNumber) {
        return Pattern.matches(MobilePattern, MobileNumber);
    }

    public boolean checkPassword(String Password) {
        return Pattern.matches(PasswordPattern , Password);
    }
}

