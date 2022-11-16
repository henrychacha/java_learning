package day01;

public class a6_If {
    public static void main(String[] args) {
        int age = 16;
        // the first formation of if
        if(age>14){
            System.out.println("你可以进入该场所");
        }
        // the second formation of If
        if(age>16){
            System.out.println("你可以进入");
        }else{
            System.out.println("你还太小了");
        }
        // the third formation of If
        if(age>18){
            System.out.println("you can have fun here");
        }else if(age>16){
            System.out.println("you can view by side");
        }else if(age>13){
            System.out.println("you can audit");
        }else{
            System.out.println("you are inhabited");
        }
    }
}
