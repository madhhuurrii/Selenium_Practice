package com.saucedemo.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.saucedemo.pages.BaseClass;

public class Helper extends BaseClass {
	
	// Screenshots, alert, frames, windows, Sync issues, javascript executors etc
	
	public static void CaptureScreenshot(WebDriver driver,String method) {
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			
			FileHandler.copy(src, new File("./Screenshots/"+method+".png"));
			System.out.print("Screenshot Captured!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		
	}
	public void HandleFrames() {
			
		}

}
