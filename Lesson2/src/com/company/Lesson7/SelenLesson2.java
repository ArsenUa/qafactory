package com.company.Lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Arsen on 04.08.15.
 */
public class SelenLesson2 {
    public static void slp(long sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Volumes/Macintosh HD/kyrsu/chromedriver");
        ChromeDriver ch= new ChromeDriver();
        ch.get("http://angel.net/~nic/passwd.current.html");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(ch.getTitle());
       WebElement j=ch.findElementByXPath("//html/");
        j.sendKeys("mypass");
        slp(2);
//        j.sendKeys(Keys.ENTER);
        ch.findElementByName("btnG").click();
        slp(3);
        WebElement d=ch.findElementByClassName("srg");
        List<WebElement> res = d.findElements(By.tagName("a"));
        WebElement res1=res.get(1);
            System.out.println(res1.getText());
        res1.click();



        slp(7);
        ch.quit();


    }
    
}
