import math.BasicMath;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

class App {
    public static void main(String[] args) {
        System.out.println(BasicMath.add(1, 2));
        System.out.println(BasicMath.Pi);
        // 第一題
        System.out.println("第一題：");
        String str = "張三I09903001";
        System.out.println(str.substring(2));
        System.out.println(str);
        // 第二題
        System.out.println("第二題：");
        String strArr = "張三,I09903001";
        String[] arr = strArr.split(",");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 第三題
        System.out.println("第三題：");
        String strSpace = " 張三 I09903001 ";
        System.out.println(strSpace.replaceAll("\\s+", ""));
        // 第四題
        System.out.println("第四題：");
        String strIndex = "張三,I09903001";
        int index = strIndex.indexOf("I");
        System.out.println(index);
        // 第五題
        System.out.println("第五題：");
        System.out.println(strIndex.substring(index));
        // 第六題
        System.out.println("第六題：");
        String compareStr = "I09903001";
        System.out.println(strIndex.equals(compareStr));
        // 第七題
        System.out.println("第七題：");
        System.out.println(strIndex.contains(compareStr));
        // 不為-1所以存在
        System.out.println(strIndex.indexOf(compareStr));
        // 第八題
        System.out.println("第八題：");
        String[][] nestArr = new String[][]{{"張三", "I09903001"}, {"李四", "I10903001"}};
        for(int i = 0; i < nestArr.length; i++){
            for(int j = 0; j < nestArr[i].length; j++){
                System.out.println(nestArr[i][j]);
            }
        }
        // 第九題
        System.out.println("第九題：");
        Map<String, String> map =new HashMap<String, String>();
        map.put("name", "張三");
        map.put("empID", "I09903001");
        System.out.println(map.get("empID"));
        // 第十題
        System.out.println("第十題：");
        Map<String, String> map1 =new HashMap<String, String>();
        map1.put("name","李四");
        map1.put("empID","I10903001");
        List<Map<String, String>> list =new ArrayList<>();
        list.add(map);
        list.add(map1);
        // for迴圈寫法
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        // foreach寫法
        for(Map<String, String> m : list){
            System.out.println(m);
        }
        // 自己練習
        Map<String, Integer> mapTest = new HashMap<>();
        mapTest.put("apple", 1);
        mapTest.put("banana", 2);
        mapTest.put("orange", 3);
        System.out.println(mapTest);

        String[] arr1 = new String[]{"你", "好", "啊"};
        for (String myChar: arr1){
	        System.out.println(myChar);
        }
    }
}



        /*1.有一段字串(張三I09903001)使用String語法只印出員工編號
          ex:I09903001 
        */
        

        /*2.有一段字串(張三,I09903001)使用逗號分割取得陣列，並使用for迴圈印出
	      ex:
	      張三
	      I09903001
        */
        

        /*3.有一段字串( 張三 I09903001 )印出，去空白文字
	      ex:
	      張三I09903001
        */
        

        /*4.有一段字串(張三,I09903001)使用String語法取得I的相對字元位置
	      ex:
	      4
        */
        

        /*5.繼第四題取得I的字元位置印出員工編號I09903001
        */
        

        /*6.有一段字串(張三,I09903001)判斷是否等於I09903001
        */
        

        /*7.有一段字串(張三,I09903001)判斷內容是否有I09903001
        */
        

        /*8.有一個二維陣列資料，使用for迴圈印出資料
	      ex: 
	      張三
	      I09903001
	      李四
	      I10903001
        */
        

        /*9.有一段字串(張三,I09903001)使用陣列取得資料後存入Map資料，Key值分別為name、empID，並印出map裡面empID內容
	      ex:
	      I09903001 
        */
        

        /*10.繼第八題使用list儲存map資料，並使用迴圈印出所有map資料
          array->map->list
	      ex:
	      {empID=I09903001, name=張三}
	      {empID=I10903001, name=李四}
        */
        