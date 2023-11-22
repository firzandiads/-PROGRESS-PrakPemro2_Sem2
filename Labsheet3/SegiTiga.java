//Firzandi Ahsan Dwi Styana - 21537144016

public class SegiTiga extends Geometri{
    
    int alas;
    int tinggi;
    int sisi;

    public SegiTiga(int alas, int tinggi, int sisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public float keliling(){
        return this.sisi * 3;
    }  

    public float luas(){
        return this.alas * this.tinggi;
    }
}