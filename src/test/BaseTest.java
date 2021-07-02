package test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utilities.BrowserType;
import utilities.ConfigReader;
import utilities.Settings;
import utilities.StartWebDriver;

public class BaseTest extends StartWebDriver
{
	@BeforeSuite
	public void init() throws IOException
	{
		ConfigReader.settingsPopulate();
		openBrowser(Settings.browser, Settings.url);
	}
	
//	@AfterSuite
//	public void tearDown()
//	{
//		if(driver != null)
//		{
//			driver.close();
//			driver.quit();
//		}
//	}	
}
