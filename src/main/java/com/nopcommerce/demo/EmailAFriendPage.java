package com.nopcommerce.demo;

import org.openqa.selenium.By;

public class EmailAFriendPage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    By friendEmailField = By.id("FriendEmail");
    By personalMessageField = By.id("PersonalMessage");
    By sendEmailButton = By.name("send-email");
    // unregistered user
    By emailAFriendButton = By.xpath("//input[@value='Email a friend']");
    By personalEmailAddressField = By.id("YourEmailAddress");

    public void emailAFriendForRegisterUser() {

        //Enter Friends Email Address
        enterText(friendEmailField,loadProperty.getProperty("friend'sEmail"));

        //Enter Personal Message
        enterText(personalMessageField,loadProperty.getProperty("personalMessage"));

        //Click on send email button
        clickOnElement(sendEmailButton);

    }

    public void emailAFriendForUnRegisterUser() {
        //Click on email a friend button from the selected product
        clickOnElement(emailAFriendButton);

        //Enter friend's email address
        enterText(friendEmailField,loadProperty.getProperty("friend'sEmail"));

        //Enter my email address
        enterText(personalEmailAddressField,loadProperty.getProperty("personalEmailAddress"));

        //Enter personal message
        enterText(personalMessageField,loadProperty.getProperty("personalMessage"));;

        //Click on send email button
        clickOnElement(sendEmailButton);
    }
}
