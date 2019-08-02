package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {
  @Test
  public void trialExcel() throws IOException {
	  File src = new File("C:\\Users\\Training_C2d.02.11\\Desktop\\Ebin\\Data.xlsx");
	  FileInputStream fis = new FileInputStream(src);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sheet1 = wb.getSheetAt(0);
	  for (int x=0;x<=sheet1.getLastRowNum();x++){
	  String data0 = sheet1.getRow(x).getCell(0).getStringCellValue();
	  System.out.println("Data from Excel is : " +data0);
	  String data1 = sheet1.getRow(x).getCell(1).getStringCellValue();
	  System.out.println("Data from Excel is : " +data1);
	  /*String data2 = sheet1.getRow(1).getCell(0).getStringCellValue();
	  System.out.println("Data from Excel is : " +data2);*/
	  wb.close();
	  }
  }
}
