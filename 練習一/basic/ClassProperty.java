package basic;
class Test1 {
    static int a = 10;
    static String str = "Hello";
}
class Test2 {
    static double a =3.14;
    public static void main(String[] args) {
        System.out.println(Test1.a);
        Test2.console(Test1.str,2);
        System.out.println(Test2.a);
        Test1.a = 20;
        System.out.println(Test1.a);
    }
    static void console(String msg, int num) {
        System.out.println(msg + num);
    }
}