//Firzandi Ahsan Dwi Styana - 21537144016

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

class Pertemuan66_4 {
    public static void main(String[] args){
        
        String[] respon = {"IYA!", "TIDAK!", "Bisa Jadi!"};
        ImageIcon objGambarIcon = new ImageIcon("kucing.jpeg");

        JOptionPane.showOptionDialog(
            null,
            "APAKAH BERKAKI EMPAT???",
            "Tebak-tebakan",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            objGambarIcon,
            respon, 0);
    }
}
