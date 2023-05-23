package com.e2etest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.Setup;

public class AlertDemoPage {
	
	@FindBy(how = How.ID, using = "alertButton")
	public static WebElement alertButton;

	public AlertDemoPage(){
		PageFactory.initElements(Setup.getDriver(), this);
	}
	
	public void connectToApp() {
		Setup.getDriver().get("https://demoqa.com/alerts");
	}
	
	public void clickAlert() {
		alertButton.click();
	}
	
	public void confirmAlert() {
		Setup.getDriver().switchTo().alert().accept();
		String title=Setup.getDriver().getTitle();
		System.out.println("title of page is :" + title);
	}
}