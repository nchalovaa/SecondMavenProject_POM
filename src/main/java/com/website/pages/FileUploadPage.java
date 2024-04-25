package com.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FileUploadPage extends BasePage{

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="file-upload")
    WebElement fileUpload;

    public FileUploadPage uploadFile(String path) {
        fileUpload.sendKeys(path);
        return this;
    }


    @FindBy(css = "h3")
    WebElement message;

    public FileUploadPage verifyMessage(String text) {
        Assert.assertTrue(message.getText().contains(text));
        return this;
    }


    @FindBy(id="file-submit")
    WebElement uploadButton;
    public FileUploadPage clickUploadButton() {
        click(uploadButton);
        return this;
    }
}
