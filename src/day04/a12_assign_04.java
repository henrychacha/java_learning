package day04;

public class a12_assign_04 {
    public static void main(String[] args) {
        // 定义equals 方法 比较数组内容是否完全一致 代码实现
        int[] arr1 = {1,2,3,4,3,2,1};
        int[] arr2 = {1,2,3,4,3,2,1};
        int[] arr3 = {1,2,3,3,3,2,1};
        System.out.println(equals(arr1,arr2));
        System.out.println(equals(arr1,arr3));
    }
    public static boolean equals(int[] arr1,int[] arr2){
        if(arr1.length != arr2.length){
            return  false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
