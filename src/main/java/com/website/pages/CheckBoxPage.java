package com.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends BasePage {
    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = ".//*[text()=' checkbox 1']")
    WebElement checkboxOne;

    @FindBy(xpath = ".//*[text()=' checkbox 2']")
    WebElement checkboxTwo;

    public CheckBoxPage selectBoxes(String[] options) {
        for (int i = 0; i < options.length; i++) {
            if (options[i].equals("checkbox 1")) {
                click(checkboxOne);
            } if (options[i].equals("checkbox 2 ")) {
                click(checkboxTwo);
            }
        }
        return this;
    }
}
