package com.BridgeLabz.userRegistration;

import java.util.regex.Pattern;

public class UserRegistration {
    static String namePattern = "^[A-Z][a-zA-Z]{2,}$";

    public boolean checkName(String firstName) {
        return Pattern.matches(namePattern, firstName);
    }
}

