package com.website.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDownPage extends BasePage{

    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="dropdown")
    WebElement dropdown;

    public DropDownPage selectOption(String option) {
        click(dropdown);
        dropdown.sendKeys(option);
        dropdown.sendKeys(Keys.ENTER);
        return this;
    }


}
