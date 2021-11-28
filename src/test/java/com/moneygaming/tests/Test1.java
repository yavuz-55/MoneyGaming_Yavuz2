package com.moneygaming.tests;


import com.moneygaming.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // get the page
        driver.get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");

    }
    @Test
    public void test1() throws InterruptedException {
        WebElement namebox= driver.findElement(By.cssSelector("#forename"));
        namebox.sendKeys( "Mike");
        WebElement surnameBox = driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        surnameBox.sendKeys("Smith");
        Thread.sleep(2000);
    }
    @AfterMethod
    public void tearDown(){
        driver.close();

    }

}
