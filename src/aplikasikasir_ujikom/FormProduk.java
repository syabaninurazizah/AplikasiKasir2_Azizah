/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasikasir_ujikom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author user
 */
public class FormProduk extends javax.swing.JFrame {
Connection konek;
PreparedStatement pst;
ResultSet rst;
    /**
     * Creates new form FormProduk
     */
    public FormProduk() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        konek = Koneksi.koneksiDB();
        updatetabel();
        
    }
    
    public void updatetabel() {
        try{
            String sql="select * from produk";
             pst=konek.prepareStatement(sql);
             rst=pst.executeQuery();
            tblproduk.setModel (DbUtils.resultSetToTableModel(rst));
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void clear() {
        txtidproduk.setText("");
        txtnamaproduk.setText("");
        txtharga.setText("");
        txtstok.setText("");
    }
    
    private void simpan() {
        try{
            String sql= "insert into produk (ProdukID,NamaProduk,Harga,Stok) value(?,?,?,?)";
            pst=konek.prepareStatement(sql);
            pst.setString(1, txtidproduk.getText());
             pst.setString(2, txtnamaproduk.getText());
              pst.setString(3, txtharga.getText());
               pst.setString(4, txtstok.getText());
               pst.execute();
                JOptionPane.showMessageDialog(null, "Data Tersimpan");
        }catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
                    }
        updatetabel();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtidproduk = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnamaproduk = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        txtstok = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblproduk = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtidproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidprodukActionPerformed(evt);
            }
        });
        getContentPane().add(txtidproduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 200, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INPUT PRODUK");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 290, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id Produk");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 60, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Produk");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harga");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 50, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Stok");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 30, -1));

        txtnamaproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaprodukActionPerformed(evt);
            }
        });
        getContentPane().add(txtnamaproduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 200, -1));
        getContentPane().add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 200, -1));

        txtstok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstokActionPerformed(evt);
            }
        });
        getContentPane().add(txtstok, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 200, -1));

        btnsimpan.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Pictures\\Camera Roll\\icons8-save-15.png")); // NOI18N
        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 250, -1, -1));

        btnedit.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Pictures\\Camera Roll\\icons8-edit-15.png")); // NOI18N
        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 300, 90, -1));

        btnhapus.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Pictures\\Camera Roll\\icons8-delete-15.png")); // NOI18N
        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 350, 90, -1));

        btnkeluar.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Pictures\\Camera Roll\\icons8-exit-15.png")); // NOI18N
        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, -1, -1));

        tblproduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Produk", "Nama Produk", "Harga", "Stok"
            }
        ));
        tblproduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblprodukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblproduk);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 610, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Pictures\\Camera Roll\\jaemin.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
simpan();
clear();// TODO add your handling code here:
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
   try{
            
            String lu = txtidproduk.getText();
            String mnh = txtnamaproduk.getText();
            String u = txtharga.getText();
            String kmu = txtstok.getText();
            String sql= "update produk set NamaProduk='"+mnh+"', Harga='"+u+"', Stok='"+kmu+"' where ProdukID='"+lu+"' ";
            pst=konek.prepareStatement(sql);
            pst.execute();
                JOptionPane.showMessageDialog(null, "Data ber-hasil di ubah");
        }catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
                    }
        updatetabel();
        clear();
    }//GEN-LAST:event_btneditActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
try{
    String sql= "delete from produk where ProdukID=?";
    pst=konek.prepareStatement(sql);
    pst.setString(1, txtidproduk.getText());
    pst.execute();
    JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
} catch(Exception e) {
    JOptionPane.showMessageDialog(null, e);
}
updatetabel();
clear();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void txtidprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidprodukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidprodukActionPerformed

    private void txtstokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstokActionPerformed

    private void tblprodukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblprodukMouseClicked
try { 
int baris=tblproduk.getSelectedRow();
String tabelKlik=(tblproduk.getModel().getValueAt(baris, 0).toString());
String sql="select * from produk where ProdukID='"+tabelKlik+"'";
pst=konek.prepareStatement(sql);
rst=pst.executeQuery();
if (rst.next()) {
   String dataProdukID=rst.getString(("ProdukID"));
   txtidproduk.setText(dataProdukID);
   String dataNamaProduk=rst.getString(("NamaProduk"));
   txtnamaproduk.setText(dataNamaProduk);
   String dataHarga=rst.getString(("Harga"));
   txtharga.setText(dataHarga);
   String dataStok=rst.getString(("Stok"));
   txtstok.setText(dataStok);
}
    } catch (Exception e) {
     JOptionPane.showMessageDialog(null, e);
    }    
    }//GEN-LAST:event_tblprodukMouseClicked

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
new MenuUtama().setVisible(true); 
this.dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void txtnamaprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaprodukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaprodukActionPerformed
    
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
            java.util.logging.Logger.getLogger(FormProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblproduk;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtidproduk;
    private javax.swing.JTextField txtnamaproduk;
    private javax.swing.JTextField txtstok;
    // End of variables declaration//GEN-END:variables
}
