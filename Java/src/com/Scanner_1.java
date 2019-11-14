package com;

public class Scanner_1 {
    public static void main(String[] args) {
        // write your code here
        //        构造Scanner类对象，它附属于标准输入流System.in。Scanner s = new Scanner(System.in);
        //        常用的next()方法系列：      （1） nextInt():输入整数   （2） nextLine():输入字符串    
        //                             （3）nextDouble():输入双精度数    （4） next():输入字符串（以空格作为分隔符）。
        int x;
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入一个整数：（按回车键结束）");
        x = s.nextInt();
        if (x < 100) {
            System.out.println("你输入的是：" + x);
            System.out.println("x<100");
        } else {
            System.out.println("你输入的是：" + x);
            System.out.println("x>=100");
        }
        s.close();
    }
}
