/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082008.p14052024;

/**
 *
 * @author USER
 */
public class ThrowDemo {
public static void main(String[]args){
    String input = "Invalid Input";
    try{
        if(input.equals("Invalid Input")){
        throw new MyException("Input");
    }else{
            System.out.println("Input");
            }
    }catch(RuntimeException ex){
        System.out.println(ex.getMessage());
    }
}    
}
