/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082008_19032024;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class NamaBulan {
    public static void main(String[] args)
    {
        int nobulan;
        char ulang;
        Scanner in = new Scanner(System.in);
        System.out.println("===Program menentukan nama bulan===");
        do
        {
          System.out.print("Nomor Bulan = ");
          nobulan=in.nextInt();
          switch (nobulan)
          {
              case 1 :System.out.println("Bulan Januari"); break;
              case 2 :System.out.println("Bulan februari"); break;
              case 3 :System.out.println("Bulan maret"); break;
              case 4 :System.out.println("Bulan april"); break;
              case 5 :System.out.println("Bulan mei"); break;
              case 6 :System.out.println("Bulan juni"); break;
              case 7 :System.out.println("Bulan juli"); break;
              case 8 :System.out.println("Bulan agustus"); break;
              case 9 :System.out.println("Bulan september"); break;
              case 10 :System.out.println("Bulan oktober"); break;
              case 11 :System.out.println("Bulan november"); break;
              case 12 :System.out.println("Bulan desember"); break;
              default:System.out.println("Nomor bulan anda salah");
          }
          System.out.print("Ulang proses? (y/t)");
          ulang = in.next().charAt(0);
        }while (ulang=='y'||ulang=='Y');
    }
    
}
