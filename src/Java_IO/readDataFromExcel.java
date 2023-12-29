package Java_IO;
import java.io.FileInputStream;
import java.io.IOException;

import orgs.apache.poi.ss.usermodel.*;
import orgs.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readDataFromExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./folder/Tanvis-Sales-Tracker.xlsx");
        Workbook workbook = new XSSFWorkbook(fis);

        Sheet sheet = workbook.getSheetAt(0);
        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }

        fis.close();
    }
}

