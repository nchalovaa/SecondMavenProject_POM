package com.website.tests;

import com.website.pages.JavaScriptAlertsPage;
import com.website.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptAlertsTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new SidePanel(driver).selectJavaScriptAlertsItem();
    }

    @Test
    public void clickForJsAlertTest(){
        new JavaScriptAlertsPage(driver).alertWithJs();
    }

    @Test
    public void clickForJsAlertWithSelectTest(){
        new JavaScriptAlertsPage(driver).SelectResult("Ok").verifyResult("Ok");
    }

    @Test
    public void sendMessageToAlertTest(){
   new JavaScriptAlertsPage(driver).sendMessageToAlert("Hello world!").verifyMessage("Hello world");

    }
}
