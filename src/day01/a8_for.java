package day01;

public class a8_for {
    public static void main(String[] args) {
        //for
        for(int i=1;i<11;i++){
            System.out.println("don't be stupid");
        }
        // print number 1 to 5
        for(int i=1;i<6;i++){
            System.out.println(i);
        }
        // print number 1 to 5
        for(int i=5;i>0;i--){
            System.out.println(i);
        }
        // the sum of 1 to 100
        int s = 0;
        for(int i=1;i<101;i++){
            s += i;
        }
        System.out.println(s);
        // the sum of even within 100
//        int s2 = 0;
//        for(int i=0;i<101;i=1+2){ //错误
//            s2 += i;
//        }
//        System.out.println(s2);
        int s2 = 0;
        for(int i=0;i<101;i++){
            if(i%2 == 0){
                s2 += i;
            }
        }
        System.out.println(s2);
    }
}
