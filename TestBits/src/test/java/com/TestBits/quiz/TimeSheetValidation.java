package com.TestBits.quiz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TimeSheetValidation extends BaseTest{

    String username = "user1";
    String password = "test123";
    String timeSheetId = "ammarRoslan";
    String timeSheetDate = "01/11/2000";
    String timeSheetNote = "Working on project 2";
    String timeSheetHours = "2";

    @Test
    public void submitTimesheet(){
        timesheetPage.login(username,password);
        timesheetPage.goToTimesheet();
        timesheetPage.submitTimeSheet(timeSheetId,timeSheetDate,timeSheetNote,timeSheetHours);
        Assert.assertTrue(timesheetPage.getTimeSheetSubmissionMessage() == "Timesheet Successfully Submitted","Timesheet submission failed");

    }


}
