package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.StartWebDriver;

public class Guru99LoginPage extends StartWebDriver
{
	By _guru99BankLocator = By.xpath("Guru99 Bank");
	By _userIdLocator = By.cssSelector("input[name='uid']");
	By _passwordLocator = By.cssSelector("input[name='password']");
	By _loginButtonLocator = By.cssSelector("input[name='btnLogin']");
	
	public WebElement get_guru99BankLocator() 
	{
		return driver.findElement(_guru99BankLocator);
	}
	public WebElement get_userIdLocator() 
	{
		return driver.findElement(_userIdLocator);
	}
	public WebElement get_passwordLocator() 
	{
		return driver.findElement(_passwordLocator);
	}
	public WebElement get_loginButtonLocator() 
	{	
		return driver.findElement(_loginButtonLocator);
	}
	//ESte metodo te regresa on Objeto de tipo manager page 
	public Guru99ManagerPage goToManagerPage()
	{
		get_loginButtonLocator().click();
		return new Guru99ManagerPage();
	}	
}
