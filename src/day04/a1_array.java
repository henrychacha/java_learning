package day04;

public class a1_array {
    public static void main(String[] args) {
        //初始化数组： 静态初始化：
        //数据类型[] name = new 数据类型[]{数据1, 2,3,4,5}
        int[] array1 =new int[]{1,2,3,4,5};
        // 简化版j静态初始化
        int[] arr2 = {3,4,5,6};
        // 动态初始化 只创建了容器 确定了大小 没有内容
        // 数据类型[] name=new 数据类型[数组元素的个数】
        int[] arr3 =new int[5];
        System.out.println(array1);
        System.out.println(arr2);
        System.out.println(arr3); //默认存放了五个0
        //[I@29453f44
        //[I@5cad8086
        //[I@6e0be858
        // 代表内存有三块空间
        // 数组一旦创建出来 长度就固定不变了

    }
}
