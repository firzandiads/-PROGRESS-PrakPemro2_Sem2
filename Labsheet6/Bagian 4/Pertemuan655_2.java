//Firzandi Ahsan Dwi Styana - 21537144016

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class TombolRadio extends JFrame{
    TombolRadio(){
        JRadioButton rb1 = new JRadioButton("Beli/langganan fitur berbayar.");
        JRadioButton rb2 = new JRadioButton("Skip(menggunakan fitur gratis).");

        ButtonGroup grupAplikasi = new ButtonGroup();
        grupAplikasi.add(rb1);
        grupAplikasi.add(rb2);

        add(rb1);
        add(rb2);

        setVisible(true);
        setLayout(new FlowLayout());
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

public class Pertemuan655_2 {
    public static void main(String[] args){
    new TombolRadio();
    }
}
