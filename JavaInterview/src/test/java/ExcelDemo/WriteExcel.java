package ExcelDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		
		String filepath = System.getProperty("user.dir");
		String filename = "Demo.xlsx";
		String sheetname = "Sheet1";
		String value[] = {"Test","Demo"};
		WriteExcel.writeData(filepath, filename, sheetname, value);

	}

	private static void writeData(String filepath, String filename, String sheetname, String[] value) throws IOException {
		
		File f = new File(filepath+"\\"+filename);
		FileInputStream fis = new FileInputStream(f);
		Workbook myWorkbook = null;
		
		String fileExtension = filename.substring(filename.indexOf("."));
		if(fileExtension.equals(".xlsx"))
		{
			myWorkbook = new XSSFWorkbook(fis);
		}
		else if(fileExtension.equals(".xls"))
		{
			myWorkbook = new HSSFWorkbook(fis);
		}
		
		Sheet mySheet = myWorkbook.getSheet(sheetname);
		int rowCount = mySheet.getLastRowNum()-mySheet.getFirstRowNum();
		
		//Get the first row
		Row row = mySheet.getRow(0);
		
		//Create a new row and append it at last of sheet
		Row newRow = mySheet.createRow(rowCount+1);
		
		 //Create a loop over the cell of newly created Row
		for(int i=0; i<row.getLastCellNum(); i++)
		{
			Cell cell = newRow.createCell(i);
			cell.setCellValue(value[i]);
		}
		
		fis.close();
		
		 //write data in the excel file
		FileOutputStream fos = new FileOutputStream(f);
		myWorkbook.write(fos);
		fos.close();
		
	}

}
