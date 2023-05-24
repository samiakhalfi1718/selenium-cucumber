package com.e2etest.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.SelectFromListUtils;
import com.e2etest.automation.utils.Setup;

public class DropDownListPage {
	
	public ConfigFileReader configFileReader;
	private SelectFromListUtils selectFromListUtils;
	WebDriver driver = Setup.getDriver();
	
	@FindBy(how = How.ID, using = "oldSelectMenu")
	public static WebElement selectMenu;
	
	public DropDownListPage()
	{
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
		selectFromListUtils = new SelectFromListUtils();
	}
	
	public void connectToApp() {
		Setup.getDriver().get(configFileReader.getProperties("dropDownList.url"));
	}

	public void selectFromListByIndex(String index)
	{
		int index1  =Integer.parseInt(configFileReader.getProperties("home.index"));
		selectFromListUtils.selectDropDownListByIndex(selectMenu, index1);
	}
	public void byValeur(String valeur)
	{
		String value =configFileReader.getProperties("home.valeur");
		selectFromListUtils.selectDropDownListByValue(selectMenu, value);
	}
	public void byTextDisplayed(String text)
	{
		String text1 =configFileReader.getProperties("home.text");
		selectFromListUtils.selectDropDownListByVisibleText(selectMenu, text1);
	}
	
}
