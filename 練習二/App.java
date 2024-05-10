import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import member.*;

// 物件群組化，把資料也封裝進去

public class App {
    public static void main(String[] args) {
        String[] employeeArr = new String[]{"張三,男,09903001,30000","小胡,男,09803001","李四,男,10903001,35000","小一,女,10904002,28000","小二,女,10904003,40000","小陸,女,10807001,45K"};

        Member employee = new Member(employeeArr);

        // 第一題
        System.out.println("第一題");
        int maleCount = employee.countGender(employee.getEmployeeList(), "男"); 
        int femaleCount = employee.countGender(employee.getEmployeeList(), "女");
        System.out.println("男性人數: " + maleCount + " 女性人數: " + femaleCount);

        // 第二題
        System.out.println("第二題");
        Map<String, Integer> peopleComeMapYear = employee.countCome(employee.getEmployeeList(), 3);
        System.out.println(peopleComeMapYear.entrySet());

        // 第三題
        System.out.println("第三題");
        Map<String, Integer> peopleComeMapMonth = employee.countCome(employee.getEmployeeList(), 5);
        System.out.println(peopleComeMapMonth.entrySet());

        // 第四題
        System.out.println("第四題");
        Map<String, Integer> salaryList = employee.countSalary(employee.getEmployeeList());
        System.out.println(salaryList.entrySet());
        // System.out.println("20000~35000(不含): " + salaryList.get("20000~35000(不含)"));
        // System.out.println("35000~45000(不含): " + salaryList.get("35000~45000(不含)"));
        // System.out.println("45000以上: " + salaryList.get("45000以上"));

        // 第五題
        System.out.println("第五題");
        List<String> list = new ArrayList<String>();
        list.add("1"); 
        list.add("2"); 
        list.add("11");
        list.add("33");
        list.add("22");
        
        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);

                return Integer.compare(num1, num2);        
            }
        };
        Collections.sort(list, comparator);
        for (String s : list) {
            System.out.println(s);
        }
        // list.stream()
        // .mapToInt(Integer::parseInt)
        // .sorted()
        // .forEach(n -> System.out.print(n+ ","));
    }
}



// 註:name=張三,sex=男,empID=09903001(員編),pay=30000(薪水)
//    員編命名規則：民國年+月+流水號3碼


        /*1.有一段陣列文字{"張三,男,09903001,30000","小胡,男,09803001","李四,男,10903001,35000","小一,女,10904002,28000","小二,女,10904003,40000","小陸,女,10807001,45K"}，使用List、map概念儲存資料,並統計顯示男女各有幾位
         */
        

        /*2.繼第一題，顯示依年度統計該年度進入公司人員各有多少人
        */
        

        /*3.繼第一題，顯示依年度及月分統計該年度該月份進入公司員工各有多少人
        */
        

        /*4.繼第一題使用薪水做分群儲存List，分別為20000~35000(不含)、35000~45000(不含)、45000以上，並顯示每個群各有幾人
         */
        

        /*5.有一list，
          List<String> list = new ArrayList<String>();
          list.add("1"); list.add("2"); 
          list.add("11");list.add("33");list.add("22");
          請對list做排序並印出:
          1
          2
          11
          22
          33
         */
        