/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_teori.exercise_1;

/**
 *
 * @author HP
 */
public class Bayaran {
    public int hitungBayaran(Pegawai pg){
        int uang = pg.getGaji();

        if(pg instanceof Manager){
            uang +=((Manager)pg).getTunjangan();
        }else if(pg instanceof Programmer){
            uang +=((Programmer)pg).getBonus();
        }
        return uang;
    }

    
}
