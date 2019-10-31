package Automation_MyStore;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs extends Utils {

    VerificationPage verificationPage = new VerificationPage();
    HomePage homePage = new HomePage();
    SingInPage singInPage = new SingInPage();
    RegisterPage registerPage = new RegisterPage();
    WomenPage womenPage = new WomenPage();

    @Given("user is on homepage")
    public void userIsOnHomepage() {
        verificationPage.homepage();
    }

    @When("user click on sign in button")
    public void user_click_on_sign_in_button() {
        homePage.signin();
    }

    @When("enter email address")
    public void enter_email_address() {
        singInPage.createaccount();
    }

    @And("create account button")
    public void createAccountButton() {
        singInPage.clickoncreateaccount();
    }

    @When("enter all details")
    public void enter_all_details() {
        registerPage.userEntersAllDetails();
    }

    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
        verificationPage.userShouldbeOnAccountPage();
    }

    @When("user click on women category")
    public void userClickOnWomenCategory() {
        womenPage.clickOnWomen();

    }

    @And("click on dresses")
    public void clickOnDresses() {
        womenPage.clickOnDressess();
    }

    @Then("user able to scroll page down")
    public void userAbleToScrollPageDown() {
        womenPage.scrollPage();
    }
//
//    @Then("user should able to see welcome message")
//    public void user_should_able_to_see_welcome_message() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }


}