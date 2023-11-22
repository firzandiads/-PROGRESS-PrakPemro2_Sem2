//Firzandi Ahsan Dwi Styana - 21537144016

public class Motor extends Kendaraan {
    private String jenisMesin;
    private int tahunProduksi;

    public Motor(double komsumsiBbm, double kapasitasTank, String jenisMesin, int tahunProduksi) {
        super(komsumsiBbm, kapasitasTank);
        this.jenisMesin = jenisMesin;
        this.tahunProduksi = tahunProduksi;
    }

    public void tampilkan() {
        System.out.println();
        System.out.println("------KENDARAAN MOTOR------");
        System.out.println();

        super.tampilkan();

        System.out.println("Jenis mesin: " + this.jenisMesin);
        System.out.println("Tahun produksi: " + this.tahunProduksi);
        System.out.println("---------------------------");
        System.out.println();
        System.out.println();
    }
}
