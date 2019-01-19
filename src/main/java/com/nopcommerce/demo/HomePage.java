package com.nopcommerce.demo;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    By registrationButton = By.linkText("Register");
    By buildYourOwnComputerProduct = By.linkText("Build your own computer");
    By htcOneM8AndroidL50LollipopProduct = By.linkText("HTC One M8 Android L 5.0 Lollipop");
    By apparelCategory = By.linkText("Apparel");
    By clothingProduct = By.xpath("//img[@alt='Picture for category Clothing']");
    By appleMacbookPro13_InchProduct = By.linkText("Apple MacBook Pro 13-inch");
    By customerCurrencyDropDownMenu = By.id("customerCurrency");
    By currencyEuro  = By.xpath("//option[contains(text(),'Euro')]");
    By jewelryCategory = By.linkText("Jewelry");

    public void openHomePage() {

        //Open website homepage
        driver.get("https://demo.nopcommerce.com/");
    }

    public void clickOnRegistrationButton() {
        //Click on Register Button
        clickOnElement(registrationButton);
        assertByGetText("Your Personal Details", By.xpath("//strong[contains(text(),'Your Personal Details')]"), "You are not on Registration Page");
    }

    public void clickOnBuildYourOwnComputer() {
        //Select Product
        clickOnElement(buildYourOwnComputerProduct);
    }

    public void clickOnHTCOneM8AndroidL50Lollipop() {
        //Select Product
        clickOnElement(htcOneM8AndroidL50LollipopProduct);
    }

    public void clickOnAppareal() {
        clickOnElement(apparelCategory);
        //Clicking on Clothing
        clickOnElement(clothingProduct);
    }

    public void clickOnAppleMacBookPro13_Inch() {
        //Selecting Product Apple MavBook Pro 13-inch
        clickOnElement(appleMacbookPro13_InchProduct);
    }

    public void clickOnCurrencyEuroAndJewelry() {
        //Click on currency box and select euro
        driver.findElement(customerCurrencyDropDownMenu).findElement(currencyEuro).click();
        //Click on Jewelry category
        clickOnElement(jewelryCategory);
    }

    public void clickOnCurrencyUSDollarAndJewelry() {
        //Select currency USDollar
        clickOnElement(customerCurrencyDropDownMenu);
        //Click on Jewelry from category
        clickOnElement(jewelryCategory);
    }
}
