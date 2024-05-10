package member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Member {
    public List <Map<String, String>> employeeList = new ArrayList<>();

    public Member(String[] employeeArr) {
        for (String employee : employeeArr) {
            String[] employeeInfo = employee.split(",");
            Map<String, String> employeeMap = new HashMap<>();
            employeeMap.put("name", employeeInfo[0]);
            employeeMap.put("sex", employeeInfo[1]);
            employeeMap.put("empID", employeeInfo[2]);
            if (employeeInfo.length < 4) {
                employeeMap.put("pay", "0");
            }else {
                employeeMap.put("pay", employeeInfo[3]);
            }
            this.employeeList.add(employeeMap);
        }
    }

    public int countGender (List <Map<String, String>> list, String sex){
        int count = 0;
        for (Map<String, String> employee : list){
            if (employee.get("sex").equals(sex)){
                count++;
            }
        }
        return count;
    }

    public Map<String, Integer> countCome(List <Map<String, String>> list, int monthOryear){
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

    public Map<String, Integer> countSalary (List <Map<String, String>> list) {
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
}
