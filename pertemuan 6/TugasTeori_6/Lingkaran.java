/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTeori_6;

/**
 *
 * @author HP
 */
public class Lingkaran extends BangunDatar{
    public float r;
    public float phi=(float) 3.14;
    
    public float luas(){
        luas = (float) (phi * r * r);
        System.out.println("Luas lingkaran: " + luas);
        return luas;
    }
    
   
    public float keliling(){
        keliling = (float) (2 * phi * r);
        System.out.println("Keliling Lingkaran: " + keliling);
        return keliling;
    }
}
