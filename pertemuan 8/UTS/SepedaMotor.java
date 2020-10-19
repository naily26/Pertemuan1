/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class SepedaMotor extends Mesin{
   private Mesin mesin;
   private String merkMotor;

    public SepedaMotor(String merkMotor, String merkMesin) {
        this.merkMotor = merkMotor;
        super.setMerk(merkMesin);
    }

    public String getMerkMotor() {
        return merkMotor;
    }

    public void setMerkMotor(String merkMotor) {
        this.merkMotor = merkMotor;
    }
   
   public String getMerkMesin() {
        return super.getMerk();
    }
   public void tambahKecepatanMotor(){
       String mk =getMerkMesin();
       if (mk.equalsIgnoreCase("Honda")){
           System.out.println();
           super.tambahkecepatan(10);
       }
       else if (mk.equalsIgnoreCase("Yamaha")){
           super.tambahkecepatan(15);
       }
       System.out.println(super.getKecepatan()+"Km/jam");
   }
   public void kurangiKecepatanMotor(){
       String mk =getMerkMesin();
       if (mk.equalsIgnoreCase("Honda")){
           super.kurangiKecepatan(5);
       }
       else if (mk.equalsIgnoreCase("Yamaha")){
           super.kurangiKecepatan(10);
       }
       System.out.println(super.getKecepatan()+"Km/jam");
   }
}
