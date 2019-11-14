package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class day11_jfram extends JFrame implements ActionListener {
    private JPanel jPanel1;
    private JScrollPane jScrollPane;
    private JTable jTable;
    public JButton jButton,jButton1;
    public ResultSet result;
    int i = 0, j = 0, k = 0, n = 0;
    Object a[][];
    Object name[] = {"ID", "文具名", "价格","操作"};


    public day11_jfram() throws SQLException {
        init2();
        init();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void init2() throws SQLException {
        jButton1=new JButton("删除");
        day11 day = new day11();
        result = day.mysql();
        result.last(); //结果集指针知道最后一行数据
        n = result.getRow();  //获取数据的条数；
        System.out.println(n);
        result.beforeFirst();
        a = new Object[n][4];
        try {
            for (k = 0; k < n; k++) {
                result.next();
                String item_id = result.getString("item_id");
                String cn_name = result.getString("cn_name");
                String price = result.getString("price");
                a[i][j] = item_id;
                j++;
                a[i][j] = cn_name;
                j++;
                a[i][j] = price;
                a[i][3]=jButton1;
                j=0;
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void init() {
        jPanel1 = new JPanel();
        jTable = new JTable(a, name);
        jScrollPane = new JScrollPane(jTable);
        jButton = new JButton("查询数据库java中的study_tool表格");
        jButton.addActionListener(this::actionPerformed);
        jPanel1.add(jButton);
        this.add(jPanel1, BorderLayout.NORTH);
        this.add(jScrollPane, BorderLayout.CENTER);
        setBounds(200, 100, 500, 300);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton) {
            System.out.println("功能未完成");
        } else {
            System.out.println("出错");
        }
    }
}
