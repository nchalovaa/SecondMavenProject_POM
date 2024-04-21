package com.website.tests;

import com.website.pages.OpenLinkPage;
import com.website.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenLinkPageTest extends TestBase{


    @BeforeMethod
    public void precondition() {
        new SidePanel(driver).selectMultiplyWindows();
    }

}
