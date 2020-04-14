package pack1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	
		XSSFSheet sh;
		
		public Excel1() throws IOException {
			FileInputStream f= new FileInputStream("C:\\Users\\Lumi\\Desktop\\Book2.xlsx");
			XSSFWorkbook w= new XSSFWorkbook(f);
			sh= w.getSheet("Sheet1");
		}

		public double readData(int i, int j) {
			Row r= sh.getRow(i);
			Cell c= r.getCell(j); //Import Cell of apache poi not Table
		double a=c.getNumericCellValue(); //Read integer data and return it as double
			return a;
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
