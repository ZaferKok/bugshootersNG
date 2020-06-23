package com.bugshooters.tests;

import com.bugshooters.utilities.AllPages;
import com.bugshooters.utilities.TestBase;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class B_2_AmazonDropdown extends TestBase{
/*Go to https://www.amazon.ca/
Find the element of the dropdown element.
Print the first selected option and assert if it equals "All Departments"
Select the 4th option by index (index of 3) and assert if the name is "Amazon Warehouse Deals".
(after you select you need to use get first selected option method)
Print all of the dropdown options
Print the number of elements in the dropdown and assert it as 37.
BONUS : Check if Appliances is a drop down option. Print true if "Appliances" is
an option. Print false otherwise.
 */
AllPages allPages = new AllPages();
    @Test
    public void amazonDrop () {

// 1. Print the first selected option and assert if it equals "All Departments"
        driver.get("https://www.amazon.ca/");
        // AmazonHomePage amazonHomePage = new AmazonHomePage();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("startmaximized");

        Select select = new Select(allPages.amazonHomePage().drop);
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "All Departments");

// 2. select 7th option by index (LISTE OLUSTURMADAN BULMA)
        select.selectByIndex(6);
        String sevenOption=select.getFirstSelectedOption().getText();
        Assert.assertEquals(sevenOption,"Baby");

// 3. Liste olusturarak bulma!
        List<WebElement> allOptions = select.getOptions();
        Assert.assertEquals(allOptions.get(3).getText(), "Amazon Warehouse Deals");


// 4. Print all of the dropdown options
        for (WebElement element : allOptions){
            System.out.println(element.getText());
        }

// 5. Print the number of elements in the dropdown and assert it as 37
        int count =0;
        for (WebElement element : allOptions){
            count++;
        }
        System.out.println(count);
        Assert.assertTrue(count==37);

// 6. Assert if "Video Games" is a drop down option.
        boolean flag = false;
        for (WebElement element : allOptions){
            if (element.getText().equals("Video Games")){
                flag = true;
                break;
            }
        }Assert.assertTrue(flag);



// LAMBDA ILE: Bunlar benim kendi denemelerim. Mehmet abi LAMBDA icin tekrar paylasacak.
// 1. Asagidaki kod sonucu "Optional[All Departments]" olarak veriyor, assert yapamadım.
        System.out.println(allOptions.stream().map(t->t.getText()).findFirst());
//      Assert.assertEquals(allOptions.stream().map(t->t.getText()).findFirst(), "Optional[All Departments]"); // calısmadı
// 2. LAMBDA ile cozum bulamadım

// 3. LAMBDA ile cozum bulamadım

// 4.
        allOptions.stream().map(t->t.getText() +" | ").forEach(System.out::print); System.out.println();

// 5.
        System.out.println(allOptions.stream().count());
        Assert.assertEquals(allOptions.stream().count(), 37);

// 6.
        Assert.assertTrue(allOptions.stream().map(t->t.getText()).anyMatch(t->t.equals("Video Games")));
    }
    @Test
    public void click() throws FileNotFoundException {
        driver.get("https://www.amazon.ca/");
        System.out.println(allPages.amazonHomePage().drop.getText());
        allPages.amazonHomePage().drop.click();
        driver.findElement(By.xpath("//option[@value='search-alias=beauty']")).click();
        System.out.println(allPages.amazonHomePage().drop.getSize());
    }
}
//    public void dropDownTest(){
//        driver.get("https://www.amazon.ca/");
//        Select options = new Select(pages.amazonHomePage().dropdown);
//        List<WebElement> allOptions = options.getOptions();
//        Assert.assertEquals(options.getFirstSelectedOption().getText(), "All Departments");
//        Assert.assertEquals(allOptions.get(3).getText(), "Amazon Warehouse Deals");
//        allOptions.stream().map(t->t.getText()+" | ").forEach(System.out::print);
//        System.out.println(allOptions.stream().count());
//        Assert.assertTrue(allOptions.stream().map(t->t.getText()).anyMatch(t->t.equals("Watches")));
//    }
