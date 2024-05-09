package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count {
    public static Map<String, Object> countHour(List<Map<String, Object>> list) {
        
        Map<String, Object> monthHourMap = new HashMap<String, Object>();
        for (Map<String, Object> mapDetail : list) {
            String date = (String) mapDetail.get("date");
            String month = date.substring(0, 7);
            if(monthHourMap.containsKey(month)){
                monthHourMap.put(month, (double)monthHourMap.get(month) + (double)mapDetail.get("hour"));
            }else{
                monthHourMap.put(month, (double)mapDetail.get("hour"));
            }
        }
        return monthHourMap;
    }
}
