package ExcelDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		String filepath = System.getProperty("user.dir");
		String filename = "Demo.xlsx";
		String sheetname = "Sheet1";
		ReadExcel.getData(filepath, filename, sheetname);

	}

	private static void getData(String filepath, String filename, String sheetname) throws IOException {
		
		File f = new File(filepath+"\\"+filename);
		FileInputStream fis = new FileInputStream(f);
		Workbook myWorkbook = null;
		
		String fileExtensionName = filename.substring(filename.indexOf("."));
		if(fileExtensionName.equals(".xlsx"))
		{
			myWorkbook = new XSSFWorkbook(fis);
			System.out.println("Extension is :: xlsx");
		}
		else if(fileExtensionName.equals(".xls"))
		{
			myWorkbook = new XSSFWorkbook(fis);
			System.out.println("Extension is :: xls");
		}
		
		Sheet mySheet = myWorkbook.getSheet(sheetname);
		int rowCount = mySheet.getLastRowNum()-mySheet.getFirstRowNum();
		System.out.println(rowCount);
		
		for(int i=0; i<rowCount+1; i++)
		{
			Row row = mySheet.getRow(i);
			
			for(int j=0; j<row.getLastCellNum(); j++)
			{
				System.out.print(row.getCell(j).getStringCellValue()+"|| ");
			}
			System.out.println();
		}
		
	}

}
