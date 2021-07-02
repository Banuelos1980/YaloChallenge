package test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CustomerRegisterPage;
import pages.Guru99LoginPage;
import pages.Guru99ManagerPage;
import pages.Guru99NewCustomerPage;
import utilities.StartWebDriver;
import webObjests.SideBarWebObjects;

public class TestGuru99Login extends BaseTest
{
	@Test
	public void loginPage()
	{
		Guru99LoginPage loginPage = new Guru99LoginPage();
		loginPage.get_userIdLocator().sendKeys("mngr338292");
		loginPage.get_passwordLocator().sendKeys("nuhAdUn");
		Guru99ManagerPage managerPage = loginPage.goToManagerPage();
		Assert.assertTrue(managerPage.assertManagerPageIsDisplayed());
		SideBarWebObjects webObject = new SideBarWebObjects();
		webObject.clickOnMenuOption(1);
		//webObject.clickOnMenuOption("New Customer");
		
		Guru99NewCustomerPage customerPage = new Guru99NewCustomerPage();
		Assert.assertTrue(customerPage.assertAddNewCustomerPageIsDisplayed());
		customerPage.get_CustomerName().sendKeys("New Customer");
		customerPage.get_Gender().click();
		customerPage.get_DOB().sendKeys("01011979");
		customerPage.get_Address().sendKeys("105 Chesnut St");
		customerPage.get_City().sendKeys("Redwood City");
		customerPage.get_State().sendKeys("CA");
		customerPage.get_PIN().sendKeys("123456");
		customerPage.get_MobileNumber().sendKeys("3311215744");
		customerPage.get_Email().sendKeys("frando@gmail.com");
		customerPage.get_Password().sendKeys("Ferna@123.");
		
		CustomerRegisterPage registerPage = customerPage.goToCustomerRegisterPage();
		Assert.assertTrue(registerPage.assertRegistrationPageIsDisplayed());		
	}
}