/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4.tugas4_bioskop;

/**
 *
 * @author HP
 */
public class Kursi {
    private String nomor;
   private Penonton penonton;

    public Kursi(String nomor){
        this.nomor = nomor;
    }
    public void setNomor(String nomor){
        this.nomor = nomor ;
    }
    public String getNomor(){
        return nomor;
    }
    public void setPenonton(Penonton penonton){       
        this.penonton = penonton;
    }
    public Penonton getPenonton(){
        return penonton;
    }
    public String info() {
          String info = "";
           info += "Nomor Kursi: " + nomor + "\n";
          if (this.penonton != null) {
          info += "Penonton : \n" + penonton.info() + "\n"; 
          }
    return info;
    }
}
