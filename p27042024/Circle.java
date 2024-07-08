/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082008.p27042024;

/**
 *
 * @author USER
 */
public class Circle extends Shape {
    private int r;
    private int phi;
    public Circle(){
        
    }
    public int getr(){
        return r;
    }
    public void setr(int r){
        this.r = r;
    }
    public String getName(){
        return "Circle";
    }
    public float getArea(){
        return r*r*phi;
}
    
    
}
