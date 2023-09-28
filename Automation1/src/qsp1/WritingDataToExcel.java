package qsp1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException{
FileInputStream fis=new FileInputStream("./data/testscipt.xlsx");
Workbook wb=WorkbookFactory.create(fis);
wb.getSheet("createCustomer").getRow(1).getCell(6).setCellValue("fail");
FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
wb.write(fos);
	}

}
