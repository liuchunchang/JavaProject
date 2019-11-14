package com;

import javax.swing.*;

public class day8 extends JFrame {
    Box boxH;
    Box boxVone, boxVTwo;

    public day8() {
        setLayout(new java.awt.FlowLayout());
        init();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void init() {
        setBounds(100,100,400,400);
        boxH = Box.createHorizontalBox();
        boxVone = Box.createVerticalBox();
        boxVTwo = Box.createVerticalBox();
        boxVone.add(new JLabel("姓名"));
        boxVone.add(new JLabel("职业"));
        boxVTwo.add(new JTextField(10));
        boxVTwo.add(new JTextField(10));
        boxH.add(boxVone);
        boxH.add(Box.createHorizontalStrut(10));
        boxH.add(boxVTwo);
        add(boxH);
    }

}
