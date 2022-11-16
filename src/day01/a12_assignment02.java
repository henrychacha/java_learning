package day01;
import java.util.Scanner;

/*
* 第一题
键盘录入x的值，计算出y的并输出。
	满足条件：
		* x>=3	 时	y = 2 * x + 1;
		* -1<x<3 时	y = 2 * x;
		* x<=-1	 时	y = 2 * x - 1;

*
* */
public class a12_assignment02 {
    public static void main(String[] args) {
        System.out.println("please input a number");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        if(num >=3){
            System.out.println(2*num +1);
        }else if(num>-1&num<3){
            System.out.println(2*num);
        }else{
            System.out.println(2*num-1);
        }


    }
}
