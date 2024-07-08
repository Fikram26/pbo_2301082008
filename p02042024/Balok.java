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

class Balok {
    private double panjang;
    private double lebar;
    private double tinggi;
  

    // Konstruktor dengan parameter
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Menghitung luas permukaan balok
    public double hitungLuasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    // Menghitung volume balok
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

   public double hitungluasalas(){
       return panjang*lebar;
   }
}
