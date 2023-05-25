package com.e2etest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;
import com.e2etest.automation.utils.Validations;

public class BouletCorpPage {
	
	
	public ConfigFileReader configFileReader;
	@FindBy(how = How.XPATH, using = "//body/div[@id='page-wrap']/div[@id='page']/div[@id='main']/div[@id='tabvanilla']/div[@id='note_browser']/div[@id='centered_nav']/a[3]")
	public static WebElement aleatoir;
	
	@FindBy(how = How.CSS, using ="#network_social > ul > li:nth-child(2) > a > img")
	public static WebElement widgetFB;
	
	//div[@id='network_social']//img[contains(@src,'twiter')]]
	@FindBy(how = How.CSS, using ="#network_social > ul > li:nth-child(1) > a > img")
	public static WebElement widgetTw;
	
	@FindBy(how = How.CSS, using ="#network_social > ul > li:nth-child(4) > a > img")
	public static WebElement widgetTumblr;
	
	@FindBy(how = How.CSS, using ="#network_social > ul > li:nth-child(3) > a > img")
	public static WebElement widgetYt;

	public BouletCorpPage() {
		configFileReader = new ConfigFileReader();
		PageFactory.initElements(Setup.getDriver(), this);
	}

	public void meConnecter() {
		Setup.getDriver().get(configFileReader.getProperties("bouletcorp.url"));
	}

	public void clickAleatoire() {
		aleatoir.click();
	}
	
	public void verifPageChange()
	{
		String actualUrl=Setup.getDriver().getCurrentUrl();
		System.out.println("Title of page is " + actualUrl);
		String url=configFileReader.getProperties("bouletcorp.url");
		if(actualUrl.equals(url))
		{
			System.out.println("Failed - The URL is not changed");
		}
		else {
			System.out.println("Succesfull - The URL is changed");
		}
	}

}
