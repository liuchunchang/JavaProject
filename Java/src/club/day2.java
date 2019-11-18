package club;

import javax.swing.*;
import java.awt.*;

public class day2 extends JFrame {

    JFrame jFrame;
    Container container;
     JLabel jLabel;
    private double width = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private double height = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    int x = 400;
    int y = 500;
    int x1 = (int) ((width - x) / 2);
    int y1 = (int) ((height - y) / 2);

    day2() {
        init();
        listener();
    }

    private void listener() {
    }

    private void init() {
        jFrame = new JFrame("计算器");
        container = jFrame.getContentPane();
        jLabel=new JLabel();
        jLabel.setBounds(10,10,350,50);
        jLabel.setFont(new Font("微软雅黑",Font.PLAIN,20));
        jLabel.setText("nihao");
        container.add(jLabel);
        jFrame.setBounds(x1, y1, x, y);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // write your code here
        new day2();
    }
}
