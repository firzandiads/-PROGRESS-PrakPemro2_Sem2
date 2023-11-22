import java.io.*;
import java.util.*;

public class Purchase{
   Scanner console = new Scanner(System.in);
   double amount;
   boolean taxable;
   double total;
   
   public void inAmount(){
   }
   
   public void inTaxable(){
      System.out.print("Amount : ");
      double amount = console.nextDouble();
 
      System.out.print("Taxable? (true/false) ");
      boolean taxable = console.nextBoolean();
      
         if(taxable == true){
            total = (amount*1.05);
         }else if(taxable == false){
            total = amount;
         }
   }
   public void output(){
      System.out.println("Total : "+total);
   }
}
