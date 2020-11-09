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
public class MainProgram {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Keledai", 4, "Hehehe", "Abu-abu");
        Gorilla gulali = new Gorilla("Gulali", 4, "Hauum Hauum", "Hitam Manis");
        Singa cingacing = new Singa("cingacing", 4, "Roaar Roaar", "Coklat");
        
        keledai.displayData();
        gulali.displayData();
        cingacing.displayData();
    }
}
