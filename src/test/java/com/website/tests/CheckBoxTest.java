package com.website.tests;

import com.website.pages.CheckBoxPage;
import com.website.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new SidePanel(driver).selectCheckBoxesButton();
    }

    @Test
    public void CheckBoxTest(){
        new CheckBoxPage(driver).selectBoxes(new String[] {"checkbox 2"});
    }
}
