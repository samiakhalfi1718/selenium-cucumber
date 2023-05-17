package com.e2etest.automation.step_definitions;

import org.junit.Assert;

import com.e2etest.automation.page_objects.LogoutPage;
import com.e2etest.automation.utils.Setup;
import com.e2etest.automation.utils.ConfigFileReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {

	public LogoutPage logoutPage;

	public LogoutStepDefinition() {
		logoutPage = new LogoutPage();
	}
	
	@When("Je clique sur le burguer menu button")
	public void jeCliqueSurLeBurguerMenuButton() {
		LogoutPage.btnBurger.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("Je clique sur le bouton Logout")
	public void jeCliqueSurLeBoutonLogout() {
		logoutPage.clickOnLogout();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Je me redirige vers la page login {string}")
	public void jeMeRedirigeVersLaPageLogin(String titleLogo) {
		String title_logo_page = LogoutPage.titlePage.getText();
		Assert.assertEquals(title_logo_page, titleLogo);
	}

}
