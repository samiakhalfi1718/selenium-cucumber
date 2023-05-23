package com.e2etest.automation.step_definitions;

import com.e2etest.automation.page_objects.DropDownListPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DropDownListStepDefinition {
	DropDownListPage dropDownListPage;

	public DropDownListStepDefinition() {
		dropDownListPage = new DropDownListPage();
	}

	@Given("Je me connecte a lapplication dropdownlist")
	public void jeMeConnecteALapplicationDropdownlist() {
		dropDownListPage.connectToApp();
	}

	@When("Je selectionne lindexe")
	public void jeSelectionneLindexe() {
		dropDownListPage.byIndex();
	}

	@When("Je selectionne la valeur")
	public void jeSelectionneLaValeur() {
		dropDownListPage.byValeur();
	}

	@When("Je selectionne le texte souhaite")
	public void jeSelectionneLeTexteSouhaite() {
		dropDownListPage.byTextDisplayed();
	}

	@Then("Je constate la valeur attendu")
	public void jeConstateLaValeurAttendu() {

	}
}
