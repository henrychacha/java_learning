package day01;
/*
* 第三题
语法点：运算符，for，if
	编写步骤
		定义类 Test1
		定义 main方法
		定义变量jj为20,a为0,b为0
		使用for循环,初始化值ii为0,当ii<jj 时进入循环,步进表达式为ii+=2,jj自减
		循环内,使用if判断ii被3整除,ii赋值给a,并输出ii拼接"Hello"
		不被3整除,jj赋值给b,并输出ii拼接"World"
		循环外,按照格式,打印a与b的乘积

*
* */
public class a14_assignment04 {
    public static void main(String[] args) {
        int jj =20;
        int a =0;
        int b=0;
        for(int ii=0;ii<jj;ii+=2,jj--){
            if(ii%3 == 0){
                a =ii;
                System.out.println(ii+"Hello");
            }else{
                b=jj;
                System.out.println(ii+"World");
            }
//            ii+=2;

        }
        System.out.println(a*b);
    }
}
