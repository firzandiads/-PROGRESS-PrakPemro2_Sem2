//Firzandi Ahsan Dwi Styana - 21537144016

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.GridLayout;

class JCekBox extends JFrame{
    JCekBox(){
        JCheckBox cb1 = new JCheckBox();
        JCheckBox cb2 = new JCheckBox();
        JCheckBox cb3 = new JCheckBox();
        JCheckBox cb4 = new JCheckBox();
        JCheckBox cb5 = new JCheckBox();

        cb1.setText("Beli buah apel.");
        cb2.setText("Beli buah pisang.");
        cb3.setText("Beli sayur bayem.");
        cb4.setText("Beli sayur kangkung.");
        cb5.setText("Beli sayur nangka.");
        
        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);
        add(cb5);

        setVisible(true);
        setLayout(new GridLayout());
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

public class Pertemuan655 {
    public static void main(String[] args){
    new JCekBox();
    }
}
