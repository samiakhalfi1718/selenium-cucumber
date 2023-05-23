package com.e2etest.automation.step_definitions;

import com.e2etest.automation.page_objects.DragAndDropPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DragAndDropStepDefinition {
	DragAndDropPage dragAndDropPage;
	public DragAndDropStepDefinition()
	{
		dragAndDropPage=new DragAndDropPage();
	}
	@Given("Je me connecte a l application demoqa menu drag and drop")
	public void jeMeConnecteALApplicationDemoqaMenuDragAndDrop() {
		dragAndDropPage.connectToApp();
	}

	@When("Je glisse lelement et je la depose dans l enplacement prevus")
	public void jeGlisseLelementEtJeLaDeposeDansLEnplacementPrevus() {
		dragAndDropPage.dragAndDrop();
	}

	@Then("Je verifie le texte change dans le dropped")
	public void jeVerifieLeTexteChangeDansLeDropped() {
		dragAndDropPage.verifDropped();
	}

}
