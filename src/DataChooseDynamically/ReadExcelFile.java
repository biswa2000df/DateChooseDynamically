package DataChooseDynamically;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadExcelFile {
public static void main(String[] args) {
	
	
	try {
		File file=new File("C:\\Users\\biswa\\Desktop\\excel1.xlsx");
		FileInputStream fis= new FileInputStream(file);
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
	FormulaEvaluator formulaEvalutor=
	} catch (FileNotFoundException e) {
	
		e.printStackTrace();
	}
	
}
}
