package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    RegistrationPage register = new RegistrationPage();
    RegisterResultContinuePage registerResultContinuePage = new RegisterResultContinuePage();
    HomePage homePage = new HomePage();
    EmailAFriendPage emailAFriend = new EmailAFriendPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    ClothingPage productPage = new ClothingPage();
    AddToCartPage addToCartPage = new AddToCartPage();
    JewelryPage jewelryPage = new JewelryPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    ClothingPage clothingPage = new ClothingPage();
    ProductPageForHomePageProducts productPageForHomePageProducts = new ProductPageForHomePageProducts();

    @Test(priority = 0)
    public void toVerifyUserShouldBeAbleToRegisterSuccessfully() {
        //click on registration button in home page
        homePage.clickOnRegistrationButton();

        //register an account
        register.registration();

        //Verify the registration successful message
        Utils.assertByGetText("Your registration completed", By.xpath("//div[contains(text(),'Your registration completed')]"), "Sorry your registration is not successful");

    }

    @Test(priority = 1)

    public void toVerifyRegisteredUserShouldBeAbleToSendEmailWithProductSuccessfully() {
         /* /*https://demo.nopcommerce.com/
      click on Apple MacBook Pro 13-inch - email a friend -fill up required details and click on Send Email button
      Registered user should be able to send Email with product Successfully*/
         //click on registration button
        homePage.clickOnRegistrationButton();
        // register
        register.registration();
        //continue on registration button
        registerResultContinuePage.clickOnRegisterContinueButton();
        //click on product apple mac book from home page
        homePage.clickOnAppleMacBookPro13_Inch();
        //apple macbook product page
        productPageForHomePageProducts.AppleMacBookPro13_Inch();
        //click on email a friend button from product
        emailAFriend.emailAFriendForRegisterUser();
        // verify result
        Utils.assertByGetText("Your message has been sent.", By.xpath("//div[@class= 'result']"), "Sorry You are not able to send email successfully");
    }

    @Test(priority = 5)

    public void toVerifyUnregisteredUserShouldNotBeAbleToSendEmail() {
        //click on product apple mac book from home page
        homePage.clickOnAppleMacBookPro13_Inch();
        //click on email a friend button for product apple mac book
        emailAFriend.emailAFriendForUnRegisterUser();
        Utils.assertByGetText("Only registered customers can use email a friend feature", By.xpath("//li[contains(text(),'Only registered customers can use email a friend feature')]"), "Display Message is not as per expected, test is failed");
    }

    @Test(priority = 3)
    public void toVerifyUserMustHaveToAcceptTermsAndConditionForCheckOut() {
        //click on register button from the home page
        homePage.clickOnRegistrationButton();
        //process registration
        register.registration();
        //click on register continue button
        registerResultContinuePage.clickOnRegisterContinueButton();
        //select product build your own computer from home page
        homePage.clickOnBuildYourOwnComputer();
        productPageForHomePageProducts.buildYourOwnComputer();
        //add product to basket and proceed checkout
        shoppingCartPage.clickCheckOutButton();
        //verify result
        Utils.assertByGetText("Please accept the terms of service before the next step.", By.xpath("//p[contains(text(),'Please accept the terms of service before the next step.')]"), "Display message is not as per expected, Test failed"
        );
    }

    @Test(priority = 2)
    public void toVerifyRegisteredUserShouldBeAbleToBuyAnySingleProductSuccessfully() {
        //click on register button from home page
        homePage.clickOnRegistrationButton();
        //proceed registration
        register.registration();
        //click on registration continue button
        registerResultContinuePage.clickOnRegisterContinueButton();
        //select on product HTCOneM8AndroidL50Lollipop from home page
        homePage.clickOnHTCOneM8AndroidL50Lollipop();
        productPageForHomePageProducts.HTCOneM8AndroidL5_0Lollipop();
        //add product in basket and accept terms and condition
        shoppingCartPage.clickOnTermsOfService();
        //click on  check out
        shoppingCartPage.clickCheckOutButton();
        //proceed check out
        checkOutPage.userIsAbleToBuyProductSuccessfully();
        //verify result
        Utils.assertByGetText("Your order has been successfully processed!", By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"), "You are not able to buy product successfully, test failed");
    }

    @Test(priority = 4)
    public void toVerifyUserShouldBeAbleToSortByPriceHighToLow() {
        //click on apparel category from home page
        homePage.clickOnAppareal();
        //click on clothing and sort by price high to low from drop down menu
        clothingPage.sortBYPriceHighToLOw();
        //verifying that clothing price sorting high to low
        System.out.println(clothingPage.assertForSortByPriceHighToLow());
        //compare result
        Assert.assertTrue(clothingPage.assertForSortByPriceHighToLow(),"Price is not sorted high to low");

    }

    @Test(priority = 5)
    public void toVerifyUserShouldBePricesSortingLowToHigh() {
        //click on Apparel category on home page
        homePage.clickOnAppareal();
        //click on clothing and sort by price low to high
        clothingPage.sortByProductLowToHIgh();
        //result comparision
        clothingPage.assertForSortByPriceLowToHigh();


    }

    @Test
    public void toVerifyAddToCartButtonIsPresentInAllProductOnHomePage() {
        //open home page
        homePage.openHomePage();
       // verify add to cart list is present in all home page products
        Assert.assertTrue(addToCartPage.setAddToCartLIst(),"add to card button is not displayed");
    }

    @Test
    public void toVerifyCustomerCurrencyIsEuro() {
        //select customer currency to the euro and click on jewelry category
        homePage.clickOnCurrencyEuroAndJewelry();
        //verify result for euro sing is present in all the products
         Assert.assertTrue(jewelryPage.assertForCurrencyIsEuro(),
                 "Euro sign may be not present with one of the price or all the price ");
    }

    @Test
    public void toVerifyCustomerCurrencyIsDollar() {
        //select customer currency is dollar on home page and click on jewelry page
        homePage.clickOnCurrencyUSDollarAndJewelry();
        //To verify $ sign is present with prices on the jewellery page
        Assert.assertTrue(jewelryPage.assertForCurrencyUSDollar(),
                "Dollar sign may be not present with one of the price or all the price    ");
    }
}