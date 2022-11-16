package day01;

public class a5_Logic {
    public static void main(String[] args) {
        short a = 10;
        short b = 20;
        // &
        System.out.println(a>b&a>1); //false
        System.out.println(a<b&a>1); //true
        System.out.println(a>b&a<1); //false
        System.out.println(a<b&a<1); //false
        // |
        System.out.println(a>b|a>1);//true
        System.out.println(a<b|a>1);//true
        System.out.println(a>b|a<1);//false
        System.out.println(a<b|a<1);//true
        // ^
        System.out.println(a>b^a>1);//true
        System.out.println(a<b^a>1);//false
        System.out.println(a>b^a<1);//false
        System.out.println(a<b^a<1);//true
        //!
        System.out.println(!(a>b));//true
        //&&
//       System.out.println(a>b&&a++); //报错
        System.out.println(a>b&&a++>0); //false
        System.out.println(a);//10
        System.out.println(a<b&&a++<0);//false
        System.out.println(a);//11
        //||
        System.out.println(a>b||a++>0);//
        System.out.println(a);
        //ternary operator
        int num = a < b? a : b;
        System.out.println(num);
        // known there are 4 int data variables and how to obtain the max of them?
        int x = 10;
        int y = 2;
        int z =3;
        int w =4;
        int max = x > y?x:y;
        max=max>z?max:z;
        max=max>w?max:w;
        System.out.println(max);


    }
}
