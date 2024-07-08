/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082008.p08062024;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class BukuDao {
      private List<Buku> data = new ArrayList();
    
   public BukuDao() {
        data.add(new Buku("A001", "Cara WS Mobile Legend", "Fikram Maha Devin", "DenzZ_Media", 2023));
        data.add(new Buku("B002", "Cara Push Immortal", "DenzZ Dongkak", "DenzZ_Media", 2018));
    }
    public void insert(Buku buku){
        data.add(buku);
    }
    
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    public List<Buku> getAll(){
        return data;
    } 
}

