package com.company.Lesson7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Arsen on 08.09.15.
 */
public class TetsHelper {
    public static WebDriver drv;

    public static void setup () {
        System.setProperty("webdriver.chrome.driver", "/Volumes/Macintosh HD/kyrsu/chromedriver");
        drv =  new ChromeDriver();
    }

        public static void setup (String abs)
    {
        setup();
        drv.get(abs);
    }
    public static void slp(long sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
    }
