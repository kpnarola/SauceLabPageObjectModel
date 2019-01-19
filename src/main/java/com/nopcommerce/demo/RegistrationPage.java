package com.nopcommerce.demo;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    RegisterResultContinuePage registerResultContinuePage = new RegisterResultContinuePage();
    By genderMale = By.id("gender-male");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By dateOfBirthDayField = By.name("DateOfBirthDay");
    By dateOfBirthMonthField = By.name("DateOfBirthMonth");
    By daOfBirthYearField = By.name("DateOfBirthYear");
    By emailAddressField = By.id("Email");
    By companyNameField = By.id("Company");
    By newsletterBox = By.id("Newsletter");
    By passwordField = By.id("Password");
    By passwordConfirmationField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");

    public void registration() {

        //Click on gender
        clickOnElement(genderMale);

        //Click on First Name
        enterText(firstNameField,loadProperty.getProperty("firstName"));

        //Click on Last Name
        enterText(lastNameField,loadProperty.getProperty("lastName"));

        //Date of Birth Field

        //Input Date of Birth Day by using Text
//
        selectText(dateOfBirthDayField,loadProperty.getProperty("dateOfBirthDay"));

        //Input Date of Birth Month by using Index
        selectIndex(dateOfBirthMonthField,Integer.parseInt(loadProperty.getProperty("dateOfBirthMonth")));

        //Input Date of Birth Year
        selectValue(daOfBirthYearField,loadProperty.getProperty("dateOfBirthYear"));

        //For Enter email Id




        //Entering email id in the email field
        enterText(emailAddressField,loadProperty.getProperty("emailAddress")+dateStamp()+"@yahoo.com");

        //For Company Detail
        //Enter Company name
        enterText(companyNameField,loadProperty.getProperty("companyName"));

        //For Options - Click on Newsletters box
        clickOnElement(newsletterBox);

        //For Your Password Field - password for registration

        //Declaring variable for password
        String password = "test123";

        //Entering Password in Password field
        enterText(passwordField,loadProperty.getProperty("password"));

        //Confirming Password
        enterText(passwordConfirmationField,loadProperty.getProperty("password"));

        //Click on Registration Button
        clickOnElement(registerButton);

    }

}

