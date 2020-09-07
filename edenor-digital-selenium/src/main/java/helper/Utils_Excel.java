package helper;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;


public class Utils_Excel {

    public static void writeCell(File src,int docSheet,int row,int column,String value) throws IOException {
        //carga el archivo
        FileInputStream file = new FileInputStream (src);
        //carga el worlbook
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        //carla la hoja que se quiere modificar o crear
        XSSFSheet sheet = workbook.getSheetAt(docSheet);
        //cargo el dato en la celda indicada por la fila y columna
        sheet.getRow(row).createCell(column).setCellValue(value);
        //cierro
        file.close();
        //indico donde guardar el archivo
        FileOutputStream outFile =new FileOutputStream(src);
        //escribo el contenido
        workbook.write(outFile);
        //cierro
        outFile.close();
    }

    public static String readCell(File src, int docSheet, int row, int column) throws IOException {
        FileInputStream file = new FileInputStream (src);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(docSheet);
        DataFormatter formatter = new DataFormatter();
        String cell = formatter.formatCellValue(sheet.getRow(row).getCell(column));
        file.close();
        return cell;
    }

    public static void nullCell (File src, int docSheet, int row, int column) throws IOException {
        FileInputStream file = new FileInputStream (src);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(docSheet);
        sheet.createRow(row).createCell(column).setCellValue("");
        //VER ESTO sheet.getRow(row).CREATE_NULL_AS_BLANK;
        file.close();
        FileOutputStream outFile =new FileOutputStream(src);
        workbook.write(outFile);
        outFile.close();
    }

    public static void copyCell(File src, int docSheet, int originalRow, int originalColumn, int targetRow, int targetColumn) throws IOException {
        String data = readCell(src,docSheet,originalRow,originalColumn);
        writeCell(src,docSheet,targetRow,targetColumn,data);
    }

    public static void removeRow(File src, int docSheet, int row) throws IOException {
        FileInputStream file = new FileInputStream (src);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(docSheet);
        int lastRowNum = sheet.getLastRowNum();
        if (row >= 0 && row < lastRowNum) {
            sheet.shiftRows(row + 1, lastRowNum, -1);
        }
        if (row == lastRowNum) {
            Row removingRow = sheet.getRow(row);
            if (removingRow != null) {
                sheet.removeRow(removingRow);
            }
        }
        file.close();
        FileOutputStream outFile =new FileOutputStream(src);
        workbook.write(outFile);
        outFile.close();
    }

    public static String readCellAndRemoveRow(File src, int docSheet, int row, int column) throws IOException {
        String data = readCell(src, docSheet, row, column);
        removeRow(src, docSheet, row);
        return data;
    }

    public static String getDataSetsDirectory(){
        return Utils_OS.getWorkingDirectory() + "\\Data Sets\\";
    }

}