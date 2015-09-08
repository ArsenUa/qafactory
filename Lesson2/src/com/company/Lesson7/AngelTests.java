package com.company.Lesson7;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Arsen on 03.09.15.
 */
public class AngelTests {

    @Before
    public void before() {
        TetsHelper.setup(AngelPage.url);
    }

    @Test
    public void test1() {
        TetsHelper.setup();
        AngelPage.setMaster("masterPass");
        AngelPage.setSitename("google.com");
        AngelPage.generate();
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test3() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("gmail.com");
        AngelPage.generate();
        Assert.assertEquals("mKJAakDvwbhi6@1a", AngelPage.getPassword());
        TetsHelper.slp(5);
    }
    @Test
    public void test4(){
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("gmail.com");
        AngelPage.setMaster(Keys.ENTER.toString());
        Assert.assertEquals("mKJAakDvwbhi6@1a", AngelPage.getPassword());
        TetsHelper.slp(5);
    }

    @After
    public void exit(){
        TetsHelper.drv.quit();
    }
}





//
//    @Test
//    public void test2() {
//        System.setProperty("webdriver.chrome.driver", "/Volumes/Macintosh HD/kyrsu/chromedriver");
//        ChromeDriver drv = new ChromeDriver();
//        drv.get("http://angel.net/~nic/passwd.current.html");
//        setMaster2("qwe123", drv);
//        setSitename2("gmail.com", drv);
//        enter(drv);
//        drv.quit();
//    }
//
//
//    public static void setMaster2(String value, WebDriver driver) {
//        driver.findElement(
//                By.xpath("//input[@name='master']")
//        ).sendKeys(value);
//    }
//    public static void setSitename2(String value, WebDriver driver) {
//        driver.findElement(
//                By.xpath("//input[@name='site']")
//        ).sendKeys(value);
//    }
//
//    public static void enter(WebDriver driver) {
//        driver.findElement(
//                By.xpath("//input[@name='site']")
//        ).sendKeys(Keys.ENTER);
//        Assert
//
//
//
//
//}

