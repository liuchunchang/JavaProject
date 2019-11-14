package com;

public class day18 implements day17{

    @Override
    public void a() {
        day17.A();
    }

    @Override
    public void b() {

    }

    public static void main(String[] args) {
        // write your code here
       day18 day =new day18();
       day.a();
       day17.A();
    }
}
