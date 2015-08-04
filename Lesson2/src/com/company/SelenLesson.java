package com.company;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Arsen on 04.08.15.
 */
public class SelenLesson {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Volumes/Macintosh HD/kyrsu/chromedriver");
        ChromeDriver ch= new ChromeDriver();
        ch.get("http://facebook.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ch.quit();

    }
}
