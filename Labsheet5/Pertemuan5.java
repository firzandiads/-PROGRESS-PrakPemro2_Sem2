//Firzandi Ahsan Dwi Styana - 21537144016

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.Font;


class cekBeratBadan extends JFrame implements ActionListener {
    JTextField inputText = new JTextField(15);
    JTextField[] fields = new JTextField[6];
    JLabel[] label = new JLabel[5];
    JButton btnSubmit = new JButton("CEK HASIL");
    ImageIcon icon = new ImageIcon("FLogo.png");

    double berat = 0;
    double tinggi = 0;

    cekBeratBadan() {
        String[] labelAdd = { "Jenis Kelamin (L/P)", "Berat Badan (kg)", "Tinggi Badan (cm)", };

        for (int i = 0; i < labelAdd.length; i++) {
            label[i] = new JLabel(labelAdd[i]);
            fields[i] = new JTextField(16);
            add(label[i]);
            add(fields[i]);
        }

        label[3] = new JLabel("Hasilnya adalah...");
        label[4] = new JLabel();
        label[4].setFont(new Font("Times New Roman", Font.BOLD, 16));

        btnSubmit.addActionListener(this);

        add(btnSubmit);
        add(label[3]);
        add(label[4]);

        setLayout(new FlowLayout());
        setSize(220, 260);
        setVisible(true);
        setResizable(true);

        setIconImage(icon.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void hasilSetelahCek() {
        berat = Double.parseDouble(fields[1].getText());
        tinggi = Double.parseDouble(fields[2].getText()) * 0.01;

        double bmi = berat / (tinggi * tinggi);

        if (bmi < 18.5) {
            hasilTeksnya("Berat badan dibawah normal", Color.YELLOW);
        } else if (bmi >= 18.5 && bmi < 25) {
            hasilTeksnya("IDEAL", Color.GREEN);
        } else if (bmi >= 25 && bmi < 30) {
            hasilTeksnya("Kegemukan", Color.ORANGE);
        } else if (bmi >= 30 && bmi < 35) {
            hasilTeksnya("Obesitas kelas I", Color.RED);
        } else if (bmi >= 35 && bmi < 40) {
            hasilTeksnya("Obesitas kelas II", Color.RED);
        } else if (bmi >= 40) {
            hasilTeksnya("Obesitas kelas III", Color.RED);
        }
    }

    public void hasilTeksnya(String txt, Color c) {
        label[4].setText(txt);
        label[4].setForeground(c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            System.out.println("Button aktif");
            hasilSetelahCek();
        }
    }
}

public class Pertemuan5 {
    public static void main(String[] args) {
        new cekBeratBadan();
    }
}
