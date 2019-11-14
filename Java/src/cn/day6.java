package cn;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

public class day6 extends JPanel {
    public void paint(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        Arc2D arc2D = new Arc2D.Double(0, 0, 100, 100, -90, -180, Arc2D.PIE);
        graphics2D.setColor(Color.BLACK);
        graphics2D.fill(arc2D);
        graphics2D.setColor(Color.white);
        arc2D.setArc(0, 0, 100, 100, -90, 180, Arc2D.PIE);
        graphics2D.fill(arc2D);
        arc2D.setArc(25, 0, 50, 50, -90, -180, Arc2D.PIE);
        graphics2D.fill(arc2D);
        graphics2D.setColor(Color.BLACK);
        Ellipse2D ellipse2D=new Ellipse2D.Double(40,15,20,20);
        graphics2D.fill(ellipse2D);
        arc2D.setArc(25,50,50,50,90,-180,Arc2D.PIE);
        graphics2D.fill(arc2D);
        graphics2D.setColor(Color.white);
        ellipse2D.setFrame(40,65,20,20);
        graphics2D.fill(ellipse2D);
        graphics.setColor(Color.BLACK);
        Polygon polygon=new Polygon();
        polygon.addPoint(150,10);
        polygon.addPoint(100,90);
        polygon.addPoint(210,90);
        polygon.addPoint(260,10);
        graphics2D.draw(polygon);
    }


    public static void main(String[] args) {
        // write your code here
        JFrame win=new JFrame();
        win.setBounds(500,300,300,150);
        win.add(new day6());
        win.setResizable(false);
        win.setVisible(true);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
