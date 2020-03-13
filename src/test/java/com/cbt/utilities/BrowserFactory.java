package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String browserName){
        if(browserName.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }else if(browserName.equalsIgnoreCase("safari")){
            return null;
        }else{
            return new ChromeDriver();
        }

    }
}
