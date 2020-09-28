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
public class Pria extends Manusia{
    private Wanita istri;

    public Pria(Wanita istri, int umur, String nama, boolean dewasa) {
        super(umur, nama, dewasa);
        this.istri = istri;
    }

    public Pria() {
    }
    public boolean cekDewasa(){
        boolean dws;
        if(super.getUmur() >= 22){
            dws = true; 
            this.setIstri(istri);
        }
        else {
            dws = false;
            istri = null;
            System.out.println("status : Pria ini masih kuliah");
        }
        super.setDewasa(dws);
        return dws;
    }

    public Wanita getIstri() {
        return istri;
    }

    public void setIstri(Wanita istri) {
        this.istri = istri;
    }
    
    public String info(){
        String info ="";
        info += "===============================================\n";
        info += super.info()+"\n";
        if (istri != null){
        info += "Istri\n";       
        info += "Nama : "+istri.getNama()+"\n";
        info += "Umur : "+istri.getUmur()+"\n";  
        }
        return info;
    }
}
