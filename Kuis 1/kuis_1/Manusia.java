/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_1;

/**
 *
 * @author HP
 */
public class Manusia {
    private int umur;
    private String nama;
    private boolean dewasa;

    public Manusia(int umur, String nama, boolean dewasa) {
        this.umur = umur;
        this.nama = nama;
        this.dewasa = dewasa;
    }

    public Manusia() {
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isDewasa() {
        return dewasa;
    }

    public void setDewasa(boolean dewasa) {
        this.dewasa = dewasa;
    }
    
    
    public String info(){
        String info="";
        info += "umur : " + umur+ "\n";
        info += "nama : " + nama +"\n";
        info += "dewasa : "+dewasa+"\n";
        return info;
    }
}
