package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang.WordUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadData {
public static String ReadPropertyFile(String value) throws IOException 
{
	
Properties a=new Properties();
FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\mock16\\TestData\\Config.Property");
a.load(file);
return a.getProperty(value);

}

public static  String Readexcel(int row,int col) throws IOException 
{	
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\mock16\\TestData\\excel2.xlsx");
	Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");

	String value = excel.getRow(row).getCell(col).getStringCellValue();
		
return value;

	}
}

