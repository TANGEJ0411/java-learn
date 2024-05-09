package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile {
    public static List<Map<String, Object>> readXlsx(String path) {
        List<Map<String, Object>> list = null;
        try {
            FileInputStream excelFile = new FileInputStream(path);
            XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
            XSSFSheet sheet = workbook.getSheetAt(0);

            list = new ArrayList<Map<String, Object>>(sheet.getLastRowNum());
            
            String[] title = new String[sheet.getRow(0).getLastCellNum()];
            for (int i = 0; i < sheet.getRow(0).getLastCellNum(); i++) {
                title[i] = sheet.getRow(0).getCell(i).getStringCellValue();
                // System.out.println("title" + title[i]);
            }
            int rowIndex = 0;
            // 迭代所有行
            for (Row row : sheet) {
                if (rowIndex == 0) {
                    rowIndex++;
                    continue;
                }
                // 迭代每一行中的所有儲存格
                Map<String, Object> map = new HashMap<String, Object>();
                for (Cell cell : row) {
                    // 根據儲存格類型進行處理
                    switch (cell.getCellType()) {
                        case STRING:
                            // System.out.print(cell.getStringCellValue() + "\t");
                            map.put(title[cell.getColumnIndex()], cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                                // System.out.print(dateFormat.format(cell.getDateCellValue()) + "\t");
                                map.put(title[cell.getColumnIndex()], dateFormat.format(cell.getDateCellValue()));
                            } else {
                                // System.out.print(cell.getNumericCellValue() + "\t");
                                map.put(title[cell.getColumnIndex()], cell.getNumericCellValue());
                            }
                            break;
                        // case BOOLEAN:
                        //     System.out.print(cell.getBooleanCellValue() + "\t");
                        //     break;
                        default:
                            // System.out.print("\t");
                    }
                }
                list.add(map);
                rowIndex++;
                // System.out.println();
            }
            // for (Map<String, Object> map : list) {
            //     System.out.println(map);
            // }
            // 關閉文件流
            excelFile.close();
            // 關閉workbook
            workbook.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return list;
    }
    
}
