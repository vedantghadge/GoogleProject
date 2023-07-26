package com.edusol.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

// 	object [][] = {{[key=value],[key=value],...... },{2,3},{},{}}; 

	static String homepath = System.getProperty("user.dir");
	static XSSFSheet sheet;
	File file;
	static XSSFWorkbook workbook;
	FileInputStream fis;

	public ExcelReader() {

		file = new File(homepath + "//src//test//resources//Data//TestData.xlsx");

		try {
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet("Sheet1");
			System.out.println("excelcel reader constructor is called ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public HashMap<String, String> getExcelData(int rowNum) {
		HashMap<String, String> map = new HashMap<String, String>(); // key value
	
		Object[][] exceldata = null;
		try {

			for (int colNum = 0; colNum < getCellCount(); colNum++) {
				String data = getvalueFromCell(rowNum, colNum);
				map.put(getvalueFromCell(0, colNum), data);
			}
			// exceldata[rowNum-1][0]=map;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;

	}

	public static String getvalueFromCell(int row, int col) {
		Cell cell = sheet.getRow(row).getCell(col);
		String value = "";
		if (cell.getCellType().equals(CellType.STRING)) {
			value = cell.getStringCellValue();
		} else {
			Double nvalue = cell.getNumericCellValue();
			int num = nvalue.intValue();
			System.out.println("num" + num);

			value = String.valueOf(num);
		}

		return value;

	}

	public int getRowCount() {
		int rowcount = sheet.getPhysicalNumberOfRows();
		return rowcount;
	}

	public static int getCellCount() {
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
		return cellcount;
	}

}
