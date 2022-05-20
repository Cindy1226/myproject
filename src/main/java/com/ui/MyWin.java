package com.ui;

import javax.swing.*;
import java.awt.*;

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
        //layout
        //frame.setLayout(new BorderLayout());
        frame.setLayout(new FlowLayout());
        frame.add(button);

        frame.setVisible(true);
        System.out.println("end?");
    }
}
