package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import stepDefinitions.Hooks;

/**
 * Created by vinayak on 4/10/2017.
 */

public class ScreenshotUtility implements ITestListener{
    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        captureScreenshot(result, "pass");

    }

    @Override
    public void onTestFailure(ITestResult tr) {
        captureScreenshot(tr, "fail");
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }


    public void captureScreenshot(ITestResult result, String status){

        String destDir = "";
        String passfailMethod = result.getClass().getSimpleName() + "." + result.getClass().getName();
        // To capture screenshot.
        File scrFile = ((TakesScreenshot) Hooks.driver).getScreenshotAs(OutputType.FILE);
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
        // If status = fail then set folder name "screenshots/Failures"
        if (status.equalsIgnoreCase("fail")) {
            destDir =   "screenshots/Failures";
        }
        // If status = pass then set folder name "screenshots/Success"
        else if (status.equalsIgnoreCase("pass")) {
            destDir =  "screenshots/Failures";
        }

        // To create folder to store screenshots
        new File(destDir).mkdirs();
        // Set file name with combination of test class name + date time.
        String destFile = passfailMethod + " - " + dateFormat.format(new Date()) + ".png";

        try {
            // Store file at destination folder location
            FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
