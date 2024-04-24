package com.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class OpenLinkPage extends BasePage {

    public OpenLinkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/windows/new']") //  //class[.='example'] - //div[@class='example']
    WebElement newWindow;

    public NewBrowserWindowPage selectBrowserWindows() {

        click(newWindow);
        return new NewBrowserWindowPage(driver);
    }

}
