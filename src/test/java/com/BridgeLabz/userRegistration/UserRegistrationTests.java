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
}
