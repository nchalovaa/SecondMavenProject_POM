package com.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DragAndDropPage extends BasePage{

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="column-a")
    WebElement columnA;

    @FindBy(id="column-b")
    WebElement columnB;
    public DragAndDropPage actionDragMe() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(columnA,columnB).perform();

        return this;
    }

    @FindBy(id="column-a")
    WebElement dropHere;
    public DragAndDropPage verifyNewLetterInColumnA(String letter) {
        Assert.assertTrue(shouldHaveText(dropHere,letter,1));
        return this;
    }

    @FindBy(id="column-b")
    WebElement dragMe;
    public DragAndDropPage verifyNewLetterInColumnB(String letter) {
        Assert.assertTrue(shouldHaveText(dragMe,letter,1));
        return this;
    }
}
