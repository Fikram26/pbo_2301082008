/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082008.p23042004;

/**
 *
 * @author USER
 */
public class student_example {
    public static void main(String[] args){
    person ref;
    student ali = new student();
    ali.setName("Ali");
    ali.setAddress("Padang");
    Employee budi = new Employee();
    budi.setName("Budi");
    budi.setAddress("Bukittinggi");
    
    ref = ali;
    System.out.println("Nama      :"+ref.getName());
    System.out.println("Alamat    :"+ref.getAddress());
    
      ref = budi;
    System.out.println("Nama Karyawan     :"+ref.getName());
    System.out.println("Alamat            :"+ref.getAddress());
    
    }
}
