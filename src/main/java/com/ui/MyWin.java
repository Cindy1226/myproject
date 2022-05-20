package com.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin {
    public static void main(String[] args) {
        //swing,SWT,JavaFX
        //extention
        JFrame frame = new JFrame();
        frame.setSize(600,400);
        frame.setLocation(300,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //add component
        JButton button = new JButton("ok");
        //匿名類別,Anonymous class 大括號很重要
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hahaha");
            }
        });
        //MyActionListener listener = new MyActionListener();
        //button.addActionListener(listener);
        //layout
        //frame.setLayout(new BorderLayout());
        frame.setLayout(new FlowLayout());
        frame.add(button);

        frame.setVisible(true);
        System.out.println("end?");
    }
}
