package webObjests;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SideBarWebObjects extends BaseWebObject
{
	private By menuOptions = By.cssSelector("li");
	private static By ContextMenu = By.cssSelector(".menusubnav");

	public SideBarWebObjects() 
	{
		super(driver.findElement(ContextMenu));
	}
	
	private List<WebElement> getMenuOptions()
	{
		return getContext().findElements(menuOptions);
	}
	public void clickOnMenuOption(int index) 
	{
		getMenuOptions().get(index).click();
		
	}
	public void clickOnMenuOption(String text) 
	{
		for(int i = 0; i < getMenuOptions().size(); i++) 
		{
			if(getMenuOptions().get(i).getText().equalsIgnoreCase(text)) 
			{
				getMenuOptions().get(i).click();
			}
		}	
//		WebElement ele = getMenuOptions().stream().filter(i -> i.getText().equalsIgnoreCase(text)).findFirst().orElse(null);
//		System.out.println(ele.getText());
//		ele.click();
	}
}
