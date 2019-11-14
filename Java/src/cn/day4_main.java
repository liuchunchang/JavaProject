package cn;

public class day4_main {
    public static void main(String[] args) {
        // write your code here
        day4 day=new day4();
        Thread showTime=new Thread(day);
        showTime.start();
    }
}
