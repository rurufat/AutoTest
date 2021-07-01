package com.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestBase {
    static WebDriver wd;
    @BeforeSuite
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wd.get("http://automationpractice.com/index.php");
    }
    public void clickLoginLink(){
        click(By.cssSelector("[class='login']"));
    }
    public void AccCreation(){
        type(By.cssSelector("[name='email_create']"), "qa22raf@gmail.com");
        click(By.cssSelector("[class='btn btn-default button button-medium exclusive']"));
    }
    public void fillLoginFrom(String userName, String gender, int data) {
        try
        {
            click(Gender(gender));
        }
        catch(NullPointerException e)
        {
            System.out.println("wrong data");
        }
        type(By.cssSelector("[name='customer_firstname']"), userName);
        click(By.id("days"));

        click(By.xpath("//*[@id='days']/option["+data+"]"));
    }
    public By Gender(String gen){
        By locator = null;
        if(gen=="M"){
            locator = By.id("id_gender1");
        }else if(gen=="F"){
            locator = By.id("id_gender2");
        }
        return locator;
    }

    public void pause(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);

    }
}
