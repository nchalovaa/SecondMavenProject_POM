package com.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
}
