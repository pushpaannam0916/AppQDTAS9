package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldataprovider {
	XSSFWorkbook workb; 
	  public void getData() throws IOException 
	  { 
		  
	  String excelpath = System.getProperty("user.dir")+"\\Testdata\\abc.xlsx";
	  //String excelPath = "C://Users//sures//Downloads//AppQDTAS//AppQDTAS//Testdata//abc.xlsx/";
	  
	  //File src = new File(excelpath);
	  FileInputStream file = new FileInputStream(excelpath);
	  workb = new XSSFWorkbook(file);
	  
	  }
	  
	  public String getStringData(String sheetname, int row,int column)
	  {
	  return workb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	  }
	  
	  public double getNumericData(String sheetname, int row,int column) 
	  {   
		  return workb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
	  }
}
