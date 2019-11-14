package com;

public class day2_main {
    public static void main(String[] args) {
        // write your code here
        day2 two = new day2("刘春常");
        two.Age(18);
        two.Xingqu("乒乓球");
//        后面加f表示是float类型
        two.Height(170.3f);
        two.print();
        day2 one =new day2("王志伟");
        one.Age(80);
        one.Xingqu("读书");
        one.Height(150.4f);
        one.print();
    }
}
