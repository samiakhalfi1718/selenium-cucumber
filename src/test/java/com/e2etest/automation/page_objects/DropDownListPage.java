package com.e2etest.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;

public class DropDownListPage {
	public ConfigFileReader configFileReader;
	WebDriver driver = Setup.getDriver();
	
	@FindBy(how = How.ID, using = "oldSelectMenu")
	public static WebElement selectMenu;
	public Select dropDownList;
	
	public DropDownListPage()
	{
		configFileReader=new ConfigFileReader();
		PageFactory.initElements(Setup.getDriver(), this);
		dropDownList=new Select(selectMenu);
	}
	
	public void connectToApp() {
		Setup.getDriver().get("https://demoqa.com/select-menu");
	}
	
	public void byIndex()
	{
		dropDownList.selectByIndex(5);
	}
	public void byValeur()
	{
		dropDownList.selectByValue("9");
	}
	public void byTextDisplayed()
	{
		dropDownList.selectByVisibleText("Yellow");
	}
	
}
