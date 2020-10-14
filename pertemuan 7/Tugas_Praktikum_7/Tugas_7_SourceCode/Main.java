/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_7;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        
        Mac m = new Mac("Apple MacBook Pro 15 inch",2.3 , 16, " Intel Core i9", "Adaptor Daya USB-C 87W", "Chip Apple T2");       
        Windows w = new Windows("HP Pavilion x360", 2.16, 8, "Pentium N3530 Pentium N3170 Pentium QuadCore N371 Core i3-6100U Core i5-8250U",
                "non-removable baterai", "-");
        Pc p = new Pc("Asus ET2700I", 3.8, 8, "Core i7-2600S", 27);
          
        m.tampilMac();
        w.tampilWindows();
        p.tampilPc();
    }
}
