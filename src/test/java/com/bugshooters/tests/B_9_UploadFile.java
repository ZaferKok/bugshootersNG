package com.bugshooters.tests;

import com.bugshooters.utilities.AllPages;
import com.bugshooters.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B_9_UploadFile extends TestBase {

    AllPages allPages = new AllPages();

    @Test
    public void uploadFileTest(){
        driver.get("https://the-internet.herokuapp.com/upload");
        String filePath = "C:\\Users\\CIMBOM\\Desktop\\logo9.png";
        allPages.fileUploadPage().chooseFileButton.sendKeys(filePath);
        allPages.fileUploadPage().uploadButton.click();
        Assert.assertEquals(allPages.fileUploadPage().textMessage.getText(), "File Uploaded!");
    }
}
