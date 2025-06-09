package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.selenium.utils.BrowserFactory;
import com.selenium.utils.ExcelDataProvider;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataProvider excel;
	
	public ExtentSparkReporter sparkReport;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeSuite
	public void beforeSetup() {
		excel = new ExcelDataProvider();
		sparkReport = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/rep.html");
		sparkReport.config().setDocumentTitle("Sauce Demo Selenium Report");
		sparkReport.config().setReportName("Automation Script");
		sparkReport.config().setTheme(Theme.DARK);
		
		extent= new ExtentReports();
		extent.attachReporter(sparkReport);
		extent.setSystemInfo("Tester Name", "Madhuri");
		
	}
	
	@BeforeClass
	public void setup() {
		driver= BrowserFactory.startApplication(driver, "Chrome", "https://www.flipkart.com/");
	}
	
	@AfterClass
	public void teardown() {
		BrowserFactory.quitBrowser(driver);
	}

}
