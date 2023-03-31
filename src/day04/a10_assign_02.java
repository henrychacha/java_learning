package day04;
import java.util.Scanner;
public class a10_assign_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];
        String number="您的大乐透号码为 ";
//        System.out.println("请输入第1个数字");
//        arr[0]= sc.nextInt();
//        System.out.println("请输入第2个数字");
//        arr[1]= sc.nextInt();
        for(int i=0;i<arr.length;i++){
            System.out.println("请输入第" + (i+1) + "个数字");
            int a = sc.nextInt();
            if(a < 100 && a>9){
                arr[i] = a +"";
            }else if(a>0 && a<10){
                arr[i] = "0"+a;
            }
            else{
                System.out.println("输入的有误");
            }

        }
        for(int i=0;i<arr.length;i++){
            number += arr[i] + " ";

        }
        System.out.println(number);

    }
}
