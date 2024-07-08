/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082008.tugas;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author USER
 */
public class PeminjamDao {
  private List<Peminjam> data = new ArrayList();
    
   
    public void insert(Peminjam peminjam){
        data.add(peminjam);
    }
    
    public void update(int index, Peminjam peminjam){
        data.set(index, peminjam);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Peminjam getPeminjam(int index){
        return data.get(index);
    }
    public List<Peminjam> getAll(){
        return data;
    } 

  
}



