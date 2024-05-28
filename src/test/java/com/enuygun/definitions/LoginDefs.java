package com.enuygun.definitions;

import com.enuygun.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.cdimascio.dotenv.Dotenv;
import org.junit.Assert;

public class LoginDefs {
    private LoginPage loginPage;
    private Dotenv dotenv;

    public LoginDefs() {
        this.loginPage = new LoginPage();
        this.dotenv = Dotenv.configure().filename(".env").load();
    }
    @Given("User enters registered email address")
    public void userEntersRegisteredEmailAddress() {
        loginPage.emailInput.sendKeys(dotenv.get("email"));
    }
    @And("User enters registered password")
    public void userEntersRegisteredPassword() {
        loginPage.passwordInput.sendKeys(dotenv.get("password"));
    }
    @And("User logs in")
    public void userLogsIn()  {
        loginPage.loginBtn.click();

        }
    @Then("Check that the user is logged in")
    public void checkThatTheUserIsLoggedIn() {
        Assert.assertTrue(loginPage.profile.isDisplayed());
    }
    @Given("User enters email address {string}")
    public void userEntersEmailAddress(String email) {
        loginPage.sendEmail(email);
    }
    @And("User enters password {string}")
    public void userEntersPassword(String password) {
        loginPage.sendPassword(password);
    }
    @And("The user is not logged in invalid{string}")
    public void theUserIsNotLoggedInInvalid(String message) {
        loginPage.loginBtn.click();
        Assert.assertEquals("Verify that toaster message is true", message, loginPage.invalidMessage.getText());
    }

    @Then("The user clears email input and password input")
    public void theUserClearsEmailInputAndPasswordInput() {
        loginPage.emailInput.clear();
        loginPage.passwordInput.clear();
    }
}