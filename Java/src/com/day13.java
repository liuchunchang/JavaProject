package com;

import java.net.URL;
import java.util.Scanner;

public class day13 {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner;
        URL url;
        Thread readURL;
        Look look=new Look();
        System.out.println("输出URL资源，例如：http://baidu.com");
        scanner =new Scanner(System.in);
        String source = scanner.nextLine();
        try{
            url=new URL(source);
            look.setURL(url);
            readURL=new Thread(look);
            readURL.start();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
