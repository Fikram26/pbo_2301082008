/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082008.p02042024;

/**
 *
 * @author USER
 */
public class Balok1 {
   private double panjang1;
    private double lebar1;
    private double tinggi1;
  

    // Konstruktor dengan parameter
    public Balok1(double panjang, double lebar, double tinggi) {
        this.panjang1 = panjang;
        this.lebar1 = lebar;
        this.tinggi1 = tinggi;
    }

    // Menghitung luas permukaan balok
    public double hitungLuasPermukaan() {
        return 2 * ((panjang1 * lebar1) + (panjang1 * tinggi1) + (lebar1 * tinggi1));
    }

    // Menghitung volume balok
    public double hitungVolume() {
        return panjang1 * lebar1 * tinggi1;
    }

   public double hitungluasalas(){
       return panjang1*lebar1;
   }  
}
