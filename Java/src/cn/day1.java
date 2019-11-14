package cn;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Math.*;

public class day1 {
    public static void main(String[] args) {
        // write your code here
        Date day=new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        System.out.println(ft.format(day));
        double a,b,c;
//        for(int i=0;i<5;i++){
            a=random()*100;
            b=random()*10;
            c=random();
            System.out.println(round(a));
            System.out.println(round(b));
            System.out.println(round(c));
            System.out.println(floor(a));
            System.out.println(floor(b));
            System.out.println(c);
//        }
    }
}
