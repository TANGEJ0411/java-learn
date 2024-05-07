package basic;
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!222");

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        String str = sc.next();

        System.out.println("你輸入的整數是：" + x);

        System.out.println("你輸入的string是：" + str);
    }
}