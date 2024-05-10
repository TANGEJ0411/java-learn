package count;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Count {
    
    }
    // public static Map<String, Integer> countSalary (List <Map<String, String>> list) {
    //     Map<String, Integer> salaryMap = new HashMap<>();
    //     String[] salaryRanges = {"20000~35000(不含)", "35000~45000(不含)", "45000以上"};
    //     int[] salaryLimits = {20000, 35000, 45000};
    
    //     for(Map<String, String> employee : list){
    //         int salary = Integer.parseInt(employee.get("pay").replace("K", "000"));
    //         for (int i = 0; i < salaryLimits.length; i++) {
    //             if ((i == 0 || salary >= salaryLimits[i]) && (i == salaryLimits.length - 1 || salary < salaryLimits[i + 1])) {
    //                 salaryMap.put(salaryRanges[i], salaryMap.getOrDefault(salaryRanges[i], 0) + 1);
    //                 break;
    //             }
    //         }
    //     }
    //     return salaryMap;
    // }
}
