package com.e2etest.automation.step_definitions;

import org.junit.Assert;
import com.e2etest.automation.page_objects.LoginPage;
import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	public LoginPage loginPage;
	public ConfigFileReader configFileReader;
	public LoginStepDefinition() {
		loginPage=new LoginPage();
		configFileReader=new ConfigFileReader();
	}
	
	@Given("Je me connecte a l application Swag Labs")
	public void jeMeConnecteALApplicationSwagLabs() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}
	@When("Je saisi le username {string}")
	public void jeSaisiLeUsername(String username) {
		loginPage.fillUsername(username);
	}
	@When("Je saisi le password {string}")
	public void jeSaisiLePassword(String password) {
		loginPage.fillPassword(password);
	}
	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		loginPage.clickOnLogin();
	}
	@Then("Je me redirige vers la page Home {string}")
	public void jeMeRedirigeVersLaPageHome(String title) {
		String titlePage=LoginPage.titlePage.getText();
		Assert.assertEquals(titlePage, title);
	}
}
