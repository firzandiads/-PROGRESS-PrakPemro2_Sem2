//Firzandi Ahsan Dwi Styana - 21537144016

public class SegiEmpat extends Geometri{
    
    int sisi;

    public SegiEmpat(int sisi){
        this.sisi = sisi;
    }

    public float keliling(){
        return this.sisi * 4;
    }  

    public float luas(){
        return this.sisi * this.sisi;
    }
    
}