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
public class KipasAngin extends elektronik {
     private String model;
     public int jmlPilihanKecepatan, Pilihankecepatan, diameter;
     
public void setModel(String newValue){
   model = newValue;
}
 public void setDiameter(int newValue){
     diameter = newValue;
 }
 public void tambahKecepatan(){ 
     if (Pilihankecepatan <= jmlPilihanKecepatan){
        Pilihankecepatan +=1; 
     }
 }
 public void kurangiKecepatan(){
     if(Pilihankecepatan > 0){
     Pilihankecepatan -=1;
     }
 }
 public void cetakInfo(){
     System.out.println("----------------------------------");     
     info();
     System.out.println("Model : "+model);
     System.out.println("Diamete : "+diameter);
     System.out.println("Banyak level kecepatan : "+jmlPilihanKecepatan);
     System.out.println("Level kecepatan yg dipilih : "+Pilihankecepatan);
 }
}
