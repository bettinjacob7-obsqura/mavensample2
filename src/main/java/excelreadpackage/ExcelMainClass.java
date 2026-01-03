package excelreadpackage;

import java.io.IOException;

public class ExcelMainClass {
    public static void main(String[] args) throws IOException {
        String str01 = ExcelReadClass.readStringData(4,0);
        double num01 = ExcelReadClass.readIntegerData(2,1);

        System.out.println(str01);
        System.out.println(num01);
    }
}
