package com.enuygun.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.enuygun.helpers.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//input[@name='_email']")
    public WebElement emailInput;
    @FindBy(css = ".MuiInputBase01201")
    public WebElement passwordInput;
    @FindBy(css = ".MuiButton01221")
    public  WebElement loginBtn;
    @FindBy(css = ".MuiFormHelperText01254")
    public WebElement invalidMessage;
    @FindBy(css = ".px-3")
    public  WebElement profile;

    public void sendEmail(String email) {
        emailInput.sendKeys(email);
    }
    public void sendPassword(String password) {
        passwordInput.sendKeys(password);
    }
}
