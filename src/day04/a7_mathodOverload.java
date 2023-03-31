package day04;

public class a7_mathodOverload {
    //求两个int类型数据的和的方法
    public static void getSum(int a,int b) {

        int sum = a+b;
        System.out.println(sum);
    }
    //求3个int类型数据的和的方法
    public static void getSum(int a,int b,int c) {

        int sum = a+b+c;
        System.out.println(sum);
    }
    //求两个int类型数据的和的方法
    public static void getSum(int a,byte b) {

        int sum = a+b;
        System.out.println(sum);
    }
    //求两个int类型数据的和的方法
    public static int getSum(byte b, int a) {
        int sum = a+b;
        return sum;
    }
}
