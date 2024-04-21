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


    @FindBy(css = "a[href='/windows/new']")
    WebElement newWindow;

    public NewBrowserWindowPage switchToNextWindow(int index) {
        click(newWindow);

        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));
        return this;

    }


    @FindBy(xpath = "//class[.='example']")
    WebElement example;

    public NewBrowserWindowPage verifyNewWindowMessage(String text) {

        Assert.assertTrue(shouldHaveText(example, text, 10));
        return  this;
    }
}

