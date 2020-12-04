package starter.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchForm;
import starter.search.SearchResult;

import javax.swing.text.View;

import java.lang.reflect.Type;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;
import static starter.matchers.StringContainsIgnoringCase.containsIgnoringCase;

public class SearchOnDuckDuckGoStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) is on the wordpress opensourcecms login page")
    public void log_in_on_the_wordpress_page(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.logInWordpressPage());
    }


    @When("she/he introduce his user {string}")
    public void search_for_user(String term) {

        withCurrentActor(
                SearchFor.user(term)
        );
    }


    @Then("she/he introduce his password {string}")
    public void search_for_password(String term) {
        withCurrentActor(
                SearchFor.password(term)
        );
    }

    @Then("she/he press the button log in")
    public void press_button_log_in() {
        withCurrentActor(
                SearchFor.pressLogInBtn()
        );
    }

    @And("she/he press the button Posts")
    public void press_button_post() {
        withCurrentActor(
                SearchFor.pressPostBtn()
        );
    }

    @And("she/he press the button Add New of Posts module")
    public void press_button_add_post() {
        withCurrentActor(
                SearchFor.pressAddPostBtn()
        );
    }

    @Then("she/he type the Post title {string}")
    public void add_post_title( String title) {
        withCurrentActor(
                SearchFor.addPostTitle(title)
        );
    }

    @Then("she/he press the button Publish of Posts module")
    public void add_post_paragraph() {
        withCurrentActor(
                SearchFor.pressBtnPublishPost()
        );
    }

    @Then("she/he press the button to Publish the Posts")
    public void publish_post_paragraph() {
        withCurrentActor(
                SearchFor.publishPost()
        );
    }

    @And("she/he press the button to View the Post and see the title {string}")
    public void press_button_view_post(String title) {
        withCurrentActor(
                SearchFor.pressBtnViewPost()
        );
    }
}
