package com.nopcommerce.demo;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    By checkOutButton = By.id("checkout");
    By termsOfServiceButton = By.id("termsofservice");

//Add
    public void clickCheckOutButton()

    {
        clickOnElement(checkOutButton);
    }

    public void clickOnTermsOfService(){clickOnElement(termsOfServiceButton);}
}

