package com.example;

import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        List<Map<String, Object>> firstList = ReadFile.readXlsx("練習題3_每月工時統計.xlsx");
        Map<String, Object> monthHoursMap = Count.countHour(firstList);
        System.out.println(monthHoursMap);
        List<Map<String, Object>> secondList = ReadFile.readXlsx("練習題3_每月工時統計_進階.xlsx");
        Map<String, Object> monthHoursMap2 = Count.countHour(secondList);
        System.out.println(monthHoursMap2);
    }
} 