package com.BridgeLabz.userRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTests {
    @Test
    public void givenValidFirstName_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.checkName("NameR"));
    }

    @Test
    public void givenInvalidFirstName_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.checkName("cat"));
    }
    @Test
    public void givenValidLastName_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.checkName("NameR"));
    }

    @Test
    public void givenInvalidLastName_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.checkName("cat"));
    }
    @Test
    public void givenValidEmail_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.checkEmail("abc.100@yahoo.com"));
    }
    @Test
    public void givenInvalidEmail_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.checkEmail("abc..2002@gmail.com"));
    }
    @Test
    public void givenValidMobileFormat_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.checkMobileNumber("91 9876543210"));
    }
    @Test
    public void givenInvalidMobileFormat_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.checkMobileNumber("91320162568"));
    }
    @Test
    public void givenValidPasswordFormat_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.checkPassword("Abcd4EF&h"));
    }
    @Test
    public void givenInvalidPasswordFormat_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.checkPassword("abc$%dEFgh"));
    }
}
