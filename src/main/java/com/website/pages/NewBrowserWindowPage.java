package com.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class NewBrowserWindowPage extends BasePage {

    public NewBrowserWindowPage(WebDriver driver) {
        super(driver);
    }


    public NewBrowserWindowPage switchToNextWindow(int index) {

        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));
        return this;

    }


    @FindBy(css = ".example")
    WebElement example;

    public NewBrowserWindowPage verifyNewWindowMessage(String text) {

        Assert.assertTrue(shouldHaveText(example, text, 10));
        return  this;
    }

}

