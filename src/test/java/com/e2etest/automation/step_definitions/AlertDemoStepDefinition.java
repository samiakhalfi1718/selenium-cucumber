package com.e2etest.automation.step_definitions;

import com.e2etest.automation.page_objects.AlertDemoPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertDemoStepDefinition {

	public AlertDemoPage alertDemoPage;
	public AlertDemoStepDefinition() {
		alertDemoPage =new AlertDemoPage();
	}
	@Given("Je me connecte a l application demoqa menu alerts")
	public void jeMeConnecteALApplicationDemoqaMenuAlerts() {
	    alertDemoPage.connectToApp();
	}
	@When("Je clique sur le bouton alertButton")
	public void jeCliqueSurLeBoutonAlertButton() throws InterruptedException {
	   
		alertDemoPage.clickAlert();
	}
	@Then("Je confirme l alerte")
	public void jeConfirmeLAlerte() {
	   alertDemoPage.confirmAlert();
	}
	@Then("je recupere le titre de la page")
	public void jeRecupereLeTitreDeLaPage() {
	    
	}
}
