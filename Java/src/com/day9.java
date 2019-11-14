package com;

import javax.swing.*;

public class day9 extends JFrame {
    private JPanel jPanel;
    private JButton button;

    public day9() {
        init();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void init() {
        jPanel = new JPanel();
        button = new JButton("按钮");
        jPanel.add(button);
        setBounds(30, 30, 500, 300);
        add(jPanel);


    }

    public static void main(String[] args) {
        // write your code here
        new day9();
    }
}
