package club;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class day1_jframe extends day1 implements ActionListener {
    Container container;
    JLabel jLabel1, jLabel2;
    JTextField jTextField1;
    JPasswordField jPasswordField1;
    JButton jButton1, jButton2;

    public day1_jframe() {
        super("用户登录", 400, 230);
        init();
        listener();

    }

    private void listener() {
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
    }

    private void init() {
        container = this.getContentPane();
        container.setLayout(null);
        jLabel1 = new JLabel("账户");
        jLabel1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
        jLabel1.setBounds(51, 33, 83, 30);
        jLabel2 = new JLabel("密码");
        jLabel2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
        jLabel2.setBounds(51, 85, 83, 30);
        jTextField1 = new JTextField(10);
        jTextField1.setBounds(158, 33, 157, 30);
        jTextField1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
        jPasswordField1 = new JPasswordField(10);
        jPasswordField1.setBounds(158, 85, 157, 30);
        jPasswordField1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
        jButton1 = new JButton("确定");
        jButton1.setBounds(61, 140, 100, 30);
        jButton1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
        jButton2 = new JButton("取消");
        jButton2.setBounds(225, 140, 100, 30);
        jButton2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
        container.add(jButton2);
        container.add(jButton1);
        container.add(jTextField1);
        container.add(jPasswordField1);
        container.add(jLabel1);
        container.add(jLabel2);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        // write your code here
        new day1_jframe();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton1) {
            if (jTextField1.getText().equals("123") && jPasswordField1.getText().equals("123")) {
                JLabel label = new JLabel("登录成功");
                label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
                JOptionPane.showMessageDialog(null, label, "成功", JOptionPane.PLAIN_MESSAGE);
                System.out.println("登录成功");
            } else {
                JLabel label = new JLabel("你输入的账号或密码有误");
                label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
                JOptionPane.showMessageDialog(null, label, "登录失败", JOptionPane.ERROR_MESSAGE);
                System.out.println("登录失败");
            }
        } else if (e.getSource() == jButton2) {
            System.out.println("取消");
            System.exit(0);
        }
    }
}
