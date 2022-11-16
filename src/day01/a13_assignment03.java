package day01;
import java.util.Scanner;
public class a13_assignment03 {
    public static void main(String[] args) {
        System.out.println("please input working age");
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println("please input basic wage");
        //Scanner sc2 = new Scanner(System.in); //不需要
        int wage = sc.nextInt();
        int increase = 0;
        if(age>=0&age<1){
            increase =200;
        }else if(age<3){ //这些判断可以优化成为这样  因为处理的从上大下的先后顺序造成下面的条件必然满足上面的不成立
            increase =500;
        }else if(age<5){
            increase =1000;
        }else if(age<10){
            increase =2500;
        }else if(age<15){
            increase =5000;
        }else{
            System.out.println("doesn't meet requirement");
        }

        //int all = wage+increase;
        System.out.println("您目前工作了"+age+"年，基本工资为" +wage+"元, 应涨工资 "+increase+"元,涨后工资 "+ (wage+increase));



    }
}
