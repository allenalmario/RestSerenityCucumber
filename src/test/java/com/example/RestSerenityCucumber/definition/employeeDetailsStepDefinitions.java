package com.example.RestSerenityCucumber.definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

import static org.hamcrest.Matchers.equalTo;

public class employeeDetailsStepDefinitions {

    private static final String url = "https://jsonplaceholder.typicode.com/todos/1";
    public Response response;

    @Given("I send a request to the endpoint")
    public void iSendARequestToTheEndpoint() {
        response = SerenityRest.given().contentType("application/json").header("Content-Type", "application/json").when().get(url);
    }

    @Then("The API should return status {int}")
    public void theAPIShouldReturnStatus(int status) {
        SerenityRest.restAssuredThat(response -> response.statusCode(status));
    }

//    @And("Response should contain employee name {string}")
//    public void responseShouldContainEmployeeName(String expectedEmployeeName) {
//        SerenityRest.restAssuredThat(response -> response.body("userId", equalTo(expectedEmployeeName)));
//    }

    @And("Response should contain employee name {int}")
    public void responseShouldContainEmployeeName(int num) {
        SerenityRest.restAssuredThat(response -> response.body("userId", equalTo(num)));
    }
}
