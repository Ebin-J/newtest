package demo;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;

public class WritePoi {
  @Test
  public void f() throws IOException {
	  File src = new File("C:\\Users\\Training_C2d.02.11\\Desktop\\Ebin\\Data1.xlsx");
	  FileInputStream fis = new FileInputStream(src);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sheet1 = wb.getSheetAt(0);
	  sheet1.getRow(0).createCell(2).setCellValue("pass");
	  sheet1.getRow(1).createCell(2).setCellValue("fail");
/*	  String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
	  System.out.println("Data from Excel is : " +data0);
	  String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
	  System.out.println("Data from Excel is : " +data1);*/
	  FileOutputStream fo = new FileOutputStream(src);
	  wb.write(fo);
	  wb.close();
  }
  @BeforeTest
  public void beforeTest() {
  }

}
