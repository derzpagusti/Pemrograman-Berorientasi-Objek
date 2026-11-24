package com.polinema.pbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Registrasi {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Registrasi Mahasiswa");
        frame.setSize(450, 420); 
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblNama = new JLabel("Nama:");
        lblNama.setBounds(20, 20, 100, 25);
        frame.add(lblNama);

        JTextField txtNama = new JTextField();
        txtNama.setBounds(130, 20, 250, 25);
        frame.add(txtNama);

        JLabel lblNim = new JLabel("NIM:");
        lblNim.setBounds(20, 60, 100, 25);
        frame.add(lblNim);

        JTextField txtNim = new JTextField();
        txtNim.setBounds(130, 60, 250, 25);
        frame.add(txtNim);

        JLabel lblProdi = new JLabel("Prodi:");
        lblProdi.setBounds(20, 100, 100, 25);
        frame.add(lblProdi);

        JTextField txtProdi = new JTextField();
        txtProdi.setBounds(130, 100, 250, 25);
        frame.add(txtProdi);

        JLabel lblAlamat = new JLabel("Alamat:");
        lblAlamat.setBounds(20, 140, 100, 25);
        frame.add(lblAlamat);

        JTextField txtAlamat = new JTextField();
        txtAlamat.setBounds(130, 140, 250, 25);
        frame.add(txtAlamat);

        JLabel lblAsalSekolah = new JLabel("Asal Sekolah:");
        lblAsalSekolah.setBounds(20, 180, 100, 25);
        frame.add(lblAsalSekolah);

        JTextField txtAsalSekolah = new JTextField();
        txtAsalSekolah.setBounds(130, 180, 250, 25);
        frame.add(txtAsalSekolah);

        JButton btnSimpan = new JButton("Simpan");
        btnSimpan.setBounds(20, 220, 140, 30);
        frame.add(btnSimpan);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(190, 220, 140, 30);
        frame.add(btnReset);

        JTextArea areaHasil = new JTextArea();
        areaHasil.setBounds(20, 260, 380, 100);
        areaHasil.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(areaHasil);
        scrollPane.setBounds(20, 260, 380, 100);
        frame.add(scrollPane);

        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = txtNama.getText().trim();
                String nim = txtNim.getText().trim();
                String prodi = txtProdi.getText().trim();
                String alamat = txtAlamat.getText().trim();
                String asalSekolah = txtAsalSekolah.getText().trim();

                if (nama.isEmpty() || nim.isEmpty() || prodi.isEmpty()
                        || alamat.isEmpty() || asalSekolah.isEmpty()) {

                    JOptionPane.showMessageDialog(frame,
                            "Semua field harus diisi! (Termasuk Alamat dan Asal Sekolah)",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                areaHasil.setText("Data Berhasil Disimpan:\n");
                areaHasil.append("Nama         : " + nama + "\n");
                areaHasil.append("NIM          : " + nim + "\n");
                areaHasil.append("Prodi        : " + prodi + "\n");
                areaHasil.append("Alamat       : " + alamat + "\n");
                areaHasil.append("Asal Sekolah : " + asalSekolah + "\n");

                JOptionPane.showMessageDialog(frame,
                        "Data berhasil disimpan!",
                        "Sukses",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNama.setText("");
                txtNim.setText("");
                txtProdi.setText("");
                txtAlamat.setText("");
                txtAsalSekolah.setText("");
                areaHasil.setText("");
            }
        });

        frame.setVisible(true);
    }
}