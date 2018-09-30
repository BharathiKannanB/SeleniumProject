package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static Object[][] excelData(String excel) throws IOException {

		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+excel+".xlsx");
		XSSFSheet sheet = wbook.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		//System.out.println("Row Count" + rowCount); 
		int colCount = sheet.getRow(0).getLastCellNum();
		//System.out.println("Column Count" + colCount); 
		Object[][] data = new Object[rowCount][colCount];
		for(int j=1; j<= rowCount; j++)
		{
			XSSFRow row = sheet.getRow(j);
			
			for(int i=0; i< colCount; i++)
			{
				XSSFCell cell = row.getCell(i);
				
				data[j-1][i] = cell.getStringCellValue();
			//	System.out.println(data);
			}

		}
		return data;
	}

}
