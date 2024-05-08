package count;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Count {
    public static int countGender (List <Map<String, String>> list, String sex){
            int count = 0;
            for (Map<String, String> employee : list){
                if (employee.get("sex").equals(sex)){
                    count++;
                }
            }
            return count;
        }

    public static Map<String, Integer> countCome(List <Map<String, String>> list, int monthOryear){
        Map<String, Integer> peopleComeMap = new HashMap<>();

        for(Map<String, String> employee : list){
            String empID = employee.get("empID");
            String yearMonth = empID.substring(0, monthOryear);
            if(peopleComeMap.containsKey(yearMonth)){
                peopleComeMap.put(yearMonth, peopleComeMap.get(yearMonth) + 1);
            }else{
                peopleComeMap.put(yearMonth, 1);
            }
        }

        return peopleComeMap;
    }

    public static Map<String, Integer> countSalary (List <Map<String, String>> list) {
        Map<String, Integer> salaryMap = new HashMap<>();
        for(Map<String, String> employee : list){
            int salary = Integer.parseInt(employee.get("pay").replace("K", "000"));
            if (20000 <= salary && salary < 35000){
                if(salaryMap.containsKey("20000~35000(不含)")){
                    salaryMap.put("20000~35000(不含)", salaryMap.get("20000~35000(不含)") + 1);
                }else{
                    salaryMap.put("20000~35000(不含)", 1);
                }
            }else if (35000 <= salary && salary < 45000){
                if(salaryMap.containsKey("35000~45000(不含)")){
                    salaryMap.put("35000~45000(不含)", salaryMap.get("35000~45000(不含)") + 1);
                }else{
                    salaryMap.put("35000~45000(不含)", 1);
                }
            }else if (45000 <= salary){
                if(salaryMap.containsKey("45000以上")){
                    salaryMap.put("45000以上", salaryMap.get("45000以上") + 1);
                }else{
                    salaryMap.put("45000以上", 1);
                }
            }
        }
        return salaryMap;
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
