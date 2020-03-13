package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                                          "http://practice.cybertekschool.com/dropdown",
                                          "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");//<---change to different browsers.
        driver.get("http://practice.cybertekschool.com/");
        String title = driver.getTitle();
        driver.navigate().to("http://practice.cybertekschool.com/dropdown");
        String title2 = driver.getTitle();
        driver.navigate().to("http://practice.cybertekschool.com/login");
        String title3 = driver.getTitle();
        StringUtilities.verifyEquals(title,title2);
        StringUtilities.verifyEquals(title2,title3);
        driver.quit();

    }
}
