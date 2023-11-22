import java.io.*;
import java.util.*;

public class TestTruck{
   public static void main(String args[]){
      Truck truk=new Truck(1000);
         Scanner console = new Scanner(System.in);
         System.out.println("Muatan maksimal : "+truk.getMuatanMaks());
         
         System.out.print("Tambah muatan : ");
         double a = console.nextDouble();
         truk.tambahMuatan(a);
         
         System.out.print("Tambah muatan : ");
         double b = console.nextDouble();
         truk.tambahMuatan(b);
         
         System.out.print("Tambah muatan : ");
         double c = console.nextDouble();
         truk.tambahMuatan(c);
         
         System.out.print("Tambah muatan : ");
         double d = console.nextDouble();
         truk.tambahMuatan(d);
         
         System.out.println("Muatan sekarang = "+truk.getMuatan());
       }
}
