package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com","https://westelm.com/");

        WebDriver driver = BrowserFactory.getDriver("chrome");//<---change to different browsers.
        driver.get("https://lulugandgeorgia.com");
        String title = driver.getTitle();
        if(title.toLowerCase().contains("lulugandgeorgia")){
            System.out.println("LulugAndGeorgia Passed!");
        }else{
            System.out.println("LulugAndGeorgia Failed!");
        }
        driver.quit();

        driver.get("https://wayfair.com/");
        String title2 = driver.getTitle();
        if(title2.toLowerCase().contains("wayfair")){
            System.out.println("Wayfair Passed!");
        }else{
            System.out.println("Wayfair Failed!");
        }
        driver.quit();

        driver.get("https://walmart.com");
        String title3 = driver.getTitle();
        if(title3.toLowerCase().contains("walmart")){
            System.out.println("walmart Passed!");
        }else{
            System.out.println("walmart Failed!");
        }
        driver.quit();

        driver.get("https://westelm.com/");
        String title4 = driver.getTitle();
        if(title4.toLowerCase().contains("westelm")){
            System.out.println("westelm Passed!");
        }else{
            System.out.println("westelm Failed!");
        }
        driver.quit();
    }
}
