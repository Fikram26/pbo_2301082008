/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082008.p27042024;

/**
 *
 * @author USER
 */
public class Square  extends Shape{
    private int sisi;
    public Square(){
        
    }
    public int getSisi(){
        return sisi;
    }
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    public String getName(){
        return "Square";
    }
    public float getArea(){
        return sisi*sisi;
}
}