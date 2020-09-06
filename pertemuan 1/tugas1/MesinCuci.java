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
public class MesinCuci extends elektronik{
    private String Fitur, jenis;
    private int kapasitas;
    
    public void setFitur(String newValue){
        Fitur = newValue;
    }
    public void setJenis(String newValue){
        jenis = newValue;
    }
     public void setKapasitas(int newValue){
         kapasitas = newValue;
    }
    
    public void cetakInfo(){
        System.out.println("----------------------------------");
        info();
        System.out.println("Fitur : "+Fitur);
        System.out.println("Kapasitas : "+kapasitas);
        System.out.println("jenis : "+jenis);
    }
}
