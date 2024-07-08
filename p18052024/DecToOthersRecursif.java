/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082008.p18052024;

/**
 *
 * @author USER
 */
public class DecToOthersRecursif {
    static void printBase(int num,int base){
        String digits = "0123456789abcdef";
        if(num>= base){
            printBase(num/base,base);
            
        }
        System.out.println(digits.charAt(num%base));
        
    }
    public static void main(String args[])
    {
        int num = Integer.parseInt(args[0]);
        int base = Integer.parseInt(args[1]);
        printBase(num,base);
    }
    
    
}
