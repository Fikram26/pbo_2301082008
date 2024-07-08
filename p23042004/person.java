/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082008.p23042004;

/**
 *
 * @author USER
 */
public class person {
    protected String name;
    protected String address;
    
    public person(){
        System.out.println("person contructor");
        name="";
        address="";
}
    public person (String name, String address){
        this.name = name;
        this.address = address;
    }
    
    public String getName(){
        System.out.println("person: getName");
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
     public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
}