import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

class Plus extends JFrame {

    Plus() {

        JLabel label = new JLabel("Add");
        JTextField text1 = new JTextField(10);
        JLabel label1 = new JLabel("Plus");
        JTextField text2 = new JTextField(10);
        JButton btn1 = new JButton("Result");

        add(label);
        add(text1);
        add(label1);
        add(text2);
        add(btn1);

        setLayout(new FlowLayout());
        setTitle("Penjumlahan");
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public String toString() {
        return "Jumlah []";
    }
}

class Pertemuan4_1 {
    public static void main(String[] args) {
        Plus myObj = new Plus();
    }
}
