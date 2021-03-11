/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import classes.DaftarMenu;
import classes.Kuah;
import classes.Minuman;
import classes.Ramen;
import classes.Toping;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MainAplikasiKasir {
    
     public DaftarMenu daftarMenu;
    
     public static double PAJAK_PPN = 0.10;
     public static double BIAYA_SERVICE = 0.05;
    
    public static void main(String[] args) { 
        
        Scanner input = new Scanner(System.in);
        
        String no_transaksi, nama_pemesan, tanggal, no_meja = "";
        String transaksi_lagi = "", keterangan ="", makan_ditempat;
        int jumlah_pesanan, no_menu;
        
        MainAplikasiKasir app = new MainAplikasiKasir();
        
        app.generateDaftarMenu();
        
        System.out.println("======== TRANSAKSI ========");
        
        System.out.println("No Transaksi : ");
        no_transaksi = input.next();
        System.out.println("Pemesan : ");
        nama_pemesan = input.next();
        System.out.println("Tanggal : [dd-mm-yyyy] ");
        tanggal = input.next();
        System.out.println("Makan ditempat? [Y/N] ");
        makan_ditempat = input.next();
        
        if (makan_ditempat.equalsIgnoreCase("Y")){
            System.out.println("Nomor Meja : ");
            no_meja = input.next();
        }
        
                
        
    }
    
   
    
    public void generateDaftarMenu() {
        daftarMenu = new DaftarMenu();
        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Original", 18000));
        daftarMenu.tambahMenu(new Ramen("Ramen Vegetarian", 22000));
        daftarMenu.tambahMenu(new Ramen("Ramen Karnivor", 28000));
        daftarMenu.tambahMenu(new Kuah("Kuah Orisinil"));
        daftarMenu.tambahMenu(new Kuah("Kuah Internasional"));
        daftarMenu.tambahMenu(new Kuah("Kuah Spicy Lada"));
        daftarMenu.tambahMenu(new Kuah("Kuah Soto Padang"));
        daftarMenu.tambahMenu(new Toping("Crab Stick Bakar", 6000));
        daftarMenu.tambahMenu(new Toping("Chiken Katsu", 8000));
        daftarMenu.tambahMenu(new Toping("Gyoza Gorenf", 4000));
        daftarMenu.tambahMenu(new Toping("Bakso Goreng", 7000));
        daftarMenu.tambahMenu(new Toping("Enoki Goreng", 5000));
        daftarMenu.tambahMenu(new Minuman("Jus Alpukat", 10000));
        daftarMenu.tambahMenu(new Minuman("Jus Stroberry", 11000));
        daftarMenu.tambahMenu(new Minuman("Capucinno Coffe", 15000));
        daftarMenu.tambahMenu(new Minuman("Vietnam Dripp", 14000));
        
        daftarMenu.tampilDaftarMenu();
        
    }
    
}
