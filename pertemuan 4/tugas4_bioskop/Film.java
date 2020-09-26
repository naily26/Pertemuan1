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
public class Film {
    public String kode;
    private String judul;
    private String jamTayang;
    private int durasi;
    public Studio studio;
    
    Film(String kode){
        this.kode = kode;
        this.cekKode(kode);
    }
    
    public void setKode(String kode){
        this.kode = kode;
    }
    public String getKode(){
        return kode;
    }
    public void cekKode(String kode){
        switch (kode){
            case "A01" :
                judul = "Nanti Kita Cerita Tentang Hari Ini";
                jamTayang = "15.00 pm";
                durasi = 90;
                studio = new Studio(1);
                 break;
            case "B01" :
                judul = "Milea";
                jamTayang = "15.00 pm";
                durasi = 90;
                studio = new Studio(2);
                 break;
            case "A02" :
                judul = "Dignitate";
                jamTayang = "20.00 pm";
                durasi = 120;
                studio = new Studio(1);
                break;
            case "B02" :
                judul = "Teman Tapi Menikah 2";
                jamTayang = "20.00 pm";
                durasi = 120;
                studio = new Studio(2);
                break;
            default:
                System.out.println("kode tidak tersedia");
        }
    }
public String info(){
    String info = "";
    info += "Daftar Penonton kode "+this.kode+" \n";
    info += "======================================= \n";   
    info += "Judul : "+judul+"\n";
    info += "Jam Tayang : "+jamTayang+"\n";
    info += "Durasi : "+durasi+"\n";
    info +=  studio.Info();
    info += "=======================================";  
    return info;
}
    

    
    
}
