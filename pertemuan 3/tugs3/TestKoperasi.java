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
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
       Scanner naily = new Scanner(System.in);
       Scanner ikmal = new Scanner(System.in);
       
        System.out.println("Data Peminjam");
        System.out.println("============================");
       System.out.print("Nomor KTP : ");
       String ktp = ikmal.nextLine(); 
       System.out.print("Nama : ");
       String nm = ikmal.nextLine();
        System.out.print("Limit Peminjaman : ");
        int lp = naily.nextInt();
        
       Anggota a = new Anggota(nm,ktp,lp );
              
       int opsi;       
        System.out.println("Menu :");
        System.out.println("1. pinjam");
        System.out.println("2 angsur");
        
        do{
            System.out.println("---------------------------------------");
        System.out.print("Pilih opsi : ");
        opsi = naily.nextInt();
        
        if(opsi == 1 ){
            System.out.print("Jumlah Pinjaman : ");
            int x = naily.nextInt();
           a.pinjam(x);
            System.out.println("Jumlah peminjaman saat ini : "+a.getJumlahPinjaman());
        } 
        else if( opsi == 2){
            System.out.print("Jumlah angsuran : ");
            int y = naily.nextInt();
            a.angsur(y);
            System.out.println("Jumlah peminjaman saat ini : "+a.getJumlahPinjaman());
        }
        else{
            System.out.println("Menu tidak tersedia");
        }
       } while (opsi == 1 || opsi == 2);
        
    
    }
}
