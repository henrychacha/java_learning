package day01;

public class a3_DataTypes {
    public static void main(String[] args) {
        // 定义 数据类型 变量名词 = 具体的值；
        // 整数类型
        // 1个字节 8位bit -127 to 128
        byte b = 120;
        System.out.println(b);
        b = 125;
        System.out.println(b);
        // 2byte 16 bit -2^15 to 2^15 (32,768)
        short s = 32000;
        System.out.println(s);
        // 4byte 32 bit -2^31 to 2^31  (2 bilion 9个零)
        // 默认的类型
        int i = 22222222;
        System.out.println(i);
        // 8byte 64 bit -2^63 to 2^63 (9后面18个0)
        // 必须在末尾标上L 否则会认为是int类型
        long l = 9000000000000000000L;
        System.out.println(l);

        // 小数类型
        // hove to add F at the end
        float f = 3.14F;
        System.out.println(f);
        // 默认是double类型 比float大
        double d = 10.20;
        System.out.println(d);

        // 字符类型
        // 占据空间是2个字节 和整数类型里的short 类型是一样的
        char c = 'a';
        System.out.println(c);

        // 布尔类型
        // 占据空间未知
        boolean boo = true;
        System.out.println(boo);
        boo = false;

        //字符串类型
        // 引用数据类型 双引号
        // 可以和其他数据类型进行加法运算
        String s1 = "who are you";
        System.out.println(s1);
        System.out.println(s1+"henry"+1);





    }
}
