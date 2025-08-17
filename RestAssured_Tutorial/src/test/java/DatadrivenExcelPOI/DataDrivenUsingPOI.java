package DatadrivenExcelPOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenUsingPOI {

	public void readExcel() throws IOException {
		
		FileInputStream fileInputStream=new FileInputStream("src/test/resources/TestData1.xlsx");
		
		XSSFWorkbook wbook=new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet=wbook.getSheet("Sheet1");

		int rows= sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		
		System.out.println(cols);

		//using for loop
		
		for(int i=0;i<=rows;i++){
		
			XSSFRow row= sheet.getRow(i);
			
			for(int j=0;j<cols;j++) {
				XSSFCell cell=row.getCell(j);
				
				switch (cell.getCellType()) {
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
					break;

				
				}
			}
			System.out.println();
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		DataDrivenUsingPOI obj=new DataDrivenUsingPOI();
		obj.readExcel();

	}

}
