package com.actitime.generic;

	import java.io.File;
import java.io.FileInputStream;
	import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
	import java.util.Properties;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	/**
	 * this is a generic class for data driven testing
	 * @author
	 */
	public class FileLib1 {
		/**
		 * this is generic method for reading data from property file
		 * @param key
		 * @return
		 * @throws IOException
		 */
	public String getPropetyData(String key) throws IOException{
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String data=p.getProperty(key);
	return data;
	}
	/**
	 * this is generic method for reading data from excel file
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	String data=wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	return data;
		}
	/**
	 * this is generic method for writing data from excel file
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
public void setExcelData(String sheetName,int row,int cell,String data) throws EncryptedDocumentException, IOException{
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
    wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(data);
	FileOutputStream fos=new FileOutputStream("./data/testcript.xlsx");
	wb.write(fos);
	wb.close();
}
	public static void copyFile(File src, File dest) {
		// TODO Auto-generated method stub
		
	}
	}

