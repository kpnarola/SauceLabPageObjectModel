package com.nopcommerce.demo;

import org.openqa.selenium.By;

public class CheckOutPage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    By selectCountryField = By.id("BillingNewAddress_CountryId");
    By cityNameField = By.id("BillingNewAddress_City");
    By firstLineOfAddressField = By.id("BillingNewAddress_Address1");
    By secondLineOfAddressField = By.id("BillingNewAddress_Address2");
    By postalCodeField = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberField = By.id("BillingNewAddress_PhoneNumber");
    By faxNumberField = By.id("BillingNewAddress_FaxNumber");
    By continueButtonForShippingMethod = By.xpath("//input[@onclick='Billing.save()']");
    By optionGroundFromShippingMethod = By.id("shippingoption_0");
    By continueButtonForPaymentMethod = By.xpath("//input[@onclick='ShippingMethod.save()']");
    By creditCardOptionFromPaymentMethod = By.id("paymentmethod_1");
    By continueButtonForPaymentInformation = By.xpath("//input[@onclick='PaymentMethod.save()']");
    By cardHolderNameField = By.id("CardholderName");
    By cardNumberField = By.id("CardNumber");
    By expireMonthDropDowndForCreditCard = By.id("ExpireMonth");
    By expireYearDropDownForCreditCard = By.id("ExpireYear");
    By sortCodeField = By.id("CardCode");
    By continueButtonForOrderConfirmation = By.xpath("//input[@onclick=\"PaymentInfo.save()\"]");
    By confirmOrderButton = By.xpath("//input[@onclick=\"ConfirmOrder.save()\"]");

    public void userIsAbleToBuyProductSuccessfully() {

        //Select country for billing adress
        selectText(selectCountryField,loadProperty.getProperty("countryName"));

        //Enter city name
        enterText(cityNameField,loadProperty.getProperty("cityName"));

        //Enter first line of address
        enterText(firstLineOfAddressField,loadProperty.getProperty("firstLineOfAddress"));

        //Enter Second line of message
        enterText(secondLineOfAddressField,loadProperty.getProperty("secondLineOfAddress"));

        //Enter postal code
        enterText(postalCodeField,loadProperty.getProperty("postalCode"));

        //Enter phone number
        enterText(phoneNumberField,loadProperty.getProperty("phoneNumber"));

        //Enter Fax number
        enterText(faxNumberField,loadProperty.getProperty("faxNumber"));

        //Click on continue button for shipping method
        clickOnElement(continueButtonForShippingMethod);

        //Step - 3 Shipping Method

        //Click on first option Ground from Shipping method
        clickOnElement(optionGroundFromShippingMethod);

        //Click on continue button for Payment Method
        clickOnElement(continueButtonForPaymentMethod);

        //Step-4 Payment method

        //Click on Credit Card option
        clickOnElement(creditCardOptionFromPaymentMethod);

        //Click on continue button for payment information
        clickOnElement(continueButtonForPaymentInformation);

        //Step 5- Payment Information

        //Enter card holder name
        enterText(cardHolderNameField,loadProperty.getProperty("cardHolderName"));

        //Enter Card number
        enterText(cardNumberField,loadProperty.getProperty("cardNumber"));

        //Entering Expire month for Credit card
        selectText(expireMonthDropDowndForCreditCard,loadProperty.getProperty("expireMonth"));

        //Entering Expire Year
        selectText( expireYearDropDownForCreditCard,loadProperty.getProperty("expireYear"));

        //Entering short code
        enterText(sortCodeField,loadProperty.getProperty("sortCode"));

        //Clicking on Continue button for order confirmation
        clickOnElement(continueButtonForOrderConfirmation);

        //Step 6-Confirm Order

        //Clicking on Confirm Order button
        clickOnElement(confirmOrderButton);

           }

}

