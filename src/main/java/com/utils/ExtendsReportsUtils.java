package com.utils;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendsReportsUtils extends WebElement{

	static ExtentReports extent=null;
	File file=null;
	ExtentSparkReporter sparkReport=null;
	static ExtentTest extentTest =null;

	public ExtendsReportsUtils() {
		 extent=new ExtentReports();
		File file=new File(System.getProperty("user.dir")+"\\ExtentsReport\\eReport.html");
		ExtentSparkReporter sparkReport=new ExtentSparkReporter(file);
		extent.attachReporter(sparkReport);
	
	}
	
	public static void CreateTest(String TestName)
	{
		extent.createTest(TestName);
	}
	
	public static void flush()
	{
		extent.flush();
	}

	
	public static void pass(String testName)
	{
		
		extentTest.log(Status.PASS,"Test one Pass");
	}
	public  static void ex() throws IOException
	{
		ExtentReports extent=new ExtentReports();
		File file=new File(System.getProperty("user.dir")+"\\ExtentsReport\\eReport.html");
		ExtentSparkReporter sparkReport=new ExtentSparkReporter(file);
		extent.attachReporter(sparkReport);
	
			ExtentTest extentTest = extent.createTest("sachin");
		
		extentTest.log(Status.PASS,"Test one Pass");
		ExtentTest l = extent.createTest("sachin");
		l.log(Status.FAIL,"Test one Fail");
		//extentTest.addScreenCaptureFromPath(new WebElement().takeScreenshot_());
		
		
		
		extent.flush();
		Desktop.getDesktop().browse(file.toURI());
	}
	
}
