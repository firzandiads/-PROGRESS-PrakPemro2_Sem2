//Firzandi Ahsan Dwi Styana - 21537144016

public class Lingkaran extends Geometri{
    int r;

    public Lingkaran(int r){
        this.r = r;
    }

    public float keliling(){
        return(float) (2 * Math.PI * r);
    }

    public float luas(){
        return(float) (Math.PI * r * r);
    }

}
