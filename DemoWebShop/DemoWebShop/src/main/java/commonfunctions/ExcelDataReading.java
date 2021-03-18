package commonfunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelDataReading {

	public void readData() throws IOException {

		FileInputStream fis = new FileInputStream("");
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		int sheets = wb.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {

			if (wb.getSheetName(i).equalsIgnoreCase("Test")) {

				XSSFSheet sheet = wb.getSheetAt(i);
				java.util.Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				java.util.Iterator<Cell> ce = firstrow.cellIterator();
				while (ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("Test")) {
						// get the value and pass it to test
					}

				}

			}
		}

	}

}
