package co.com.choucair.certification.ProyectoBase.stepdefinitions;

import co.com.choucair.certification.ProyectoBase.questions.Answer;
import co.com.choucair.certification.ProyectoBase.tasks.Login;
import co.com.choucair.certification.ProyectoBase.tasks.OpenUp;
import co.com.choucair.certification.ProyectoBase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairProyectoBaseStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
//HE ELIMINADO LAS TILDES
    //NO TENGO ACCESO AL CURSO DEL EJEMPLO, LUEGO PUEDO CAMBIARLO (TOMARIA UN TIEMPO PARA HACERLO)

    @Given("^that brandon wants to learn automation at the academy Choucair$")
    public void thatBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),(Login.onThepage()));

    }

                                    //Guías Técnicas - Analista Financial
    @When("^he search for the course (.*) on the Choucair academy platform$")
    public void heSearchForTheCourseMetodologíaBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }
                                    //Guías Técnicas - Analista Financia
    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesMetodologíaBancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
