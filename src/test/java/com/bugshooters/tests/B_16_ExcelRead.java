package com.bugshooters.tests;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class B_16_ExcelRead {
    @Test
    public void readExcelFile() throws Exception {
        String path ="./src/test/resources/Capitals.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);      //Opening the file

        Workbook workbook= WorkbookFactory.create(fileInputStream);     //Open the workbook using fileinputstream
        Sheet sheet=workbook.getSheetAt(0);                           //Go to the first worksheet.(index of 0)
        Row row=sheet.getRow(0);                                      //Go to the first row (index of 0)
        Cell cell1=row.getCell(0);                                    //Now we can read the cell(test data)
        System.out.println("PRINTING THE FIRST CELL : "+cell1);
        System.out.println("PRINTING THE SECOND CELL : "+row.getCell(1));

        Row row1=sheet.getRow(1);                                     //getting the second row
        Cell cell2=row1.getCell(0);                                   //getting the first cell
        System.out.println(cell2);

        //          WE CAN CHAIN THE METHODS
        String france=workbook.getSheetAt(0).getRow(1).getCell(0).toString();
        System.out.println(france);

        //          How do you get the last row number? Index start at 0.
        int rowCount=sheet.getLastRowNum();
        System.out.println(rowCount);

        //          How do you get the number of row that is used index start at 1.Gives only used # of cell
        int numberOfPhysicalRows=sheet.getPhysicalNumberOfRows();
        System.out.println(numberOfPhysicalRows);

        Map<String,String> capitals=new HashMap<>();
        int countryColumn=0;
        int capitolColumn=1;

        for (int rowNumber=1;rowNumber<=rowCount;rowNumber++){
            String country=sheet.getRow(rowNumber).getCell(countryColumn).toString();
            System.out.println(country);
            String capitol = sheet.getRow(rowNumber).getCell(capitolColumn).toString();
            System.out.println(capitol);
            capitals.put(country,capitol);
        }
        System.out.println(capitals);
    }
}
