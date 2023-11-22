//Firzandi Ahsan Dwi Styana - 21537144016

public class Mobil extends Kendaraan {
    private String merk;
    private String jenisBbm;

    public Mobil(double komsumsiBbm, double kapasitasTank, String merk, String jenisBbm) {
        super(komsumsiBbm, kapasitasTank);
        this.merk = merk;
        this.jenisBbm = jenisBbm;
    }

    public void tampilkan() {
        System.out.println();
        System.out.println("------KENDARAAN MOBIL------");
        System.out.println();
        
        super.tampilkan();

        System.out.println("Merk: " + this.merk);
        System.out.println("Jenis BBM: " + this.jenisBbm);
        System.out.println("---------------------------");
        System.out.println();
        System.out.println();
    }
}
