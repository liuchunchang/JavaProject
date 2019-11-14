package cn;

public class day3_2 extends Thread {
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            System.out.println("线程two\t"+(i+1));
        }
    }
}
