package com.saucedemo.pages;


import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.saucedemo.utils.BrowserFactory;
import com.saucedemo.utils.ExcelDataProvider;
import com.saucedemo.utils.Helper;

public class BaseClass {
	public WebDriver driver;
	
	public ExcelDataProvider excel;
	public ExtentSparkReporter sparkReport;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	@BeforeSuite
	public void setupSuite() {
		excel= new ExcelDataProvider();
		sparkReport = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/rep.html");
		sparkReport.config().setDocumentTitle("Sauce Demo Selenium Report");
		sparkReport.config().setReportName("Automation Script");
		sparkReport.config().setTheme(Theme.DARK);
		
		extent= new ExtentReports();
		extent.attachReporter(sparkReport);
		extent.setSystemInfo("Tester Name", "Madhuri");
		
	}
	
	@BeforeClass
	public void setup() {
		// static methods we can access by classname
		driver = BrowserFactory.startApplication(driver,"Chrome","https://www.saucedemo.com/v1/");
		System.out.println(driver.getTitle());
	}
	
	@AfterClass
	public void teardown() {
		// static methods we can access by classname
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void teardownsetup(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			String method=result.getName();
			Helper.CaptureScreenshot(driver,method);
			teardown();
			
		}
		
	}

}
