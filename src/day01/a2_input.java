package day01;
import java.util.Scanner;
public class a2_input {
    public static void main(String[] args){
        // 创建键盘录入对象 Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要输入的数字");
        // 录入数字
        int num = sc.nextInt();
        // 使用录入的数字进行操作
        System.out.println("输入的数字是"+ num);
        // 输入字符串 // next每次只能存一个word 剩下的world可以继续使用next()调取
        System.out.println("please input a string");
        String s= sc.next();
        System.out.println(s);
        // 输入一段话 // nextLine() 直接获取之后所有的字符串
        System.out.println("please input a string");
        String s1=sc.next();
        s1 += sc.nextLine();
        System.out.println(s1);

    }
}
