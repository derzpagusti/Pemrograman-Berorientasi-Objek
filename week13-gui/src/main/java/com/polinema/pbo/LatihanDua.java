package com.polinema.pbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LatihanDua {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh JLabel");
        frame.setSize(350, 250);
        frame.setLayout(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Masukkan Angka:");
        label.setBounds(20, 20, 120, 25);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(150, 20, 120, 25);
        frame.add(textField);

        JButton btnTampil = new JButton("Tampilkan");
        btnTampil.setBounds(20, 60, 120, 30);
        frame.add(btnTampil);

        JLabel lblHasil = new JLabel("Hasil: -");
        lblHasil.setBounds(150, 60, 150, 30);
        frame.add(lblHasil);

        btnTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText(); 
                lblHasil.setText("Hasil: " + input); 
            }
        });

        frame.setVisible(true);
    }
}