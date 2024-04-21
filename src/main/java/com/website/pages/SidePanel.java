package com.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SidePanel extends BasePage{

    public SidePanel(WebDriver driver) {
        super(driver);
    }


    @FindBy(css="a[href='/javascript_alerts']")
    WebElement javascriptAlert;

    public SidePanel selectJavaScriptAlertsItem() {
    clickWithJs(javascriptAlert,0,600);
        return new SidePanel(driver);
    }


    @FindBy(css="a[href='/windows']")
    WebElement windowsOpen;

    public OpenLinkPage selectMultiplyWindows() {
        clickWithJs(windowsOpen,0,600);
        return new OpenLinkPage(driver);
    }

}
