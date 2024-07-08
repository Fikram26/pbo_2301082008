/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082008.p02042024;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class balokmain {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang balok: ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar balok: ");
        double lebar = scanner.nextDouble();

        System.out.print("Masukkan tinggi balok: ");
        double tinggi = scanner.nextDouble();

     
        Balok balok1 = new Balok(panjang, lebar, tinggi);

    
        System.out.println("Luas permukaan balok: " + balok1.hitungLuasPermukaan());
        System.out.println("Volume balok: " + balok1.hitungVolume());
        System.out.println("Luas alas balok: " + balok1.hitungluasalas());  
        Balok balok2 = new Balok(5.0, 3.0, 4.0);
        System.out.println("Luas permukaan balok 2: " + balok2.hitungLuasPermukaan());
        System.out.println("Volume balok 2: " + balok2.hitungVolume());
        System.out.println("Luas alas balok: " + balok2.hitungluasalas()); 
        
        System.out.print("Masukkan panjang balok 3 : ");
        double panjang1 = scanner.nextDouble();

        System.out.print("Masukkan lebar balok 3 : ");
        double lebar1 = scanner.nextDouble();

        System.out.print("Masukkan tinggi balok 3 : ");
        double tinggi1 = scanner.nextDouble();

        Balok1 balok3 = new Balok1(panjang1, lebar1, tinggi1);
        
         System.out.println("Luas permukaan balok 3 : " + balok3.hitungLuasPermukaan());
        System.out.println("Volume balok 3 : " + balok3.hitungVolume());
        System.out.println("Luas alas balok 3 : " + balok3.hitungluasalas());  
    }
}
