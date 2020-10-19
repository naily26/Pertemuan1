/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class DemoKuis {
    public static void main(String[] args) {

        SepedaMotor honda = new SepedaMotor("vario", "honda");
        System.out.println(honda.getMerkMotor());
        System.out.println(honda.getMerkMesin());
        honda.tambahKecepatanMotor();
        honda.tambahKecepatanMotor();
        honda.kurangiKecepatanMotor();
        

        SepedaMotor yamaha = new SepedaMotor("NMax", "Yamaha");
        System.out.println(yamaha.getMerkMotor());
        System.out.println(yamaha.getMerkMesin());
        yamaha.tambahKecepatanMotor();
        yamaha.tambahKecepatanMotor();
        yamaha.kurangiKecepatanMotor();
    }
}
