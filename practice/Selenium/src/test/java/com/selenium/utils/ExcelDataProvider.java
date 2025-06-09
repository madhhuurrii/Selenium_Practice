package com.selenium.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	
	public ExcelDataProvider() {
		File src = new File("./TestData/FlipKart.xlsx");
		
		
		try {
			FileInputStream fis = new FileInputStream(src);
			wb  = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public ArrayList<Integer> count(String sheetName) {
		
		XSSFSheet sheet = wb.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(rowCount);
        a.add(colCount);
        return a;
	}
	
	public String stringData(String sheetName, int row,int col) {
		
		return wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
	}

}
