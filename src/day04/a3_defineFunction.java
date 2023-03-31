package day04;

public class a3_defineFunction {
    public static void main(String[] args) {
        //这是一个main方法
        //调用方法
        int a =10;
        int b =20;
        getSum(a,b); //直接调用 适用于无返回值的方法调用
        System.out.println(getSum(a,b));//输出调用 只适用于有返回值的调用 否则不允许编译 会报错
        int sum = getSum(a,b);//赋值调用
    }
    //确定方法的定义位置 类中方法外
    //修饰符 返回值类型 方法名称(参数列表){}
    public static int getSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    //没有返回值类型的方法
    public static void getSum1(int a,int b){
        System.out.println(a+b);
    }public static void main(String[] args) {
        //这是一个main方法
        //调用方法
        int a =10;
        int b =20;
        getSum(a,b); //直接调用 适用于无返回值的方法调用
        System.out.println(getSum(a,b));//输出调用 只适用于有返回值的调用 否则不允许编译 会报错
        int sum = getSum(a,b);//赋值调用
    }
    //确定方法的定义位置 类中方法外
    //修饰符 返回值类型 方法名称(参数列表){}
    public static int getSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    //没有返回值类型的方法
    public static void getSum1(int a,int b){
        System.out.println(a+b);
    }
}
