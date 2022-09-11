package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility1 {
	
   public static String getID(int rowindex,int cellindex) throws Throwable {
	   
	   FileInputStream fis=new FileInputStream("C:\\Users\\user\\Documents\\With_DDF\\DDF1.xlsx");
	  Sheet sh= WorkbookFactory.create(fis).getSheet("sheet1");
	String dataa=  sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
	  return dataa;
	   
   }
	

}
