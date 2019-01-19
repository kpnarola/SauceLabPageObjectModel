package com.nopcommerce.demo;

import org.openqa.selenium.By;

public class RegisterResultContinuePage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    By registrationContinueButton = By.name("register-continue");

    public void clickOnRegisterContinueButton()
    {
        clickOnElement(registrationContinueButton);
    }
}
