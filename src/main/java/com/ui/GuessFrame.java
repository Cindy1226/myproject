package com.ui;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
        //fields
        JTextField number = new JTextField(8);
        JButton button = new JButton("Guess");
        JLabel label = new JLabel("answer");
        int secret = new Random().nextInt(10)+1;


        //constructions
    public GuessFrame() {
            super();
        System.out.println("secret number :"+secret);
            setSize(600, 400);
            setLocation(300, 200);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int num = Integer.parseInt(number.getText());
                    System.out.println(num);
                    Random random = new Random();
                    if (num > secret) {
                        label.setText("smaller");
                    }else if (num < secret) {
                        label.setText("bigger");
                    }else {
                        label.setText("bingo,the secret number is "+ secret);

                    }


                }
            });

            setLayout(new FlowLayout());
            add(number);
            add(button);
            add(label);
            setVisible(true);
        }
        //method






    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();

    }
}
