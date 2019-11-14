package cn;

import java.text.SimpleDateFormat;
import java.util.Date;

public class day4 implements Runnable {
    int time=0;
    SimpleDateFormat simpleDateFormat =new SimpleDateFormat("hh:mm:ss");
    Date date;
    @Override
    public void run() {
            while (true){
                date=new Date();
                System.out.println(simpleDateFormat.format(date));
                time++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (time==3){
                    Thread thread=Thread.currentThread();
                    thread=new Thread(this);
                    thread.start();
                }
            }
    }
}
