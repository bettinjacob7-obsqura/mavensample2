package excelreadpackage;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadClass {
    public static FileInputStream f;
    public static XSSFWorkbook w;
    public static XSSFSheet s;

    public static String readStringData(int i, int j) throws IOException {

        f = new FileInputStream("C:\\Obsqura\\Obsqura_Sample.xlsx");
        w = new XSSFWorkbook(f);
        s = w.getSheet("Sheet1");

        XSSFRow r = s.getRow(i);
        XSSFCell c = r.getCell(j);

        return c.getStringCellValue();
    }

    public static double readIntegerData(int i, int j) throws IOException {

        f = new FileInputStream("C:\\Obsqura\\Obsqura_Sample.xlsx");
        w = new XSSFWorkbook(f);
        s = w.getSheet("Sheet1");

        XSSFRow r = s.getRow(i);
        XSSFCell c = r.getCell(j);

        return c.getNumericCellValue();
    }


}
