/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author HP
 */
public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA){
        sudut = 180-sudutA;
        return sudut;
    }
    public int totalSudut(int sudutA, int sudutB){
        sudut = 180-(sudutA+sudutB);
        return sudut;
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA+sisiB+sisiC;
    }
    public double keliling(int sisiA, int sisiB){
        return Math.sqrt(Math.pow(sisiA,2) + Math.pow(sisiB,2)); 
    }
}
