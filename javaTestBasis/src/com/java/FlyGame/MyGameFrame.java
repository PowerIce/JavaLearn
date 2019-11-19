package com.java.FlyGame;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends JFrame {
    @Override
    public void paint(Graphics g) {
        Color c = g.getColor();
        Font f = g.getFont();
        g.setColor(Color.blue);
        g.drawLine(100,100,300,300);
        g.drawRect(100,100,300,300 );
        g.drawOval(100,100,300,300);
        g.fillRect(100,100,40,40);
        g.setColor(Color.red);
        g.drawString("丽丽",200,200);
        g.setFont(new Font("宋体",Font.BOLD,50));
        g.setColor(c);
        g.setFont(f);
    }

    public void launchFrame(){
        this.setTitle("Java测试员");//窗口的Title
        this.setVisible(true);//窗口的显示
        this.setSize(600,600);//窗口的大小
        this.setLocation(500,200);//窗口的position
        this.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }
}
