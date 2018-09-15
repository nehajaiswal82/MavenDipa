package com.accenture.filesystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public void readExcelUsingPOI() {
		
		File file = new File("C:\\Users\\n.a.jaiswal\\Downloads\\DiPA Bot_Generic Corpus.xlsx");
		
		try {
				FileInputStream fis = new FileInputStream(file);
				XSSFWorkbook wb = new XSSFWorkbook(fis); 
				List<XSSFName> sheetName = wb.getAllNames();
				
				for(XSSFName o:sheetName) {
					System.out.println(o.getSheetName());
				}
				
				//System.out.println(wb.getSheetAt(0).getSheetName());
				//System.out.println(wb.getSheetAt(1).getSheetName());
				//System.out.println(wb.getSheetAt(2).getSheetName());
				//System.out.println(wb.getSheetAt(3).getSheetName());
				wb.close();
				
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadExcelFile obj = new ReadExcelFile();
		obj.readExcelUsingPOI();

	}

}
