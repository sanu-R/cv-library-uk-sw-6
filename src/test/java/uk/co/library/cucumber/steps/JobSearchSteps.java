package uk.co.library.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I click on accepts cookies")
    public void iClickOnAcceptsCookies() {
        new HomePage().acceptCookies();
    }

    @And("I enter the job title {string}")
    public void iEnterTheJobTitle(String jobTitle ) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I enter the location {string}")
    public void iEnterTheLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("I select the distance {string}")
    public void iSelectTheDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("I click on more search options link")
    public void iClickOnMoreSearchOptionsLink() {

        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter the salary minimum {string}")
    public void iEnterTheSalaryMinimum(String salaryMin) {
        new HomePage().enterMinSalary(salaryMin);
    }

    @And("I enter the salary maximum {string}")
    public void iEnterTheSalaryMaximum(String salaryMax) {
        new HomePage().enterMaxSalary(salaryMax);
    }

    @And("I select the salary type {string}")
    public void iSelectTheSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("I select  the job type {string}")
    public void iSelectTheJobType(String jobType) {
        new  HomePage().selectJobType(jobType);
    }

    @And("I click on find jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("I verify the result {string}")
    public void iVerifyTheResult(String result) {

        Assert.assertEquals("Result text is not display",result,new ResultPage().verifyTheResults(result));
    }
}
