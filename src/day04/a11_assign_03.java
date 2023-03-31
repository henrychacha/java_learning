package day04;

public class a11_assign_03 {
    public static void main(String[] args) {
        /*
        定义一个sym方法 判断数组中元素值适口堆成
         */
        int[] arr = {1,2,3,4,3,2,1};
        int[] arr2= {1,2,3,4,5,2,1};
        System.out.println(sym(arr));
        System.out.println(sym(arr2));


    }
    public static boolean sym(int[] arr){
        for(int i=0,j=arr.length-1;i<=j;i++,j--){
            if(arr[i] !=arr[j]){
                return false;
            }
        }
        return true;
    }
}
