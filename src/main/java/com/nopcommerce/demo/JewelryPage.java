package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class JewelryPage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    By allJewelryProduct = By.cssSelector(".item-box .actual-price");

    SoftAssert softAssert = new SoftAssert();

    public boolean assertForCurrencyIsEuro() {
        boolean euroSingIsPrecent = false;

        //Select list of item with price
        List<WebElement> jewelryPriceList = driver.findElements(allJewelryProduct);

        //To get total element size System.out.println(jewelryPriceList.size());
        for (WebElement al : jewelryPriceList) {
            System.out.println(al.getText().substring(0, 1));
            if (al.getText().substring(0, 1).equalsIgnoreCase("Ђ")){
                euroSingIsPrecent = true;
                System.out.println(al.getText().substring(0, 1));
            }else {
                euroSingIsPrecent = false;
                break;
            }

                //Result Verification
            softAssert.assertEquals("Ђ", al.getText().substring(0, 1));
        }
        softAssert.assertAll();
        return euroSingIsPrecent;
    }

    public boolean assertForCurrencyUSDollar() {
        //Select list of product with price
        List<WebElement> jewelryPriceList = driver.findElements(allJewelryProduct);

        boolean dollarSignIsPresent = false;
        for (WebElement al : jewelryPriceList) {
            //Excrete Dollar sing by using substring
            if (al.getText().substring(0, 1).equalsIgnoreCase("$")) {
                dollarSignIsPresent = true;
                System.out.println(al.getText().substring(0, 1));
            } else {
                dollarSignIsPresent = false;
                break;
            }

            //Result Verification
            softAssert.assertEquals("$", al.getText().substring(0, 1));
        }
        softAssert.assertAll();
        return dollarSignIsPresent;
    }
}

