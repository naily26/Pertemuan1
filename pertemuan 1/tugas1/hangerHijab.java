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
public class hangerHijab {
    private String jenisHijab;
    private int jumlahHijab;
    
    public void setJenisHijab(String newValue){
        jenisHijab = newValue;
    }
     public void setJumlah(int newValue){
         jumlahHijab = newValue;
    }
    public void ambilHijab(int newValue){
        jumlahHijab -= newValue;
    }
    public void tambahJumlahhijab(int newValue){
        jumlahHijab += newValue;
    }
    public void cetakInfo(){
        System.out.println("----------------------------------");
        System.out.println("Jenis Hijab : "+jenisHijab);
        System.out.println("jumlah Hijab : "+jumlahHijab);
    }

}
