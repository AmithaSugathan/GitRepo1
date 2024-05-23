package com.ibm.mavenstudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	public static FileInputStream f;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	
	public static String readStringData(int i,int j) throws IOException{
		f=new FileInputStream("E:\\Amitha_JavaPgms\\MavenPgms\\Employee.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("Sheet1");
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		return c.getStringCellValue();
	}
	
	public static Double readNumericData(int i,int j) throws IOException
	{
		f=new FileInputStream("E:\\Amitha_JavaPgms\\MavenPgms\\Employee.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("Sheet1");
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		return c.getNumericCellValue();
	}
	

}
