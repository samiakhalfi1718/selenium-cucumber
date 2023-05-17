package com.e2etest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.Setup;

public class LogoutPage {
	/* Retrieve Element*/
	@FindBy(how=How.XPATH,using="//*[@id=\"react-burger-menu-btn\"]")
	public static WebElement btnBurger;
	
	@FindBy(how=How.ID,using="logout_sidebar_link")
	public static WebElement btnLogout;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Swag Labs')]")
	public static WebElement titlePage;
	
	//initialisation des elements
	public LogoutPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
	
	/*Methods*/
	public void clickOnBtnBurger() {
		btnBurger.click();
	}
	
	public void clickOnLogout() {
		btnLogout.click();
	}
}
