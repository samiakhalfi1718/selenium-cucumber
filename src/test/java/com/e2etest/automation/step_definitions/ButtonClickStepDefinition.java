package com.e2etest.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.e2etest.automation.page_objects.ButtonClickPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ButtonClickStepDefinition {

	public ButtonClickPage buttonClickPage;

	public ButtonClickStepDefinition() {
		buttonClickPage = new ButtonClickPage();
	}

	@Given("Je me connecte a l application demoqa menu boutton")
	public void jeMeConnecteALApplicationDemoqaMenuBoutton() {
		buttonClickPage.connectapp();
	}

	@When("Je clique sur le bouton double click")
	public void jeCliqueSurLeBoutonDoubleClick() {
		buttonClickPage.doubleClick();
	}

	@Then("Le message de confirmation doubleclick {string}")
	public void leMessageDeConfirmationDoubleclick(String string) {

		String msg1 = buttonClickPage.msgDoubleClick.getText();
		Assert.assertEquals("You have done a double click", msg1);
		System.out.println("botton is double clicked");
	}

	@When("Je clique sur le bouton right click")
	public void jeCliqueSurLeBoutonRightClick() {
		buttonClickPage.rightclick();
	}

	@Then("Le message de confirmation rightclick {string}")
	public void leMessageDeConfirmationRightclick(String string) {
		String msg2 = buttonClickPage.msgRightClick.getText();
		Assert.assertEquals("Right Click Me", msg2);
		System.out.println("botton is right clicked");
	}

}
