package com.website.tests;

import com.website.pages.BrokenImagesPage;
import com.website.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImagesTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new SidePanel(driver).clickBrokenImagesButton();
    }

    @Test
    public void isImageBrokenTest(){
        new BrokenImagesPage(driver).checkBrokenPictures();
    }
}
