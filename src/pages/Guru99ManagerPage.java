package pages;

import java.util.ArrayList;

//Aswertion 
	//assert.True(managerpage.getTitle().contains("manager");
	//conmtructor
	//ManagerPage(WebDriver driver){ this.driver = driver }
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import utilities.StartWebDriver;

public class Guru99ManagerPage extends StartWebDriver
{
	By _managerPage = By.xpath("//a[text()='Manager']");
	By _customerID = By.xpath("//td[text()='Manger Id : ']");
	By _imageOne = By.cssSelector("img[src='../images/1.gif']");
	
	public boolean assertManagerPageIsDisplayed()
	{
		return driver.findElement(_managerPage).isDisplayed();
	}	
		
}
