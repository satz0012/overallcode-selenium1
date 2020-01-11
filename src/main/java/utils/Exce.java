package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.ProjectSpecificMethods;

public class Exce extends ProjectSpecificMethods {
	public String[][] exce(String fileName) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		short colcount = sheet.getRow(0).getLastCellNum();
		System.out.println(colcount);
		String[][] data=new String[rowcount][colcount];//entering rows and columns of excel sheet in an array
		for (int j = 1; j <=rowcount; j++) {
			XSSFRow row = sheet.getRow(j);
			for (int i = 0; i <colcount ; i++) {
				XSSFCell cell = row.getCell(i);
				String value=cell.getStringCellValue();//Reads the data from excel
				data[j-1][i]=value;// why we provide j-1 means data start with [0]
				System.out.println(value+" ");
			}
				System.out.println();
			}
		return data;
		}
	}

 