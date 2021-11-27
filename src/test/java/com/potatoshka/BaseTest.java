package com.potatoshka;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

import javax.swing.*;

import static com.potatoshka.Variables.*;

import java.util.concurrent.TimeUnit;

import static com.potatoshka.Variables.cookies;

public class BaseTest {
    public static WebDriver createDriver (){
        WebDriver driver = null;
        switch (Browser){
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Opera":
                driver = new OperaDriver();
                break;
            default:
                Assertions.fail("Incorrect driver");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Wait, TimeUnit.SECONDS);
        return driver;
    }
    static WebDriver driver = createDriver();

    public static void goTo(String url){

        switch (cookies){
            case 1:
                driver.manage().deleteAllCookies();
                driver.get(url);
                break;
            case 2:
                driver.get(url);
                break;
        }


    }
    public static void click(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
    }
    public static void inputField(String xpath,String keys)  {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.sendKeys(keys);
    }
    public static void close(){
        driver.quit();
    }

    public static String readURL(){
        return driver.getCurrentUrl();
    }
    public static boolean checkIfElementPresented(String xpath) {
        if (driver.findElements(By.xpath(xpath)).size() > 0) {
            return true;
        }
        return false;
    }

    public  String readPoPupText(){
        Alert alert = driver.switchTo().alert();
       return alert.getText();
    }

    public void submitPopUp(){
        submitPopUp();
    }





}
