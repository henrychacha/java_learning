package day04;

public class a5_findArrayIndex {
    public static void main(String[] args) {
        //查找数组中某个元素的索引值
        //初始化一个数组
        String[] arr = {"henry","tom","fence","dick"};
//        String item = "fence";
        int index = -1;
        String item = "tom";
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == item){
                index = i;
//                System.out.println("找到了" + index);
                break;
            }
//            if(i == arr.length){
//                System.out.println("不存在这个项目");
//            }
            System.out.println(index);
        }

    }
}
