package club;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class day1 extends JFrame {
//    获取屏幕的宽
    private double screenWidth= Toolkit.getDefaultToolkit().getScreenSize().getWidth();
//    获取屏幕的高
    private double screenHeight=Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    public day1(String title,int width,int height){
        super(title);
        setSize(width,height);
        int x= (int) (screenWidth-width)/2;
        int y= (int) (screenHeight-height)/2;
        setLocation(x,y);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.out.println("退出");
                System.exit(0);
            }
        });
    }
}
