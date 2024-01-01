package com.upright.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

WebDriver driver;
// methods
String myBrowser;
    // Initialize the browser
    // different browser has it own driver... chromedriver, firefoxdriver (gecko driver)
    // iedriver, operadriver, safaridriver, edgedriver


    public void loadProperties() throws IOException {

        FileInputStream obj = new FileInputStream("/Users/bashiruddin/Documents/batch7Maven/src/test/java/com/upright/utility/info.properties");

        Properties prop = new Properties();

        prop.load(obj);
      myBrowser =   prop.getProperty("browser");
        System.out.println(myBrowser);

    }


    public void launchBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
            "/Users/bashiruddin/Documents/Batch-7/chromedriver-mac-x64/chromedriver");
    System.setProperty("webdriver.gecko.driver", "/Users/bashiruddin/Documents/Batch-7/geckodriver");

    // open the chrome browser

   if (myBrowser.equals("chrome")){
       driver = new ChromeDriver();
   }

   else if (myBrowser.equals("firefox")){
            driver = new FirefoxDriver();
        }

   else {
       System.out.println("Please Check your driver");
   }

   // driver.get("https://uprightforum.tech"); // it will wait till the page gets loaded

        driver.navigate().to("https://uprightforum.tech"); // it won't wait till the driver gets loaded

        driver.navigate().to("https://netflix.com");

         Thread.sleep(3000);
        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

     String myCurrentURL =   driver.getCurrentUrl();
        System.out.println(myCurrentURL);

      String myTitle =   driver.getTitle();
        System.out.println(myTitle);

       // Common interview questions... What are the differences between driver.get() vs navigate() ?
   // do research and find out this qa


        //  driver.manage().window().maximize();
    }


    public static void main(String[] args) throws InterruptedException, IOException {
        BaseClass obj = new BaseClass();
        obj.loadProperties();
        obj.launchBrowser();
    }


}
