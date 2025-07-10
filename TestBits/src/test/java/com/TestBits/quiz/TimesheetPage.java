package com.TestBits.quiz;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TimesheetPage extends BasePage{

    //Elements in login & timesheet page
    By idField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type=\"submit\"]");
    By loginMessage = By.xpath("//div[text()=\"login notification\"]");
    By timeSheetButton = By.name("timesheet");
    By timeSheetId = By.name("timesheetid");
    By timeSheetDate = By.name("timesheetdate");
    By timeSheetNotes = By.name("timesheetnotes");
    By timeSheetHours = By.name("timesheethours");
    By timeSheetSubmit = By.name("submit");
    By timeSheetSubmissionMessage = By.name("submit-message");



    public void login(String id, String password){
        wait(idField);
        set(idField,id);
        set(passwordField,password);
        click(loginButton);
        if(find(loginMessage).getText() != "User successfully login"){
            Assert.fail("User fail to login");
        }
    }

    public void goToTimesheet(){
        wait(timeSheetButton);
        click(timeSheetButton);
    }

    public void submitTimeSheet(String username,String dates,String notes,String hours){
        set(timeSheetId,username);
        set(timeSheetDate,dates);
        set(timeSheetNotes,notes);
        set(timeSheetHours,hours);

        click(timeSheetSubmit);
    }

    public String getTimeSheetSubmissionMessage(){
        return find(timeSheetSubmissionMessage).getText();
    }


}
