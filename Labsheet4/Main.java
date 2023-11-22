//Firzandi Ahsan Dwi Styana - 21537144016

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;

class Kalkulator extends JFrame {
    Kalkulator() {
        setVisible(true);
        setSize(195, 280);
        setTitle("~KALKULATOR~");

        JTextField text = new JTextField("0", 14);

        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        JButton operator1 = new JButton("+");
        JButton operator2 = new JButton("-");
        JButton operator3 = new JButton("*");
        JButton operator4 = new JButton("/");
        JButton operator5 = new JButton("=");
        JButton operator6 = new JButton("=");

        add(text);
        add(button0);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(operator1);
        add(operator2);
        add(operator3);
        add(operator4);
        add(operator5);
        add(operator6);
        setLayout(new FlowLayout());
    }
}

class Calculator {
    public static void main(String[] args) {
        Kalkulator calculator = new Kalkulator();
    }
}