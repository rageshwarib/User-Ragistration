package com.BridgeLabz.userRegistration;

import java.util.regex.Pattern;

public class UserRegistration {
    static String NamePattern = "^[A-Z][a-zA-Z]{2,}$";
    static String EmailPattern = "^[\\w]+.?[\\w]+?@[\\w]+.[a-zA-Z]+.?[a-zA-Z]+?$";
    static String MobilePattern = "^[a-zA-Z0-9]*[A-Z]+$";
    static String PasswordPattern = "^[\\w](?=.*[A-Z]).{8,}$";

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

