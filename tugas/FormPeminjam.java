/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbo_2301082008.tugas;

import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class FormPeminjam extends javax.swing.JFrame {
    String denda;
double total;
    /**
     * Creates new form FormPeminjam
     */
    PeminjamController controller;
    public FormPeminjam() {
        initComponents();
        controller = new PeminjamController (this);
        controller.tampil();
        controller.clearForm();
    }

    public JTable getTblPeminjam() {
        return tblPeminjam;
    }

    public JTextField getTxtAnggota() {
        return txtAnggota;
    }

    public JTextField getTxtBuku() {
        return txtBuku;
    }

    public JTextField getTxtDenda() {
        return txtDenda;
    }

    public JTextField getTxtKembali() {
        return txtKembali;
    }

    public JTextField getTxtPinjam() {
        return txtPinjam;
    }

    public JTextField getTxtTerlambat() {
        return txtTerlambat;
    }

    public JTextField getTxtTotal() {
        return txtTotal;
    }

   


    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtAnggota = new javax.swing.JTextField();
        txtBuku = new javax.swing.JTextField();
        txtPinjam = new javax.swing.JTextField();
        txtKembali = new javax.swing.JTextField();
        txtTerlambat = new javax.swing.JTextField();
        txtDenda = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeminjam = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Total");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 270, 110, 30);

        jLabel3.setText("Kode Anggota ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 30, 110, 30);

        jLabel4.setText("Kode Buku");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 70, 110, 30);

        jLabel5.setText("Tanggal Pinjam");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 110, 110, 30);

        jLabel6.setText("Tanggal Pengembalian");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 150, 130, 30);

        jLabel7.setText("Terlambat");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 190, 110, 30);

        jLabel8.setText("Denda");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 230, 110, 30);

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal);
        txtTotal.setBounds(240, 270, 220, 30);

        txtAnggota.setText("jTextField1");
        txtAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnggotaActionPerformed(evt);
            }
        });
        getContentPane().add(txtAnggota);
        txtAnggota.setBounds(240, 30, 220, 30);

        txtBuku.setText("jTextField1");
        txtBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBukuActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuku);
        txtBuku.setBounds(240, 70, 220, 30);

        txtPinjam.setText("jTextField1");
        getContentPane().add(txtPinjam);
        txtPinjam.setBounds(240, 110, 220, 30);

        txtKembali.setText("jTextField1");
        getContentPane().add(txtKembali);
        txtKembali.setBounds(240, 150, 220, 30);

        txtTerlambat.setText("jTextField1");
        txtTerlambat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTerlambatActionPerformed(evt);
            }
        });
        getContentPane().add(txtTerlambat);
        txtTerlambat.setBounds(240, 190, 220, 30);

        txtDenda.setText("500");
        txtDenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDendaActionPerformed(evt);
            }
        });
        getContentPane().add(txtDenda);
        txtDenda.setBounds(240, 230, 220, 30);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(360, 330, 80, 30);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(20, 330, 80, 30);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(130, 330, 80, 30);

        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(BtnDelete);
        BtnDelete.setBounds(250, 330, 80, 30);

        tblPeminjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Anggota", "Kode Buku", "Tanggal Pinjam", "tanggal Kembali", "Terlambat", "Denda", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPeminjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPeminjamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPeminjam);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 370, 640, 402);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
         controller.clearForm();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
         controller.deletePeminjam();
       controller.tampil();
       controller.clearForm();
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void txtAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnggotaActionPerformed

    private void txtBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBukuActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
       controller.savePeminjam();
       controller.tampil();
       controller.clearForm();
       
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        controller.updatePeminjam();
       controller.tampil();
       controller.clearForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblPeminjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPeminjamMouseClicked
       controller.getPeminjam();
      
    }//GEN-LAST:event_tblPeminjamMouseClicked

    private void txtTerlambatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTerlambatActionPerformed
         
    }//GEN-LAST:event_txtTerlambatActionPerformed

    private void txtDendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDendaActionPerformed
       
    }//GEN-LAST:event_txtDendaActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPeminjam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPeminjam;
    private javax.swing.JTextField txtAnggota;
    private javax.swing.JTextField txtBuku;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtPinjam;
    private javax.swing.JTextField txtTerlambat;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}