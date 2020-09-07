/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author HP
 */
public class Lingkaran {
    public double phi, r;
    
    public double hitungLuas(){
        double L;
        L = phi * r * r;
        return L;
    }
    
    public double hitungKeliling(){
        double K;
        K = 2 * phi * r;
        return K;
    }
}
