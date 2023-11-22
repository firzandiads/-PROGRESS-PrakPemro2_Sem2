//Firzandi Ahsan Dwi Styana - 21537144016

public class Bus extends Kendaraan {
    private int besar;
    private int jumlahKursi;

    public Bus(double komsumsiBbm, double kapasitasTank, int besar, int jumlahKursi) {
        super(komsumsiBbm, kapasitasTank);
        this.besar = besar;
        this.jumlahKursi = jumlahKursi;
    }

    public void tampilkan() {
        System.out.println();
        System.out.println("------KENDARAAN BUS------");
        System.out.println();

        super.tampilkan();

        System.out.println("Besar:  " + this.besar);
        System.out.println("Jumlah kursi: " + this.jumlahKursi);
        System.out.println("-------------------------");
        System.out.println();
        System.out.println();
    }

}