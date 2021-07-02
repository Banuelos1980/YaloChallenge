package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.StartWebDriver;

public class Guru99NewCustomerPage extends StartWebDriver
{
	By _addNewCustomerLabel = By.xpath("//p[text()='Add New Customer']");
	By _customerName = By.cssSelector("[onblur='validatecustomername();']");
	By _gender = By.cssSelector("input[value='f']");
	By _dateOfBirth = By.id("dob");
	By _address = By.cssSelector("[name='addr']");
	By _city = By.cssSelector("[name='city']");
	By _state = By.cssSelector("input[name='state']");
	By _PIN = By.cssSelector("input[onkeyup='validatePIN();']");
	By _mobileNumber = By.name("telephoneno");
	By _email = By.name("emailid");
	By _password = By.xpath("//input[@type='password']");
	By _submit = By.cssSelector("[value='Submit']");
	
	
	public boolean assertAddNewCustomerPageIsDisplayed()
	{
		return driver.findElement(_addNewCustomerLabel).isDisplayed();
	}
	public WebElement get_CustomerName() 
	{
		return driver.findElement(_customerName);
	}
	public WebElement get_Gender() 
	{
		return driver.findElement(_gender);
	}
	public WebElement get_DOB() 
	{
		return driver.findElement(_dateOfBirth);
	}
	public WebElement get_Address() 
	{
		return driver.findElement(_address);
	}
	public WebElement get_City() 
	{
		return driver.findElement(_city);
	}
	public WebElement get_State() 
	{
		return driver.findElement(_state);
	}
	public WebElement get_PIN() 
	{
		return driver.findElement(_PIN);
	}
	public WebElement get_MobileNumber() 
	{
		return driver.findElement(_mobileNumber);
	}
	public WebElement get_Email() 
	{
		return driver.findElement(_email);
	}
	public WebElement get_Password() 
	{
		return driver.findElement(_password);
	}
	public WebElement get_Submit() 
	{
		return driver.findElement(_submit);
	}
	public CustomerRegisterPage goToCustomerRegisterPage()
	{
		get_Submit().click();
		return new CustomerRegisterPage();
	}
}
