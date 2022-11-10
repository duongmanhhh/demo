/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Sach;
import model.TheLoai;

/**
 *
 * @author Administrator
 */
public class view extends javax.swing.JFrame {

    private DefaultTableModel tblModel;
    List<Sach> list;
    List<Sach> listS;

    private DefaultComboBoxModel cboModelTenTl;
    private DefaultComboBoxModel cboModelMaTl;
    List<String> listTenTl;
    List<String> listMaTl;
    private service.Impll.SachImpl serS = new service.Impll.SachImpl();
    private service.Impll.TheLoaiImpl serTl = new service.Impll.TheLoaiImpl();

    /**
     * Creates new form view
     */
    public view() {
        initComponents();
        tblModel = new DefaultTableModel();
        list = new ArrayList<>();
        listS = new ArrayList<>();
        listTenTl = new ArrayList<>();
        listMaTl = new ArrayList<>();
        cboModelMaTl = new DefaultComboBoxModel();
        cboModelTenTl = new DefaultComboBoxModel();
        String heard[] = new String[]{"masach", "tensach", "nxb", "soluong", "giatien", "tentheloai"};
        tblModel.setColumnIdentifiers(heard);
        tblTable.setModel(tblModel);
        cboMaTl.setModel(cboModelMaTl);
        cboTenTl.setModel(cboModelTenTl);
        showDataTable(serS.getAll());
        loadDataTable();
        loadCboMa();
        loadCboTen();
        showCboMa();
        showCboTen();
    }

    private void loadCboTen() {
        listTenTl.add("sach tre em");
        listTenTl.add("sach nguoi lon");
        listTenTl.add("sach nguoi gia");
        listTenTl.add("sach nguoi");

    }

    private void loadCboMa() {
        listMaTl.add("tl1");
        listMaTl.add("tl2");
        listMaTl.add("tl3");
        listMaTl.add("tl4");
    }

    private void showCboMa() {
        for (String string : listMaTl) {
            cboModelMaTl.addElement(string);
        }
    }

    private void showCboTen() {
        for (String string : listTenTl) {
            cboModelTenTl.addElement(string);
        }
    }

    private void showDataTable(List<Sach> list) {
        tblModel.setRowCount(0);
        for (Sach sach : list) {
            tblModel.addRow(sach.toDataRow());
        }
    }

    private void findData(int index) {
        Sach sach = serS.getAll().get(index);
        txtMaSach.setText(sach.getMa_sach());
        txtTen.setText(sach.getTen_sach());
        txtNXB.setText(sach.getNha_xuat_ban());
        txtSoLuong.setText(String.valueOf(sach.getSo_luong()));
        txtGiaTien.setText(String.valueOf(sach.getGia_tien()));
        cboTenTl.setSelectedItem(sach.getTheLoai().getTen_the_loai());

    }

    private void loadData() {
        list = serS.loadData(list);
    }

    private void loadDataTable() {
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnSachTreEm = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        cboTenTl = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtGiaTien = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        cboMaTl = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtNXB = new javax.swing.JTextField();
        btnUpdate1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSapXep.setText("SapSep");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnSachTreEm.setText("SachTreEm");
        btnSachTreEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSachTreEmActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoat");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTable);

        cboTenTl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("ten");

        jLabel5.setText("NXB");

        jLabel6.setText("SoLuong");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");

        jLabel1.setText("Search by tenTL");

        jLabel2.setText("maTL");

        jLabel3.setText("maSach");

        cboMaTl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("GiaTien");

        btnUpdate1.setText("Top 5 SLNN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate1)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClear)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboTenTl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSearch)
                                .addGap(66, 66, 66))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboMaTl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSachTreEm)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemove)
                                .addGap(23, 23, 23)
                                .addComponent(btnSapXep)
                                .addGap(32, 32, 32)
                                .addComponent(btnThoat)))
                        .addGap(0, 35, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(jLabel1)
                    .addComponent(cboTenTl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboMaTl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btnUpdate1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove)
                    .addComponent(btnSachTreEm)
                    .addComponent(btnThoat)
                    .addComponent(btnSapXep))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTableMouseClicked
        // TODO add your handling code here:
        int row = tblTable.getSelectedRow();
        findData(row);
    }//GEN-LAST:event_tblTableMouseClicked

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        // TODO add your handling code here:
        serS.sapXep(list);
        showDataTable(list);
    }//GEN-LAST:event_btnSapXepActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int row = tblTable.getSelectedRow();
        list.remove(row);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSachTreEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSachTreEmActionPerformed
        // TODO add your handling code here:
        for (Sach sach : list) {
            if (sach.getTheLoai().getTen_the_loai().equals("sach tre em")) {
                listS.add(sach);
            }
        }
        showDataTable(listS);

    }//GEN-LAST:event_btnSachTreEmActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtTen.setText("");
        txtGiaTien.setText("");
        txtMaSach.setText("");
        txtNXB.setText("");
        txtSoLuong.setText("");
        cboMaTl.setSelectedIndex(0);
        cboTenTl.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String ma=txtMaSach.getText();
        String ten=txtTen.getText();
        TheLoai theLoai=serTl.getOne(cboMaTl.getSelectedItem().toString());
        int soLuong=Integer.parseInt(txtSoLuong.getText());
        int gieTien=Integer.parseInt(txtGiaTien.getText());
        String nhaXB=txtNXB.getText();
        Sach sach=new Sach(ma, ten, theLoai, soLuong, gieTien, nhaXB);
        JOptionPane.showMessageDialog(this, serS.add(sach));
        loadData();
        showDataTable(list);
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSachTreEm;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JComboBox<String> cboMaTl;
    private javax.swing.JComboBox<String> cboTenTl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtNXB;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
