package cn;

public class day3_main {
    public static void main(String[] args) {
        // write your code here
        day3 one=new day3();
        day3_2 two=new day3_2();
        one.start();
        two.start();
        for(int i=0;i<20;i++){
            System.out.println("主线程\t"+(i+1));
        }
    }
}
