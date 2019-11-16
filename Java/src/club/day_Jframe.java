package club;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class day_Jframe implements ActionListener {
    JLabel jLabel;
    JComboBox jComboBox;
    day_music music;
    JFrame jFrame;
    JButton button1, button2;
    Container container;
    ImageIcon icon1, icon2, icon3;
    String gequ = "D:\\CloudMusic\\没有什么不同.mp3";
    String[] ge = {"D:\\CloudMusic\\没有什么不同.mp3", "D:\\CloudMusic\\七友.mp3", "D:\\CloudMusic\\富士山下.mp3"};
    String[] ico = {"./java/src/images/play.png", "./java/src/images/mute.png", "./java/src/images/beijing.jpg"};

    day_Jframe() {
        init();
        lister();
    }

    private void lister() {
        button1.addActionListener(this);
        button2.addActionListener(this);
        jComboBox.addActionListener(this);
    }

    private void init() {
        jFrame = new JFrame("音乐");
        container = jFrame.getContentPane();
//        设置没有布局就是绝对布局
        jFrame.setLayout(null);
        //        相对路径的设置
        button1 = new JButton();
        button1.setBounds(20, 90, 50, 50);
        icon1 = new ImageIcon(ico[0]);
//根据按钮大小改变图片大小
        Image temp = icon1.getImage().getScaledInstance(button1.getWidth(), button1.getHeight(), icon1.getImage().SCALE_DEFAULT);
        icon1 = new ImageIcon(temp);
        button1.setIcon(icon1);
        button2 = new JButton();
        button2.setBounds(90, 90, 50, 50);
        icon2 = new ImageIcon(ico[1]);
//根据按钮大小改变图片大小
        Image temp2 = icon2.getImage().getScaledInstance(button2.getWidth(), button2.getHeight(), icon2.getImage().SCALE_DEFAULT);
        icon2 = new ImageIcon(temp2);
        button2.setIcon(icon2);
        jComboBox = new JComboBox(ge);
        jComboBox.setBounds(300, 20, 250, 30);
        jLabel = new JLabel();
        jLabel.setSize(600, 360);
        icon3 = new ImageIcon(ico[2]);
        Image temp3 = icon3.getImage().getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), icon3.getImage().SCALE_DEFAULT);
        icon3 = new ImageIcon(temp3);
        jLabel.setIcon(icon3);
        container.add(button2);
        container.add(button1);
        container.add(jComboBox);
        container.add(jLabel);
        container.setVisible(true);
        jFrame.setBounds(300, 100, 600, 360);
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
//            判断线程是否正在运行
            music = new day_music(gequ);
            music.start();
            System.out.println("开始");
        } else if (e.getSource() == button2) {
            music.stop();
            System.out.println("暂停");
        } else if (e.getSource() == jComboBox) {
            int index = jComboBox.getSelectedIndex();
            switch (index) {
                case 0:
                    gequ = ge[0];
                    break;
                case 1:
                    gequ = ge[1];
                    break;
                case 2:
                    gequ = ge[2];
                    break;
                default:
                    System.out.println("出错");
            }
        }
    }
}
