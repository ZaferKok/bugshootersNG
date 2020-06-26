package com.bugshooters.tests;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class B_17_ExcelWrite {
    @Test
    public void writeExcel() throws IOException {
        String path = "./src/test/resources/Capitals.xlsx";
        FileInputStream file = new FileInputStream(path);       //opening the file

        Workbook workbook = WorkbookFactory.create(file);       //OPENING the workbook
        Sheet sheet = workbook.getSheetAt(0);                 //getting the first sheet
        Row row = sheet.getRow(0);                            //getting the first row
        Cell cell = row.createCell(4);                        //CREATING a cell
        cell.setCellValue("POP");

        List<String> pop2 = new ArrayList<>();
        pop2.add("333333");
        pop2.add("444444");
        for (int i=0; i<2; i++){
            workbook.getSheetAt(0).getRow(i).createCell(5).setCellValue(pop2.get(i));
        }

        String [] pop = new String[8];
        pop[0]="Population";
        pop[1]="1000000";
        pop[2]="1000000";
        pop[3]="1000000";
        pop[4]="1000000";

        for (int i=1; i<5; i++){
            workbook.getSheetAt(0).getRow(i).createCell(6).setCellValue(pop[i]);
        }

        //Creating 1 cell on each row and 4th cell, setting the value at 200000
        workbook.getSheetAt(0).getRow(1).createCell(4).setCellValue("100000");
        workbook.getSheetAt(0).getRow(2).createCell(4).setCellValue("923445");
        workbook.getSheetAt(0).getRow(3).createCell(4).setCellValue("923445423");

        //Opening a file to send data to the created cell
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);                       //WRITING on the cell and saving the workbook

        fileOutputStream.close();                               //CLOSING is IMPORTANT
        file.close();
        workbook.close();
    }
}
