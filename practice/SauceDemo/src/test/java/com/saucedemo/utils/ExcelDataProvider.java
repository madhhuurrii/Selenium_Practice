package com.saucedemo.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	public ExcelDataProvider() {
		File src= new File("./TestData/data.xlsx");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String stringData(String sheetname, int rol,int col) {
		return wb.getSheet(sheetname).getRow(rol).getCell(col).getStringCellValue();
		
	}

}
