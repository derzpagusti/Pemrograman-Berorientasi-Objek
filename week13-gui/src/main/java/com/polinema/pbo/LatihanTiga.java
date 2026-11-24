package com.polinema.pbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LatihanTiga {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dua Input TextField");
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Angka 1:");
        label1.setBounds(20, 20, 120, 25);
        frame.add(label1);

        JTextField input1 = new JTextField();
        input1.setBounds(150, 20, 120, 25);
        frame.add(input1);

        JLabel label2 = new JLabel("Angka 2:");
        label2.setBounds(20, 60, 120, 25);
        frame.add(label2);

        JTextField input2 = new JTextField();
        input2.setBounds(150, 60, 120, 25);
        frame.add(input2);

        JButton tombol = new JButton("Tampilkan");
        tombol.setBounds(20, 100, 120, 30);
        frame.add(tombol);

        JTextField output = new JTextField();
        output.setBounds(150, 100, 180, 30);
        output.setEditable(false);
        frame.add(output);

        tombol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String angka1 = input1.getText(); 
                String angka2 = input2.getText(); 

                output.setText("Input 1: " + angka1 + " | Input 2: " + angka2);
            }
        });

        frame.setVisible(true);
    }
}