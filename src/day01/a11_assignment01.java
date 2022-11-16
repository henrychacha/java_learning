package day01;
import java.util.Scanner;

public class a11_assignment01 {
    public static void main(String[] args) {
        int a = 50;
        a += 10;
        System.out.println(a);// 60
        a -= 10;
        System.out.println(a); //50
        a *= 10;
        System.out.println(a); // 500
        a /=10;
        System.out.println(a); //50
        a %= 10;
        System.out.println(a);// 0

        // 键盘录入x 计算出y的值并输出
        System.out.println("please input a number");
        Scanner sc = new Scanner(System.in);

    }
}
