package com.thd.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUtils
{
    WebDriver driver = null;
    By searchItem = By.xpath(".//input[@id='headerSearch']");
    By searchButton = By.xpath(".//button[@id='headerSearchButton']");
    By landingPage = By.xpath(".//span[@class='original-keyword u__regular']");
    
    public SeleniumUtils(){ }
    
    public boolean setUP()
    {
        try{
            System.setProperty("webdriver.chrome.driver", "C:/Users/sxb8085/MavenCucumberTestNG/chromedriver.exe");
            driver = new ChromeDriver();
            return true;
        }
        catch(Exception ex)
        {
            return false;
        }
    }
    
    public boolean cleanUP()
    {
        try
        {
            driver.close();
            return true;
        }
        catch(Exception ex)
        {
            return false;
        }
    }
    
    public boolean navigatePage()
    {
        try
        {
            driver.get("http://www.homedepot.com");
            Thread.sleep(3000);
            return true;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean searchForItem(String arg1)
    {
        try
        {
            driver.findElement(searchItem).sendKeys(arg1);
            
            Thread.sleep(1000);
            
            driver.findElement(searchButton).click();
            
            Thread.sleep(6000);
            
            return true;
        }
        catch(Exception ex)
        {
            return false;
        }
    }
    
    
    public boolean validateLandingPage(String arg1)
    {
        String searchStr = driver.findElement(landingPage).getText();
            
        if(searchStr.contains(arg1))
        {
           return true;
        }
        else
        {
            return false;
        }
    }
}
