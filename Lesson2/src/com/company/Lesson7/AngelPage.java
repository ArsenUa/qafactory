package com.company.Lesson7;

import org.openqa.selenium.By;

/**
 * Created by Arsen on 08.09.15.
 */
public class AngelPage {
    public static String url="http://angel.net/~nic/passwd.current.html";

    public static void setMaster(String value) {
        TetsHelper.drv.findElement(
                By.xpath("//input[@name='master']")
        ).sendKeys(value);
    }

    public static void setSitename(String value) {
        TetsHelper.drv.findElement(
                By.xpath("//input[@name='site']")
        ).sendKeys(value);

    }

    public static void generate() {
        TetsHelper.drv.findElement(
                By.xpath("//input[@value='Generate']")
        ).click();
    }

    public  static String getPassword() {
        return TetsHelper.drv.findElement(
                By.xpath("//input[@name='password']")
        ).getAttribute("value");
    }
}
