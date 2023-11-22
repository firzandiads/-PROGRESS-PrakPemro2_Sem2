//Firzandi Ahsan Dwi Styana - 21537144016

public class Main {
    public static void main(String[] args) {

        Mobil car = new Mobil(12.67, 47.0, "Esemka", "Pertamax TURBO");
        car.tampilkan();

        Bus bis = new Bus(120.0, 300.0, 420, 31);
        bis.tampilkan();

        Motor motorcycle = new Motor(60, 5.0, "Kawasaki In-line Four", 2021);
        motorcycle.tampilkan();


    }
}