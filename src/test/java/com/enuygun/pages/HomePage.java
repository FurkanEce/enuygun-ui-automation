package com.enuygun.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.enuygun.helpers.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(id = "ctx-LoginBtn")
    public WebElement homeLoginBtn;
}