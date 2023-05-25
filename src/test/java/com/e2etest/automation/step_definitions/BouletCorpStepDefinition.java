package com.e2etest.automation.step_definitions;

import com.e2etest.automation.page_objects.BouletCorpPage;
import com.e2etest.automation.utils.Setup;
import com.e2etest.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BouletCorpStepDefinition {

	public BouletCorpPage bouletCorpPage;
	private Validations validations;

	public BouletCorpStepDefinition() {
		bouletCorpPage = new BouletCorpPage();
		validations = new Validations();
	}

	@Given("Je me connecte sur lapplication bouletcorp")
	public void jeMeConnecteSurLapplicationBouletcorp() {
		bouletCorpPage.meConnecter();
	}

	@When("Je clique sur aleatoire")
	public void jeCliqueSurAleatoire() {
		bouletCorpPage.clickAleatoire();
	}

	@Then("la page change")
	public void laPageChange() {
		bouletCorpPage.verifPageChange();
	}

	@Then("les widgets facebook twitter et tumblr sont bien affiches")
	public void lesWidgetsFacebookTwitterEtTumblrSontBienAffiches() {
		String currentURL = Setup.getDriver().getCurrentUrl();
		Setup.getDriver().navigate().to(currentURL);
		System.out.println(currentURL);
		validations.isElementDisplayed(BouletCorpPage.widgetFB);
		validations.isElementDisplayed(BouletCorpPage.widgetTumblr);
		validations.isElementDisplayed(BouletCorpPage.widgetTw);
		validations.isElementDisplayed(BouletCorpPage.widgetYt);
	}

}
