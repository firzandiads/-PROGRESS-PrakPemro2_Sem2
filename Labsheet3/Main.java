//Firzandi Ahsan Dwi Styana - 21537144016

public class Main {
    public static void main(String[] args){
        Geometri geometri = new Geometri();
        SegiEmpat segiempat = new SegiEmpat(5);
        SegiTiga segitiga = new SegiTiga(8, 7, 8);
        Lingkaran lingkaran = new Lingkaran(35);

        System.out.println();

        geometri.keliling();
        System.out.println("Keliling bangun datar segi empat adalah " + segiempat.keliling());
        System.out.println("Keliling bangun datar segitiga adalah " + segitiga.keliling());
        System.out.println("Keliling bangun datar lingkaran adalah " + lingkaran.keliling());
        System.out.println();

        geometri.luas();
        System.out.println("Luas bangun datar segi empat adalah " + segiempat.luas());
        System.out.println("Luas bangun datar segitiga adalah " + segitiga.luas());
        System.out.println("Luas bangun datar lingkaran adalah " + lingkaran.luas());
        System.out.println();
    }
}
