package SeleniumPracticeDataDriven;

import java.io.IOException;

import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDExcel {

	public static void main(String[] args) {
		
		readXelData();

	}
	
	
	
	
	public static void readXelData()
	{
		XSSFWorkbook wb;
		XSSFSheet sheet;
		XSSFRow row ;
		XSSFCell cell ;
		
		try {
			wb = new XSSFWorkbook("Libraries/data files/loginData.xlsx");
		
			sheetLoop:for(int k=0;k<wb.getNumberOfSheets();k++)
			{
				sheet = wb.getSheetAt(k);
				System.out.println("sheet no " +k);
			rowsloop:for(int i=0;i<sheet.getLastRowNum();i++)
			{
				row = sheet.getRow(i);
				System.out.println("Sheet and Row no " + k + i);
				colsloop:for(int j=0;j<row.getLastCellNum();j++)
				{
					cell = row.getCell(j);
					System.out.println(cell.getStringCellValue());
					if(j==row.getLastCellNum())
					{
						break rowsloop;
					}
				}
			}
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
