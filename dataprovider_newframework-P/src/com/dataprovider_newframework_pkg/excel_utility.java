package com.dataprovider_newframework_pkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class excel_utility {

	public static String[][] getExcelData(String fileName, String sheetName) {
		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(sheetName);

			int totalNoOfCols = sh.getColumns();
			int totalNoOfRows = sh.getRows();
			//System.out.println(totalNoOfRows);
			//System.out.println(totalNoOfCols);
			arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
			
			for (int i= 1 ; i < totalNoOfRows; i++) {

				for (int j=0; j < totalNoOfCols; j++) {
					//System.out.println(sh.getCell(j, i).getContents());
					arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
				}

			}
			/*for(int k=1;k<totalNoOfRows;k++)
			{
				System.out.println(sh.getCell(4,k).getContents());
			}*/
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		return arrayExcelData;
	}
	
}
