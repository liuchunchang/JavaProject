package com;

public class day2 {
    String name;
    int age;
    String xingqu;
    float height;
    public day2(String name){
        this.name=name;
    }
    public void Age(int age){
        this.age=age;
    }
    public void Xingqu(String xingqu){
        this.xingqu=xingqu;
    }
    public void Height(float height){
        this.height=height;
    }
    public void print(){
        System.out.println("名字："+name);
        System.out.println("年龄："+age);
        System.out.println("兴趣："+xingqu);
        System.out.println("身高："+height);
        System.out.println("-------------------------");
    }
}
