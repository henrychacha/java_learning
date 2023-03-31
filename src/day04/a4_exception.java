package day04;

public class a4_exception {
    public static void main(String[] args) {
        // 空指针异常
        int[] arr = {1,2,4,5};
        System.out.println(arr);
        arr = null;
        System.out.println(arr); // null
        System.out.println(arr[2]); //报错
        /*
         * 之前的arr存放一个指针 指针代表一个数组
         * 现在arr原来的哪个指针 指针对应的内存中没有东西 是null
         * */
        // 如何解决
        if(arr != null){
            System.out.println(arr[3]);
        }
    }
}
