/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Tugas_11;

/**
 *
 * @author HP
 */
public class Keledai extends Binatang implements Herbivora{

    private String suara;
    private String warnaBulu;
    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    
    @Override
    public void displayMakan() {
        System.out.println("Jenis : karnivora");
        System.out.println("Makanan : Daging");
    }
    @Override
    public void displayBinatang() {
        
    }

    public void displayData(){
        this.displayMakan();
        super.displayBinatang();
        System.out.println("Suara : "+this.suara);
        System.out.println("Warna Bulu : "+this.warnaBulu);
        System.out.println("---------------------------------------------");
    }
    
}
