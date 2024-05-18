package includeddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.Test;

public class DDTProgram {
    @Test
    public void ddt() throws EncryptedDocumentException, IOException {
    	FileInputStream f1=new FileInputStream("C:\\Project1\\DDTExcelSheet\\paddukishore.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		     /*Sheet s1=   wb.getSheet("Login");
		         Row r1=    s1.getRow(0);
		             Cell c1= r1.getCell(0);
		               String str=  c1.getStringCellValue();
		               System.out.println(str);*/
		String pwd=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		String usn=NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(0).getNumericCellValue());  
		
    }
}
