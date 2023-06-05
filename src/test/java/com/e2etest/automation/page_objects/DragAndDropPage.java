package com.e2etest.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;

public class DragAndDropPage {
	
	public ConfigFileReader configFileReader;
	WebDriver driver = Setup.getDriver();
	
	@FindBy(how = How.ID, using = "draggable")
	public static WebElement source;
	
	@FindBy(how = How.ID, using = "droppable")
	public static WebElement target;
	
	public DragAndDropPage() {
		configFileReader=new ConfigFileReader();
		PageFactory.initElements(Setup.getDriver(), this);
	}
	public void connectToApp() {
		driver.get(configFileReader.getProperties("dropurl.url"));
	}
	public void dragAndDrop()
	{
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}
	public void verifDropped()
	{
		String textTarget = target.getText();
		if (textTarget.equals("Dropped!")) {
			System.out.println("Pass: source is dropped to target expected");
		} else
			System.out.println("Fail: source is not be dropped to target expected");
	}
}
