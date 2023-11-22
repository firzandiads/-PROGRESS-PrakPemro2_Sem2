import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;

class CobaGUI{
    CobaGUI(){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400, 400);  
        frame.setLayout(new FlowLayout());
        
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, World!");
        JLabel label2 = new JLabel("Firzandi Ahsan Dwi Styana");
        JLabel label3 = new JLabel("21537144016");

        frame.add(label);
        frame.add(label2);
        frame.add(label3);
    }
}

public class Pertemuan4 {
    public static void main (String[] args){
        CobaGUI objGui = new CobaGUI();
    }
}
