package day04;

public class a2_arrayReverse {
    public static void main(String[] args) {
        String[] arr1={"tom","henry","anna","alice","jack"};
        String temporary = arr1[0];
        for(int i=0, j=arr1.length-1;i<=j;i++,j--){
            temporary =arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temporary;


        }
        System.out.println(arr1); // 打不出来的具体内容的
        for(int i = 0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
