package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");//<---change to different browsers.
        driver.get("http://www.google.com");
        String title = driver.getTitle();
        driver.navigate().to("www.etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        String title3 = driver.getTitle();
        StringUtilities.verifyEquals(title,title3);
        driver.navigate().forward();
        String title4 = driver.getTitle();
        StringUtilities.verifyEquals(title2,title4);
        driver.quit();
    }
}
