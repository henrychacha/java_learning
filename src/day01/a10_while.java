package day01;

public class a10_while {
    public static void main(String[] args) {
        //while
        int i =1;
        while(i<11){
            System.out.println("stop being stupid");
            i++;
        }

        // how many number can be divided by 7 within 100
        int i2 = 1;
        int count = 0;
        while(i2<101){
            if(i2%7 == 0){
                count++;
                System.out.println(i2);
            }
            i2++;

        }
        System.out.println(count);

    }
}
