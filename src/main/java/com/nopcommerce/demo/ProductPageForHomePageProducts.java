package com.nopcommerce.demo;

import org.openqa.selenium.By;

public class ProductPageForHomePageProducts extends Utils {
    //buildYourOwnComputer
    By buildYourOwnComputerHddButton = By.id("product_attribute_3_6");
    By buildYourOwnComputerHddButtonAddToCartButton = By.id("add-to-cart-button-1");
    By buildYourOwnComputerHddButtonShoppingCartButton = By.xpath("//span[@class='cart-label']");
    //HTCOneM8AndroidL5_0Lollipop
    By addToCartButtonForHtcOneM8AndroidL5_0Lollipop = By.id("add-to-cart-button-18");
    By shoppingCartButtonForHtcOneM8AndroidL5_0Lollipop = By.xpath("//a[contains(text(),'shopping cart')]");
    //AppleMacBookPro13_Inch product
    By appleMacBookPro13_InchProductEmailAFriendButton = By.xpath("//input[@value='Email a friend']");

    public void buildYourOwnComputer() {
        //Selecting Hdd button in product Description
        clickOnElement(buildYourOwnComputerHddButton);

        //Clicking on add to cart button
        clickOnElement(buildYourOwnComputerHddButtonAddToCartButton);

        //Clicking on shopping cart button
        clickOnElement(buildYourOwnComputerHddButtonShoppingCartButton);

    }
    public void HTCOneM8AndroidL5_0Lollipop() {
        //Clicking on add to cart button
        clickOnElement(addToCartButtonForHtcOneM8AndroidL5_0Lollipop);

        explicitWait(shoppingCartButtonForHtcOneM8AndroidL5_0Lollipop,30);
        //Clicking on shopping cart button
        clickOnElement(shoppingCartButtonForHtcOneM8AndroidL5_0Lollipop);
    }

    public void AppleMacBookPro13_Inch(){
        //Clicking on Email a Friend button to send Product detail with Email
        clickOnElement(appleMacBookPro13_InchProductEmailAFriendButton);
    }
}
