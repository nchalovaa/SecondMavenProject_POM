package com.website.tests;

import com.website.pages.DropDownPage;
import com.website.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new SidePanel(driver).selectDropDownButton();

    }

    @Test
    public void dropDownTest(){
        new DropDownPage(driver).selectOption("Option 1");
    }
}
