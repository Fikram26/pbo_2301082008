/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082008.p23042004;

/**
 *
 * @author USER
 */
public class student extends person {
    public student(){
        super ("Ali","Padang");
        System.out.println("student constructor");
    }
    @Override
    public String getName(){
        System.out.println("student: getName");
        return name;
    }
    
}
