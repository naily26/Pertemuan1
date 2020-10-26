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
public class MainOverloading {
    public static void main(String[] args) {
        Segitiga sg = new Segitiga();
        System.out.println(sg.totalSudut(90));
        System.out.println(sg.totalSudut(45, 90));
        System.out.println(sg.keliling(20, 40));
        System.out.println(sg.keliling(10, 15, 12));
    }
}
