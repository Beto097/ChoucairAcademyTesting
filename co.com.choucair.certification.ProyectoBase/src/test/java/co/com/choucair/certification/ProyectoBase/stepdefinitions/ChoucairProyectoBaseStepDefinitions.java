package co.com.choucair.certification.ProyectoBase.stepdefinitions;

import co.com.choucair.certification.ProyectoBase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairProyectoBaseStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new Onlinecast());
    }
//HE ELIMINADO LAS TÍLDES

    @Given("^that brandon wants to learn automation at the academy Choucair$")
    public void thatBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());

    }


    @When("^he search for the course Recursos Automatización Bancolombia on the Choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform() {

    }

    @Then("^he finds the course called resources Recursos Automatización Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia() {

    }
}
