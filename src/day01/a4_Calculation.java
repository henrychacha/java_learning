package day01;

public class a4_Calculation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // 算术运算符
        System.out.println(a+b); //30
        System.out.println(a+'h');//10h 错误// 114正确
        System.out.println(a-b); //-10
        System.out.println(a*b);//200
        System.out.println(a/b);//0
        System.out.println(b/a);//2
        System.out.println(a%b);//10
        System.out.println(b%a);//0
        // 自增自减运算符
        a++;
        System.out.println(a);//11
        System.out.println(a++); //11
        System.out.println(++a);//13
        b--;
        System.out.println(b);//19
        System.out.println(b--);//19
        System.out.println(--b);//17


    }
}
