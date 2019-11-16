package club;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class day_Jframe implements ActionListener {
    JFrame jFrame;
    JButton button1, button2, button3;
    Container container;
    ImageIcon icon1, icon2, icon3;
    day_music music = new day_music("D:\\CloudMusic\\没有什么不同.mp3");
    String[] ico = {"./java/src/images/play.png", "./java/src/images/mute.png", "./java/src/images/refresh.png"};

    day_Jframe() {
        init();
        lister();
    }

    private void lister() {
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
    }

    private void init() {
        jFrame = new JFrame("音乐");
        container = jFrame.getContentPane();
//        设置没有布局就是绝对布局
        jFrame.setLayout(null);
        //        相对路径的设置
        button1 = new JButton();
        button1.setBounds(20, 40, 50, 50);
        icon1 = new ImageIcon(ico[0]);
//根据按钮大小改变图片大小
        Image temp = icon1.getImage().getScaledInstance(button1.getWidth(), button1.getHeight(), icon1.getImage().SCALE_DEFAULT);
        icon1 = new ImageIcon(temp);
        button1.setIcon(icon1);
        button2 = new JButton();
        button2.setBounds(90, 40, 50, 50);
        icon2 = new ImageIcon(ico[1]);
//根据按钮大小改变图片大小
        Image temp2 = icon2.getImage().getScaledInstance(button2.getWidth(), button2.getHeight(), icon2.getImage().SCALE_DEFAULT);
        icon2 = new ImageIcon(temp2);
        button2.setIcon(icon2);
        button3 = new JButton();
        button3.setBounds(160, 40, 50, 50);
        icon3 = new ImageIcon(ico[2]);
//根据按钮大小改变图片大小
        Image temp3 = icon3.getImage().getScaledInstance(button3.getWidth(), button3.getHeight(), icon3.getImage().SCALE_DEFAULT);
        icon3 = new ImageIcon(temp3);
        button3.setIcon(icon3);
        container.add(button2);
        container.add(button1);
        container.add(button3);
        container.setVisible(true);
        jFrame.setBounds(300, 100, 500, 300);
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            music.start();
            System.out.println("开始");
        } else if (e.getSource() == button2) {

        } else if (e.getSource() == button3) {


        }
    }

    public static void main(String[] args) {
        // write your code here
        new day_Jframe();
    }
}
