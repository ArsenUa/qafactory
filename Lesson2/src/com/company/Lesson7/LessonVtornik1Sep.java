package com.company.Lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by Arsen on 01.09.15.
 */
public class LessonVtornik1Sep {

    public static void slp(long sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Volumes/Macintosh HD/kyrsu/chromedriver");
        ChromeDriver ch= new ChromeDriver();
        ch.get("https://strahovator.com.ua/kupit_strahovku/avtocivilka_avtograzhdanka_osago_oscpv");

        WebElement s =ch.findElementByXPath("//*[@id='ts_type']");

        Select sel = new Select (s);
        System.out.println(
                sel.getFirstSelectedOption().getText()
        );
                sel.selectByVisibleText("мотоцикл или мотороллер");



        Select det = new Select (ch.findElementByXPath("//*[@id='ts_details_type']"));
        det.selectByVisibleText("объем двигателя более 300 см³");


        Select reg = new Select (ch.findElementByXPath("//*[@id='ts_zone']"));
        reg.selectByVisibleText("Борисполь");

        Select stag = new Select (ch.findElementByXPath("//*[@id='no_crash_years_qty']"));
        stag.selectByVisibleText("меньше 1 года");

        Select vrem = new Select (ch.findElementByXPath("//*[@id='period']"));
        vrem.selectByVisibleText("7 месяцев");

        new Select (ch.findElementByXPath("//*[@id='dgo']")).selectByVisibleText("да, на 50 000 грн");



        slp(10);
        ch.quit();





    }
}
