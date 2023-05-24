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

	@When("Je selectionne lindexe {string}")
	public void jeSelectionneLindexe(String index) {
		dropDownListPage.selectFromListByIndex(index);;
	}

	@When("Je selectionne la valeur {string}")
	public void jeSelectionneLaValeur(String valeur) {
		dropDownListPage.byValeur(valeur);
	}

	@When("Je selectionne le texte souhaite {string}")
	public void jeSelectionneLeTexteSouhaite(String text) {
		dropDownListPage.byTextDisplayed(text);
	}

	@Then("Je constate la valeur attendu")
	public void jeConstateLaValeurAttendu() {

	}



}
