/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082008.p18052024;

/**
 *
 * @author USER
 */
public class DecToOthers {
    public static void main(String[]args){
        int num = 5;
        int base = 12;
        printBase(num,base);
    }
    static void printBase(int num, int base){
        int rem = 1 ;
        String digits = "0123456789abcdef";
        String result ="";
        while(num!=0){
            rem = num%base;
            num = num/base;
            result = result.concat(digits.charAt(rem)+"");
        }
        for (int i= result.length()-1;i>=0;i--){
        System.out.println(result.charAt(i));
    }
    }
}
