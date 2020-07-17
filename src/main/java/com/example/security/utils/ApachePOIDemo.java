package com.example.security.utils;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ApachePOIDemo {

    public static void main(String[] args) throws Exception {

        FileInputStream in = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\test.xlsx"));

        XSSFWorkbook sheets = new XSSFWorkbook(in);

        XSSFSheet sheetAt = sheets.getSheetAt(0);

        List<Map<String, String>> list = new ArrayList<Map<String, String>>();

        XSSFRow row = sheetAt.getRow(0);

        System.out.printf(row.getCell(0).toString());



    }
}
