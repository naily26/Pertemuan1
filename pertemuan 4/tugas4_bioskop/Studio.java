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
public class Studio {
    public int nomorStudio;
    private Kursi arrayKursi[] = new Kursi[10];
    private int index;
    
    public Studio(int nomorStudio){
        this.nomorStudio = nomorStudio;
        this.initKursi();
    }
   
    public void setNomorStudio(int nomorStudio){
        this.nomorStudio = nomorStudio;
    }
    public int getNomorStudio(){
        return nomorStudio;
    }
   private void initKursi(){
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    public void setPenonton(Penonton penonton, int nomor) {
        index = nomor - 1;
       if(arrayKursi[index].getPenonton() != null){
           System.out.println("RGRISTRATION FAILED!");
           System.out.println("Kursi telah terisi, silahkan memilih kursi yang lainnya");
           System.out.println(penonton.info());
           
        } else {
        this.arrayKursi[index].setPenonton(penonton);
       }
    }
    public Kursi[] getArrayKursi(){
        return arrayKursi;
    }
    //public String getData(){
        
    //}
    public String Info(){
        String info = "";
info += "studio : " + nomorStudio + "\n";
info += "---------------------------------------"+"\n";
for (Kursi kursi : arrayKursi) {   
    info += kursi.info();
}
return info;
    }
}
