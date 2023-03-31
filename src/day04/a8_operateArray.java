package day04;

public class a8_operateArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println(arr[2]);
        //存值
        arr[3] =19;
        System.out.println(arr[3]);
        //数组的遍历
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
    }
}
