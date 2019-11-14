package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class day5_main extends JFrame implements ActionListener {
    private JButton[] buttons;
    private String[] shuzu = {"按钮1", "按钮2", "按钮3", "按钮4", "按钮5"};
    public JTextArea text;
    public String w;

    public day5_main() {
        setTitle("我是一个窗口");
        FlowLayout layout = new FlowLayout();
        Container contens = getContentPane();
        contens.setLayout(layout);
        buttons = new JButton[shuzu.length];
        for (int i = 0; i < 5; i++) {
            buttons[i] = new JButton(shuzu[i]);
            buttons[i].addActionListener(this);
            contens.add(buttons[i]);
        }
        text = new JTextArea(12, 32);
//        将text添加到JScrollpane中
        JScrollPane scrollPane=new JScrollPane(text);
        contens.add(scrollPane);
//        设置窗口大小不可调整
        setResizable(false);
//       设置起始位置和大小
        setBounds(300, 200, 500, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == buttons[0]) {
           text.append("早点睡吧");
           text.append("\r\n");
        } else if (event.getSource() == buttons[1]) {
            text.append("我不！");
            text.append("\r\n");
        } else if (event.getSource() == buttons[2]) {
            text.append("快点去！");
            text.append("\r\n");
        } else if (event.getSource() == buttons[3]) {
            text.append("我偏不！");
            text.append("\r\n");
        } else if (event.getSource() == buttons[4]) {
            Mysql_test m = new Mysql_test();
            w = m.mysql();
            text.append(w);
            text.append("\r\n");
        } else {
            System.out.println("出错");
        }
    }

    public static void main(String[] args) {
        // write your code here
        day5_main V = new day5_main();

    }
}
