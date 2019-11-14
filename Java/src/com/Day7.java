package com;

import javax.swing.*;

public class Day7 extends JFrame {
    // write your code here
    JMenuBar menuBar;
    JMenu menu, subMenu,menu2;
    JMenuItem item1, item2,item3;
    public Day7(String s,int x,int y,int w,int h) {
        init(s);
        setLocation(x,y);
        setSize(w,y);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void init(String s) {
        setTitle(s);
        menuBar=new JMenuBar();
        menu=new JMenu("菜单");
        menu2=new JMenu("菜单二");
        subMenu=new JMenu("软件项目");
        item1=new JMenuItem("java话题");
        item2=new JMenuItem("动画话题");
        item3=new JMenuItem("动画话题");
//        item1.setAccelerator(KeyStroke.getKeyStroke('A'));
//        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        menu.addSeparator();
        menu.add(item2);
        menu.add(subMenu);
        subMenu.add(new JMenuItem("汽车销售系统"));
        subMenu.add(new JMenuItem("农场信息系统"));
        menu2.add(item1);
//        加一条横线
        menu2.addSeparator();
        menu2.add(item3);
        menuBar.add(menu);
        menuBar.add(menu2);
        setJMenuBar(menuBar);
    }
}

