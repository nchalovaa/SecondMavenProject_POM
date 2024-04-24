package com.website.tests;

import com.website.pages.NewBrowserWindowPage;
import com.website.pages.OpenLinkPage;
import com.website.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewBrowserWindowTest extends TestBase {

        @BeforeMethod
        public void precondition(){
            new SidePanel(driver).selectMultiplyWindows();

        }

        @Test
    public void NewWindowsTest(){
            new OpenLinkPage(driver).selectBrowserWindows();
            new NewBrowserWindowPage(driver).switchToNextWindow(1).verifyNewWindowMessage("New Window");
        }
}
