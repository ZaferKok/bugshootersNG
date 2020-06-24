package com.bugshooters.tests;

import com.bugshooters.pages.FHC_HotelRoomCreationPage;
import com.bugshooters.utilities.AllPages;
import com.bugshooters.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class B_15_WebTables<columns5th> extends TestBase {

    AllPages allPages = new AllPages();

    @Test
    public void WebTableTest() throws InterruptedException {
        driver.get("http://www.fhctrip.com/admin/HotelRoomAdmin");
        allPages.fhc_hotelRoomCreationPage().login();

        //          size of table
        List<WebElement> table=driver.findElements(By.xpath("//tbody//td"));
        System.out.println("The size of the table body is ===>> "+table.size());
        System.out.println(driver.findElements(By.tagName("//tbody//td")).size());
        List<WebElement> allHeader=driver.findElements(By.tagName("th"));
        for (WebElement header:allHeader){
            System.out.println(header.getText());
        }
        //          find total rows
        System.out.println("There are "+driver.findElements(By.xpath("//tbody//tr")).size()+" rows in the table body");
        //          print the rows
        List<WebElement> allRows=driver.findElements(By.xpath("//tbody//tr"));
        for (WebElement row:allRows){
            System.out.println(row.getText());
        }
        //          Print the elements of 4th row
        List<WebElement> elements4th=driver.findElements(By.xpath("//tr[4]//td"));
        for (WebElement element :elements4th){
            System.out.println(element.getText());
        }

        //          Find the total number of cells in the table body
        List<WebElement> allCells = driver.findElements(By.xpath("//tbody//td"));
        for (WebElement cell:allCells){
            System.out.println(cell.getText());
        }
        //          Print the elements of the 5th column
        List<WebElement> columns5th=driver.findElements(By.xpath("//tbody//td[5]"));
        for (WebElement element : columns5th){
            System.out.println(element.getText());
        }
        //          Print any cell with METHOD (It is below)
        printData(8,6);//Studio
        printData(3,4);//147
        printData(5,2);//Hilton Hotel-1

    }
    public void printData(int row, int column){

        String xpath = "//tbody//tr["+row+"]//td["+column+"]";// ==> dynamic xpath
        WebElement data=driver.findElement(By.xpath(xpath));
        System.out.println(data.getText());
    }
}
