package com.bugshooters.tests;

import com.bugshooters.utilities.AllPages;
import com.bugshooters.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class B_10_DownloadFile extends TestBase {

    AllPages allPages = new AllPages();

    @Test (priority = 1)
    public void downloadFileTest () {
        driver.get("https://the-internet.herokuapp.com/download");
        allPages.fileDownloadPage().downloadLink.click();

    }
    @Test (priority = 2)
    public void isFileExistTest (){
        String mainFolder = System.getProperty("user.dir"); // Example Path
        System.out.println("Proje klasoru : " + mainFolder);

        String userFolder = System.getProperty("user.home");
        System.out.println("Ne ise yariyor : " + userFolder);

        String downloadPath = userFolder+"/Downloads/Vladimir Boiko -1.jpg";
        boolean isFileExist = Files.exists(Paths.get(downloadPath));
        Assert.assertTrue(isFileExist);
    }
}
