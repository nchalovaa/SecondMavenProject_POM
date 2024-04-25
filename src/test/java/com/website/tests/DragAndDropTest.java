package com.website.tests;

import com.website.pages.DragAndDropPage;
import com.website.pages.DropDownPage;
import com.website.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new SidePanel(driver).clickDragAndDropButton();
    }

    @Test
    public void actionDragMeTest(){
        new DragAndDropPage(driver).actionDragMe().verifyNewLetterInColumnA("B");
    }

    @Test
    public void actionDragMeTestTwo(){
        new DragAndDropPage(driver).actionDragMe().verifyNewLetterInColumnB("A");
    }
}
