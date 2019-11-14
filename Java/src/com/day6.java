package com;

import javax.swing.*;
import java.awt.*;

public class day6 {
    public static void main(String[] args) {
        // write your code here
//        新建一个Jfram窗口
        JFrame window1 = new JFrame("第一个窗口");
        JFrame window2 = new JFrame("第二个窗口");
//        新建一个容器
        Container con = window1.getContentPane();
//        设置容器背景颜色
        con.setBackground(Color.blue);
//        设置jfram的起始位置和长宽
        window1.setBounds(60, 100, 188, 108);
        window2.setBounds(260, 100, 188, 108);
//        设置窗口大小不能改变
        window1.setResizable(false);
//        设置Jfram可见
        window1.setVisible(true);
//        释放当前窗口
        window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 //        设置Jfram可见
        window2.setVisible(true);
 //      关闭当前窗口
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
