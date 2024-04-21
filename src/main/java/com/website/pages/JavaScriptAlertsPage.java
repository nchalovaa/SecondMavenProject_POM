package com.website.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class JavaScriptAlertsPage extends BasePage{

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//button[.='Click for JS Alert']")
    WebElement buttonWithJsAlert;

    public boolean alertWithJs() {
        click(buttonWithJsAlert);
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.alertIsPresent());
        if (alert == null) {
            return false;
        } else {
            driver.switchTo().alert();
            alert.accept();
            return true;
        }
    }


    @FindBy(xpath = "//button[.='Click for JS Confirm']")
    WebElement buttonWithJsConfirm;

    public JavaScriptAlertsPage SelectResult(String confirm) {
        click(buttonWithJsConfirm);
        if(confirm != null && confirm.equals("Ok")) {
            driver.switchTo().alert().accept();

        } else if(confirm != null && confirm.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id="result")
    WebElement result;

    public JavaScriptAlertsPage verifyResult(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }

    @FindBy(xpath = "//button[.='Click for JS Prompt']")
    WebElement buttonForJsPromt;

    public JavaScriptAlertsPage sendMessageToAlert(String message) {
    click(buttonForJsPromt);

    if(message != null) {
        driver.switchTo().alert().sendKeys(message);
        driver.switchTo().alert().accept();
    }
        return this;
    }

    @FindBy(id="result")
    WebElement resultThird;

    public JavaScriptAlertsPage verifyMessage(String text) {
        Assert.assertTrue(resultThird.getText().contains(text));
        return this;
    }
}
