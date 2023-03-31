package day04;

public class a6_max {
    public static void main(String[] args) {
        //获取数组中所有元素的最大值
        int[] arr = {12,34,2,12,52,6,43};
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max = arr[i];
            }
            if(arr[i]<=min){
                min = arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}
