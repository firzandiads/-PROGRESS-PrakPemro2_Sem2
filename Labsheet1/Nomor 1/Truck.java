public class Truck{
   public double muatan;
   public double muatanmaks;
   
   public Truck(double beratmaks){
      muatanmaks=beratmaks;
   }
   public double getMuatan(){
      return muatan;
   }
   public double getMuatanMaks(){
      return muatanmaks;
   }
   public void tambahMuatan(double berat){
      muatan += berat;
      if(muatan > muatanmaks)
      muatan -= berat;
   }
}