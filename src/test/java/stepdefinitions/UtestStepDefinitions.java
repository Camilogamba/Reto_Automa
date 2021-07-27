package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UtestData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.OpenUp;
import tasks.Register;

import java.util.List;

public class UtestStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given ("^than Camilo wants to enter the web site uTest$")
    public void thanCamiloWantsToEnterTheWebSiteUTest() {
        OnStage.theActorCalled("Camilo").wasAbleTo(OpenUp.thepage());
    }


    @When ("^he registers on the platform$")
    public void heRegistersOnThePlatform(List<UtestData> utestData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Register.onThePage(utestData.get(0).getStrFirstNa(), utestData.get(0).getStrLastNa(), utestData.get(0).getStrMail(), utestData.get(0).getstrModel(), utestData.get(0).getStrSystem(), utestData.get(0).getStrDevice(), utestData.get(0).getStrPass()));
    }

    @Then ("^he registers successfully$")
    public void heRegistersSuccessfully() {
    }
}
