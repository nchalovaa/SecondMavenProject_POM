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


    @FindBy(css="a[href='/upload']")
    WebElement upload;

    public FileUploadPage selectFileUploadButton() {
        click(upload);
        return new FileUploadPage(driver);
    }


    @FindBy(css="a[href='/dropdown']")
    WebElement dropdown;

    public DropDownPage selectDropDownButton() {
    click(dropdown);
        return new DropDownPage(driver);
    }

    @FindBy(css="a[href='/checkboxes']")
    WebElement checkboxes;

    public CheckBoxPage selectCheckBoxesButton() {
        click(checkboxes);
        return new CheckBoxPage(driver);
    }
}
