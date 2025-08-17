package com.autoationscript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.beust.jcommander.Parameter;
import com.pom.HeaderPom;
import com.pom.LoginPOM;
import com.utils.ExtendsReportsUtils;

public class SuperClass {
	public  ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	
	
	public static WebDriver drive=null;
	//ExtentReports extent=new ExtentReports();
	ExtendsReportsUtils extent=new ExtendsReportsUtils();
	
	@BeforeMethod
	//@Parameters("browser")
	public void openbrowser()
	{
		try {
			drive=new ChromeDriver();
	
		
		driver.set(drive);
		driver.get().manage().window().maximize();}
		catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
			// TODO: handle exception
		}
				
		
	}
	
	@AfterMethod
	public void quiteBrowser()
	{
		driver.get().quit();
		
	}
	
//	WebDriver d=
//	new ChromeDriver();
	
	
}
