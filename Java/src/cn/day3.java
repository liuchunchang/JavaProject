package cn;

public class day3 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println("线程one\t"+(i+1));
        }
    }
}
