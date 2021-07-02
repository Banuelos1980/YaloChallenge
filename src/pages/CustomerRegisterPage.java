package pages;

import org.openqa.selenium.By;

import utilities.StartWebDriver;

public class CustomerRegisterPage extends StartWebDriver
{
	By _customerRegistered = By.xpath("//p[text()='Customer Registered Successfully!!!']");
	
	public boolean assertRegistrationPageIsDisplayed()
	{
		return driver.findElement(_customerRegistered).isDisplayed();
	}	
		
}
