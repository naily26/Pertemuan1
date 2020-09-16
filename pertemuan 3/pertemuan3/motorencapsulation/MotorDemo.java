/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3.motorencapsulation;

/**
 *
 * @author HP
 */
public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahKecepatan();
              
        motor.nyalakanMesin();
        motor.printStatus();
        
        System.out.println("Set kecepatan = 100");
        motor.kecepatan=100;
        
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.kurangiKecepatan();
        motor.printStatus();
        
        motor.matikanMesin();
        motor.printStatus();
    }
}
