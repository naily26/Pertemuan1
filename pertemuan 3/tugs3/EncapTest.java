/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugs3;

/**
 *
 * @author HP
 */
public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(25);
        
        System.out.println("Name : "+encap.getName());
        System.out.println("Age : "+encap.getAge());
        
        EncapDemo encap1 = new EncapDemo();
        encap1.setName("Budi");
        encap1.setAge(17); // usia dibawah 18 tahun
        
        System.out.println("Name : "+encap1.getName());
        System.out.println("Age : "+encap1.getAge());
        
        EncapDemo encap2 = new EncapDemo();
        encap2.setName("Rossa");
        encap2.setAge(40);// usia di atas 30 tahun
        
        System.out.println("Name : "+encap2.getName());
        System.out.println("Age : "+encap2.getAge());
    }
}
