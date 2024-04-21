package com.website.tests;

import com.website.pages.FileUploadPage;
import com.website.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new SidePanel(driver).selectFileUploadButton();
    }

    @Test
    public void fileUploadTest(){
        new FileUploadPage(driver).uploadFile("C:/Tools/1.png");
    }
}
