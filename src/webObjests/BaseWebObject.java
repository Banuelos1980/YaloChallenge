package webObjests;

import java.util.List;

import org.openqa.selenium.WebElement;

import utilities.StartWebDriver;

public class BaseWebObject extends StartWebDriver
{
	private WebElement context;
	
	public BaseWebObject(WebElement context) 
	{
		this.context = context;
	}

	public WebElement getContext() 
	{
		return context;
	}
}
