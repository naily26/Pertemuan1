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
public class Wanita extends Manusia{
    private Pria suami;
    private Manusia anak;

    public Wanita(Pria suami, Manusia anak, int umur, String nama, boolean dewasa) {
        super(umur, nama, dewasa);
        this.suami = suami;
        this.anak = anak;
        this.cekDewasa(umur);
    }

    public Wanita() {
    }
    
    public boolean cekDewasa(int umur){
        boolean dws;
        if(umur >= 20){
            dws = true;
            this.setSuami(suami);
            this.setAnak(anak);
        }
        else {
            System.out.println("Wanita ini masih kuliah");
            anak = null;
            suami = null;
            dws = false;
        }
        super.setDewasa(dws);
        return dws;
    }

    public Pria getSuami() {
        return suami;
    }

    public void setSuami(Pria suami) {
        this.suami = suami;
    }

    public Manusia getAnak() {
        return anak;
    }

    public void setAnak(Manusia anak) {
        this.anak = anak;
    }
    public String info(){
        String info = "";
        info += "===============================================\n";
        info += super.info()+"\n";
        if (suami != null){
        info += "Suami\n";
        info += "Nama : "+suami.getNama()+"\n";
        info += "Umur : "+suami.getUmur()+"\n";
        if (anak != null){
        info += "anak\n";
        info += "Nama : "+anak.getNama()+"\n";
        info += "umur : "+anak.getUmur()+"\n";
        }
        }
        return info;
    }
}
