package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData() throws IOException {
		// TODO Auto-generated method stub
		
		//Opening excel
		XSSFWorkbook wb = new XSSFWorkbook("./Data/CreateLead.java") ;
		
		//Locate the worksheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//count the number of rows without header
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		
		//count the number of rows with header
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		
		//count the number of columns
		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println(colcount);
		
		//to retrieve data
		String row1cell1data = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println("The data is:"+row1cell1data);
		
		//To retrieve the entire data
		String [][] data = new String[rowcount][colcount];
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colcount; j++) {
				String allData = row.getCell(j).getStringCellValue();
				data[i-1][j]=allData;    
			    System.out.println("All data are: "+allData);
				}
			}
		wb.close();
		return data;
				
			}
	}

