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
public class lampu {
    private String merk;
    private int voltase;
    private int ampere;
    private int daya;
    
    public void setMerk(String newValue){
        merk = newValue;
    }
    public void setVoltase(int newValue){
        voltase = newValue;
    }
    public void setAmpere(int newValue){
        ampere = newValue;
    }
    public void hitungDaya(){
        daya = voltase * ampere;
    }
    public void kurangiDaya(int newValue){
        daya -= newValue;
    }
    public void cetakInfo (){
        System.out.println("----------------------------------");
        System.out.println("Merk : "+merk);
        System.out.println("voltase : "+voltase+" V");
        System.out.println("Ampere : "+ampere+"A");
        System.out.println("Daya : "+daya+" watt");
    }
}
