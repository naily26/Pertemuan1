/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class SepedaMotor {
   private Mesin mesin;
   private String merkMotor;

    public SepedaMotor(String merkMotor, String merkMesin) {
        this.merkMotor = merkMotor;
        this.mesin.setMerk(merkMesin);
    }

    public SepedaMotor(Mesin mesin, String merkMotor) {
        this.mesin = mesin;
        this.merkMotor = merkMotor;
    }

    public String getMerkMotor() {
        return merkMotor;
    }

    public void setMerkMotor(String merkMotor) {
        this.merkMotor = merkMotor;
    }
   
   public String getMerkMesin() {
        return mesin.getMerk();
    }
   public void tambahKecepatanMotor(){
       String mk =getMerkMesin();
       if (mk.equalsIgnoreCase("Honda")){
           System.out.println();
           mesin.tambahkecepatan(10);
       }
       else if (mk.equalsIgnoreCase("Yamaha")){
           mesin.tambahkecepatan(15);
       }
       System.out.println(mesin.getKecepatan()+"Km/jam");
   }
   public void kurangiKecepatanMotor(){
       String mk =getMerkMesin();
       if (mk.equalsIgnoreCase("Honda")){
           mesin.kurangiKecepatan(5);
       }
       else if (mk.equalsIgnoreCase("Yamaha")){
           mesin.kurangiKecepatan(10);
       }
       System.out.println(mesin.getKecepatan()+"Km/jam");
   }
}
