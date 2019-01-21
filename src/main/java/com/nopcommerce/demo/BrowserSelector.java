package com.nopcommerce.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserSelector<cat> extends Utils {


    public static final String USERNAME = "kpnarola";
    public static final String ACCESS_KEY = "0e753eec-d8d9-4fb8-adc3-1dda7a3de2b7";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

    LoadProperty loadProperty = new LoadProperty();

    public void browserSetUp() {


        String browser = loadProperty.getProperty("browser");
        String sauceLab = loadProperty.getProperty("saucelab");


        if (sauceLab.equalsIgnoreCase("saucelab")) {


                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("browserName", "chrome");
                caps.setCapability("platform", "Windows 10");
                caps.setCapability("version", "69");
                try {
                    driver = new RemoteWebDriver(new URL(URL), caps);
                }catch (MalformedURLException e){e.printStackTrace();}
                driver.get("https://saucelabs.com/test/guinea-pig");
                System.out.println("title of page is: " + driver.getTitle());
                driver.get("https://demo.nopcommerce.com/");


            } else{
                if (browser.equalsIgnoreCase("firefox")) {

                    System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
                    System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
                    System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
                    driver = new FirefoxDriver();
                    driver.get(loadProperty.getProperty("url"));
                    driver.manage().window().maximize();
                } else if (browser.equalsIgnoreCase("chrome")) {

                    System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("disable-infobars");
                    options.addArguments("--disable-extensions");
                    options.addArguments("--disable-browserSelect-side-navigation");
                    options.addArguments("--incognito");
                    options.addArguments("--disable-blink-features=BlockCredentialdSubresources");

                    driver = new ChromeDriver(options);
                    driver.get(loadProperty.getProperty("url"));
                    driver.manage().window().maximize();
                } else if (browser.equalsIgnoreCase("ie")) {

                    System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
                    InternetExplorerOptions options = new InternetExplorerOptions();
                    options.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
                    options.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
                    driver = new InternetExplorerDriver(options);
                    driver.get(loadProperty.getProperty("url"));
                    driver.manage().window().maximize();
                } else {
                    System.out.println("Browser name is empty or typed wrong:" + browser);
                }
            }
        }
    }
}