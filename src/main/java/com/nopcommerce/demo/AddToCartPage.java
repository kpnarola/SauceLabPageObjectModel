package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class AddToCartPage extends Utils {
    LoadProperty loadProperty = new LoadProperty();

    By allAddToCartButtonInProductList = By.cssSelector(".item-box .product-box-add-to-cart-button");

    public boolean setAddToCartLIst() {

        //Object declaration for SoftAssert
        SoftAssert softAssert = new SoftAssert();

        //select add to cart button from products by using cssSelector
        List<WebElement> addToCartLIst = driver.findElements(allAddToCartButtonInProductList);
        boolean addToCartButtonIsDisplayed = false;
        //System.out.println(addToCartLIst.size());
        for (WebElement al : addToCartLIst) {

            softAssert.assertEquals(al.getAttribute("value"), "Add to cart");
            // button = Collections.singletonList(al.getAttribute("value"));
            //System.out.println(al.getAttribute("value"));
            if (al.isDisplayed()) {
                addToCartButtonIsDisplayed = true;
            } else {
                addToCartButtonIsDisplayed = false;
                break;
            }
        }
        softAssert.assertAll();

        return addToCartButtonIsDisplayed;
    }
}
