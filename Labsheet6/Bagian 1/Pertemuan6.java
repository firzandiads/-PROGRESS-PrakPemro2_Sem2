//Firzandi Ahsan Dwi Styana - 21537144016

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class HalamanBaru extends JFrame{
    HalamanBaru(){
        JFrame frame = new JFrame();
        setVisible(true);
        
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("New Page");

        frame.setVisible(true);
        frame.setSize(400, 400);  
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Firzandi Ahsan Dwi Styana, ");
        JLabel label2 = new JLabel("Universitas Negeri Yogyakarta, ");
        JLabel label3 = new JLabel("Fakultas Teknik, ");
        JLabel label4 = new JLabel("Teknologi Informasi, ");
        JLabel label5 = new JLabel("Angkatan 2021, ");
        JLabel label6 = new JLabel("NIM 21537144016, ");
        JLabel label7 = new JLabel("Kelas J1. ");

        frame.add(label);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
    }
}

class HalamanUtama extends JFrame implements ActionListener{
    JButton tombol = new JButton("Buka halaman baru");

    HalamanUtama(){
        tombol.setFocusable(false);
        add(tombol);
        tombol.addActionListener(this);

        setVisible(true);
        setLayout(new FlowLayout());
        setSize(430,430);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Main page");
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==tombol){
            HalamanBaru HB = new HalamanBaru();
            this.dispose();
        }
    }
}

public class Pertemuan6 {
    public static void main (String[] args){
        HalamanUtama HU = new HalamanUtama();
    }
}
