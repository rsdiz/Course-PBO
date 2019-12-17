package datakaryawangui;

import java.awt.Label;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/**
 *
 * @author Muhammad Rosyid Izzulkhaq
 */
public class proyek_1 extends javax.swing.JFrame {
    
    DefaultTableModel model;
    
    private int tgl, bln, thn;
    private String namaLengkap, tempatLahir, pendidikan, status;

    /**
     * Creates new form proyek_1
     */
    public proyek_1() {
        initComponents();
        // Membuat Model table
        model = (DefaultTableModel) tableKaryawan.getModel();
        // Menambahkan TableModel ke tableKaryawan
        tableKaryawan.setModel(model);
        // LoadData dari database
        LoadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tv_namaLengkap = new javax.swing.JTextField();
        tv_tempatLahir = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tv_tgl = new javax.swing.JTextField();
        tv_bln = new javax.swing.JTextField();
        tv_thn = new javax.swing.JTextField();
        cb_pendidikan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cb_status = new javax.swing.JComboBox<>();
        buttonTambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKaryawan = new javax.swing.JTable();
        buttonExport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".:: RESPONSI ::.");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Fibon Sans", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORM DATA KARYAWAN");

        jLabel2.setText("Nama Lengkap :");

        jLabel3.setText("Tempat Lahir :");

        jLabel4.setText("Tgl-Bln-Thn Lahir :");

        cb_pendidikan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S1", "S2", "S3" }));

        jLabel5.setText("Pendidikan :");

        jLabel6.setText("Status Karyawan :");

        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tetap", "Tidak ttp" }));

        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        tableKaryawan.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tableKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Lengkap", "Tempat Lahir", "Tgl Lahir", "Bln Lahir", "Thn Lahir", "Pendidikan", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableKaryawan);

        buttonExport.setText("Export Data to Excel");
        buttonExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExport)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(tv_namaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tv_tempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tv_tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tv_bln, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tv_thn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_pendidikan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_pendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tv_namaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tv_tempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(buttonTambah))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tv_bln)
                        .addComponent(tv_thn))
                    .addComponent(tv_tgl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonExport)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        // TODO add your handling code here:
        
        namaLengkap = tv_namaLengkap.getText();
        tempatLahir = tv_tempatLahir.getText();
        tgl = Integer.parseInt(tv_tgl.getText());
        bln = Integer.parseInt(tv_bln.getText());
        thn = Integer.parseInt(tv_thn.getText());
        pendidikan = cb_pendidikan.getSelectedItem().toString();
        status = cb_status.getSelectedItem().toString();
        
        Object [] data = {namaLengkap, tempatLahir, tgl, bln, thn, pendidikan, status};
        model.addRow(data);
        
        try{
            Connection conn = KoneksiDB.getKoneksi();
            
            String sql = "INSERT INTO karyawan (NamaLengkap, TempatLahir, TglLahir, BulanLahir, TahunLahir, Pendidikan, Status) VALUES (?,?,?,?,?,?,?)";
            
            PreparedStatement p = conn.prepareStatement(sql);
            
            p.setString(1, namaLengkap);
            p.setString(2, tempatLahir);
            p.setInt(3, tgl);
            p.setInt(4, bln);
            p.setInt(5, thn);
            p.setString(6, pendidikan);
            p.setString(7, status);
            
            p.executeUpdate();
            p.close();
            
        }catch(SQLException e){
            System.out.println("Terjadi error!");
        }
        
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExportActionPerformed
        try {
            // Mendefinisikan file XLS baru bernama "DataKaryawan.xls"
            WritableWorkbook w = Workbook.createWorkbook(new File("D:/TAKKODE/JAVA/DataKaryawan.xls"));
            // Membuat sheet baru bernama "Karyawan" index 0 berarti sheet pertama
            WritableSheet s = w.createSheet("Karyawan", 0);
            // Membaca data dari tableKaryawan untuk dicetak ke dalam excel
            for (int baris = 0; baris < model.getRowCount(); baris++) {
                for (int kolom = 0; kolom < model.getColumnCount(); kolom++) {
                    //Membaca data per cell pada tableKaryawan
                    String data = model.getValueAt(baris, kolom).toString();
                    //Menambah cell data pada file excel
                    s.addCell(new jxl.write.Label(kolom, baris, data));
                }
            }
            // Menuliskan pada file xls
            w.write();
            // Menutup koneksi
            w.close();
            
            String pesan = "Data berhasil diekspor ke Excel!";
            JOptionPane.showMessageDialog(null, pesan, "Berhasil", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception aoEx) {
            System.out.println("Terjadi Error!");
        }
    }//GEN-LAST:event_buttonExportActionPerformed

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
            java.util.logging.Logger.getLogger(proyek_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proyek_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proyek_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proyek_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proyek_1().setVisible(true);
            }
        });
    }
    
    public void LoadData() {
        try {
            // Membuat Koneksi
            Connection conn = KoneksiDB.getKoneksi();
            Statement s = conn.createStatement();
            // Membuat Query SELECT
            String sql = "SELECT * FROM karyawan";
            ResultSet r = s.executeQuery(sql);
            // Membuat data di dalam database baris per baris
            while(r.next()){
                // Membuat Objek obj untuk menampung data yang dibaca dari database
                Object [] obj = new Object[7];
                obj[0] = r.getString("NamaLengkap");
                obj[1] = r.getString("TempatLahir");
                obj[2] = r.getInt("TglLahir");
                obj[3] = r.getInt("BulanLahir");
                obj[4] = r.getInt("TahunLahir");
                obj[5] = r.getString("Pendidikan");
                obj[6] = r.getString("Status");
                //tampilkan satu baris data ke dalam table
                model.addRow(obj);
            }
            
            
        } catch(SQLException e) {
            System.out.println("Terjadi Error!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExport;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JComboBox<String> cb_pendidikan;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableKaryawan;
    private javax.swing.JTextField tv_bln;
    private javax.swing.JTextField tv_namaLengkap;
    private javax.swing.JTextField tv_tempatLahir;
    private javax.swing.JTextField tv_tgl;
    private javax.swing.JTextField tv_thn;
    // End of variables declaration//GEN-END:variables
}