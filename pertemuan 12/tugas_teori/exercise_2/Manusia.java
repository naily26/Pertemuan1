/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_2;

/**
 *
 * @author HP
 */
public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat){
        if (perangkat instanceof TelevisiJadul){
            System.out.println("Nyalakan Televisi jadul dengan input: DIV");
            System.out.println("Voltase Televisi : "+perangkat.getVoltase());
        }
        else if(perangkat instanceof TelevisiModern){
            System.out.println("Nyalakan Televisi jadul dengan input: HDMI");
            System.out.println("Voltase Televisi : "+perangkat.getVoltase());
        }
    }

    
}
