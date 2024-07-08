/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082008.tugas;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class PeminjamController {
 private FormPeminjam formPeminjam;
    private Peminjam peminjam;
    private PeminjamDao peminjamDao;
    
    public PeminjamController(FormPeminjam formPeminjam) {
        this.formPeminjam = formPeminjam;
        peminjamDao = new PeminjamDao();
    }
    
    public void clearForm() {
        formPeminjam.getTxtAnggota().setText("");
        formPeminjam.getTxtBuku().setText("");
        formPeminjam.getTxtPinjam().setText("");
        formPeminjam.getTxtKembali().setText("");
        formPeminjam.getTxtTerlambat().setText("");
        formPeminjam.getTxtDenda().setText("");
        formPeminjam.getTxtTotal().setText("");
        
        
    }
    
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel)
                formPeminjam.getTblPeminjam().getModel();
        tabelModel.setRowCount(0);
        List<Peminjam> list = peminjamDao.getAll();
        for (Peminjam a : list) {
            Object[] row = {
                a.getKodeAnggota(),
                a.getKodeBuku(),
                a.getTglPinjam(),
                a.getTglKembali(),
                a.getTerlambat(),
                a.getDenda(),
                a.getTotal()
            };
            tabelModel.addRow(row);
            
        }
    }
    
    public void savePeminjam(){
        peminjam = new Peminjam();
        peminjam.setKodeAnggota(formPeminjam.getTxtAnggota().getText());
        peminjam.setKodeBuku(formPeminjam.getTxtBuku().getText());
        peminjam.setTglPinjam(formPeminjam.getTxtPinjam().getText());
        peminjam.setTglKembali(formPeminjam.getTxtKembali().getText());
        peminjam.setTerlambat(Integer.parseInt(formPeminjam.getTxtTerlambat().getText()));
        peminjam.setDenda(Integer.parseInt(formPeminjam.getTxtDenda().getText()));
        peminjam.setTotal(Integer.parseInt(formPeminjam.getTxtTotal().getText()));
       
        peminjamDao.insert(peminjam);
        JOptionPane.showMessageDialog(formPeminjam, "Insert Ok");
    }
    
    public void updateBuku(){
        int index = formPeminjam.getTblPeminjam().getSelectedRow();
        peminjam = peminjamDao.getPeminjam(index);
        peminjam.setKodeAnggota(formPeminjam.getTxtAnggota().getText());
        peminjam.setKodeBuku(formPeminjam.getTxtBuku().getText());
        peminjam.setTglPinjam(formPeminjam.getTxtPinjam().getText());
        peminjam.setTglKembali(formPeminjam.getTxtKembali().getText());
        peminjam.setTerlambat(Integer.parseInt(formPeminjam.getTxtTerlambat().getText()));
        peminjam.setDenda(Integer.parseInt(formPeminjam.getTxtDenda().getText()));
        peminjam.setTotal(Integer.parseInt(formPeminjam.getTxtTotal().getText()));
        
        peminjamDao.update(index, peminjam);
        JOptionPane.showMessageDialog(formPeminjam, "Update OK");
    }
    
    public void getPeminjam(){
        int index = formPeminjam.getTblPeminjam().getSelectedRow();
        peminjam = peminjamDao.getPeminjam(index);
        if(peminjam!=null){
            formPeminjam.getTxtAnggota().setText(peminjam.getKodeAnggota());
            formPeminjam.getTxtBuku().setText(peminjam.getKodeBuku());
            formPeminjam.getTxtPinjam().setText(peminjam.getTglPinjam());
            formPeminjam.getTxtKembali().setText(peminjam.getTglKembali());
            formPeminjam.getTxtTerlambat().setText(String.valueOf(peminjam.getTerlambat()));
            formPeminjam.getTxtDenda().setText(String.valueOf(peminjam.getDenda()));
            formPeminjam.getTxtTotal().setText(String.valueOf(peminjam.getTotal()));
           
        }
    }
    
    public void deletePeminjam(){
        int index = formPeminjam.getTblPeminjam().getSelectedRow();
        peminjamDao.delete(index);
        JOptionPane.showMessageDialog(formPeminjam, "Delete OK");
    }

    void updatePeminjam() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
   

