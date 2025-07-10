package com.TestBits.quiz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {

    protected WebDriver driver;
    protected String url = "https://timesheet.com";
    protected TimesheetPage timesheetPage;
    protected BasePage basePage;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        timesheetPage = new TimesheetPage();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();

    }
}
