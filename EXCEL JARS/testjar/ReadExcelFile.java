package testjar;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {

		//Read Excel File.
		String fileName = "C:/Users/User/workspace/testjar/TRANSACTION_USECASE_TEMPLATE.xlsx";

		parseJSONPostionFiles(fileName);

	}

	static List<Object> parseJSONPostionFiles(String fileName) throws IOException {

		FileInputStream fs = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);

		String total = sheet.getSheetName();
		System.out.println("Total No of Rows ... "+ total);
		List<Object> cellData = new ArrayList();

		for(int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++){
			Row row = sheet.getRow(rowIndex);
			System.out.println("\n "+"Row id "+ row.getRowNum()+"\n");
			for(int colIndex = row.getFirstCellNum(); colIndex <= row.getLastCellNum()+1; colIndex++){
				Cell cell = row.getCell(colIndex);
				
				if(cell==null){
					
				} else {
					switch (cell.getCellType()) 
					{
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t");
						cellData.add(cell.getNumericCellValue());
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + "\t");
						cellData.add(cell.getStringCellValue());
						break;
					case Cell.CELL_TYPE_BOOLEAN:
						System.out.print(cell.getBooleanCellValue() + "\t");
						cellData.add(cell.getBooleanCellValue());
						break;
					case Cell.CELL_TYPE_BLANK:
						System.out.print(cell.getStringCellValue() + "\t");
						cellData.add(cell.getBooleanCellValue());
						break;

					}
				}
			}


		}
		
		return cellData;
	}
}


