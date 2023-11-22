//Firzandi Ahsan Dwi Styana - 21537144016

public class Kendaraan {
    protected double komsumsiBbm;
    protected double kapasitasTank;

    public Kendaraan(double komsumsiBbm, double kapasitasTank) {
        this.komsumsiBbm = komsumsiBbm;
        this.kapasitasTank = kapasitasTank;
    }

    public void jarakTempuh() {
        double jarakTempuh = this.kapasitasTank / this.komsumsiBbm;
        System.out.println("Jarak kendaraan yang ditempuh: " + jarakTempuh);
    }

    public void tampilkan() {
        System.out.println("Komsumsi BBM kendaraan: " + this.komsumsiBbm);
        System.out.println("Kapasitas tank pada kendaraan: " + this.kapasitasTank);
        this.jarakTempuh();
    }
}