package com.enuygun.definitions;

import com.enuygun.helpers.Driver;
import com.enuygun.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.cdimascio.dotenv.Dotenv;
import org.junit.jupiter.api.Assertions;

public class HomeDefs {
    private HomePage homePage;
    private Dotenv dotenv;

    public HomeDefs(){
        this.homePage = new HomePage();
        this.dotenv = Dotenv.configure().filename(".env").load();
    }

    @Given("User goes to the enuygun page")
    public void userGoesToTheEnuygunPage(){
        Driver.get().get(this.dotenv.get("url"));
    }

    @Then("It is checked that the homepage is open")
    public void itIsCheckedThatTheHomepageIsOpen() {
        String enuygunUrl = Driver.get().getCurrentUrl();
        System.out.println(enuygunUrl);
        Assertions.assertTrue(enuygunUrl.equals(this.dotenv.get("url")));
    }

    @When("User clicks to the buy button")
    public void userClicksToTheBuyButton() {
        this.homePage.homeLoginBtn.click();
            try {
                Thread.sleep(3000); // 3 saniye bekleme
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
