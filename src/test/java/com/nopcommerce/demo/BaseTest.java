package com.nopcommerce.demo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {

    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void openBrowser() throws Exception{

        browserSelector.browserSelect();

//        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");
//        driver = new ChromeDriver();

        // Implicitly Wait for Driver
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //Maximising Browser
        driver.manage().window().fullscreen();

        driver.manage().deleteAllCookies();

        //Opening Url
      //  driver.get("https://demo.nopcommerce.com/");
    }
    @AfterMethod

    public void closeBrowser(ITestResult result){

        if (ITestResult.FAILURE==result.getStatus())
        {
            try {
                TakesScreenshot ts = (TakesScreenshot) driver;

                File source = ts.getScreenshotAs(OutputType.FILE);

                FileUtils.copyFile(source, new File("./Screenshots/" + result.getName() + ".png"));
                System.out.println("Screenshot taken");
            }
            catch (Exception e)
            {
                System.out.println("Exception while taking screenshot"+e.getMessage());
            }

        }


       driver.quit();
    }



}
