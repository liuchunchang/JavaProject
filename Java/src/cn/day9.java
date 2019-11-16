package cn;

import javax.swing.*;
import java.awt.*;

class ex extends Canvas {
    Toolkit tool;
    Image image;

    ex() {
        setSize(400, 400);
        tool = getToolkit();
        image = tool.getImage("timg.jpg");
    }

    public void paint(Graphics graphics) {
        graphics.drawImage(image, 500, 500,
                image.getWidth(this),
                image.getHeight(this),
                this);
    }
}

public class day9 {
    public static void main(String[] args) {
        // write your code here
        JFrame win = new JFrame();
        Toolkit tool= win.getToolkit();
        Image image = tool.getImage("timg.jpg");
        win.setIconImage(image);
        win.setSize(800, 800);
        win.add(new ex());
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}



