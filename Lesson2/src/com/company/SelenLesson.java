package com.company;

import com.thoughtworks.selenium.webdriven.commands.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Arsen on 04.08.15.
 */
public class SelenLesson {
    public static void slp(long sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Volumes/Macintosh HD/kyrsu/chromedriver");
        ChromeDriver ch= new ChromeDriver();
        ch.get("http://google.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(ch.getTitle());
       WebElement j=ch.findElementByName("q");
        j.sendKeys("Спорт");
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
