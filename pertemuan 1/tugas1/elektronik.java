/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author HP
 */
public class elektronik {
    
    public String merk;
    public int BiayaListrik, waktuPenggunaan, tarif=1000;
    public double daya;
   
    public void setMerk(String newValue){
   merk = newValue;
}
   public void konfersiDaya(){
      daya /= 1000;
   }
   public void hitungBiaya(){
       konfersiDaya();
       BiayaListrik = (int) (daya * waktuPenggunaan * tarif);
   } 
   public void info(){
       System.out.println("Merk : "+merk);
       System.out.println("daya : "+daya+" watt");
        System.out.println("Biaya : "+BiayaListrik);
   }
}
