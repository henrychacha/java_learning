package day01;
import java.util.Scanner;
public class a7_switch {
    public static void main(String[] args) {
        // obtain the weekday according to the input number
        int num = 3;
        switch(num){
            case 1:
                System.out.println("this is Monday");
                break;
            case 2:
                System.out.println("this is Tuesday");
                break;
            case 3:
                System.out.println("this is Wednesday");
                break;
            case 4:
                System.out.println("this is Thursday");
                break;
            case 5:
                System.out.println("this is Friday");
                break;
//            default:
//                System.out.println("this is weekend");
        }
        // switch 语句的注意事项
//        long l = 2345L;//不能使用long
        int in1 = 1;
        switch (in1){
            case 1:
//                System.out.println("hello");
            case 2:
            case 3:
            case 4:
//            default:
//                break;
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
        }

        /*
        practice 输入一个几个
        * 键盘录入一个月份，输出这个月份的季节
        *  345 月是春季，678 是夏季，9、10、11 秋 2 1、2 冬
        * 其他数字，没有任何季节，录入错误
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份数字");
        int num2 = sc.nextInt();
        switch(num2){
            case 12:
            case 1:
            case 2:
                System.out.println("现在是冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("it's spring now");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("it's summer now");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("it's winter autumn now");
                break;
            default:
                System.out.println("please try again");

        }



    }

}
