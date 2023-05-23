package com.e2etest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;

public class ButtonClickPage {
	
	public ConfigFileReader configFileReader;
	
	@FindBy(how=How.ID,using="doubleClickBtn")
	public static WebElement buttomDoubleClick;
	
	@FindBy(how=How.ID,using="doubleClickMessage")
	public WebElement msgDoubleClick;

	@FindBy(how=How.ID,using="doubleClickBtn")
	public static WebElement buttomRightClick;
	
	@FindBy(how=How.ID,using="rightClickBtn")
	public WebElement msgRightClick;
	
	public ButtonClickPage()
	{
		configFileReader=new ConfigFileReader();
		PageFactory.initElements(Setup.getDriver(), this);
	}
	
	public void connectapp()
	{
		Setup.getDriver().get("https://demoqa.com/buttons");
	}
	public void doubleClick()
	{
		Actions action=new Actions(Setup.getDriver());
		action.doubleClick(buttomDoubleClick).perform();
	}
	
	public void rightclick()
	{
		Actions action = new Actions(Setup.getDriver());
		action.contextClick(buttomRightClick).perform();
	}
	}
