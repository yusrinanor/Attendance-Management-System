/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemgmtsyst;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author User
 */
public class ViewRequest extends javax.swing.JFrame {

     DefaultTableModel tb;
     
    public ViewRequest() {
        initComponents();
        SaveBut.setVisible(false);
        RemoveBut.setVisible(false);
        
        LoadBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RemoveBut.setVisible(true);
                SaveBut.setVisible(true);

            }
        });
        
        this.tb = (DefaultTableModel) RequestTB.getModel();
        TableColumnModel column = RequestTB.getColumnModel();
        column.getColumn(4).setPreferredWidth(200);
        column.getColumn(5).setPreferredWidth(100);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RequestTB = new javax.swing.JTable();
        LoadBut = new javax.swing.JButton();
        RemoveBut = new javax.swing.JButton();
        SaveBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        jLabel1.setText("Request Applications");

        RequestTB.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        RequestTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, ""},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Student Name", "Student ID", "Intake Code", "Module Name", "Request Reason(s)", "Attendance Change"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(RequestTB);

        LoadBut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LoadBut.setText("Load");
        LoadBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButActionPerformed(evt);
            }
        });

        RemoveBut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        RemoveBut.setText("Remove Request");
        RemoveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButActionPerformed(evt);
            }
        });

        SaveBut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        SaveBut.setText("Save changes");
        SaveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(RemoveBut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LoadBut))
                            .addComponent(SaveBut, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoadBut)
                    .addComponent(RemoveBut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(SaveBut)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButActionPerformed
         tb.setRowCount(0);
        try {
            BufferedReader br = new BufferedReader(new FileReader("requestrec.txt"));
            String read = null;
            while ((read = br.readLine()) != null) {
                String[] split = read.split(";");
                for (int i = 0; i < split.length; i++) {
                    tb.addRow(split);
                    break;
                }
            }
            br.close();

        } catch (IOException ex) {
            Logger.getLogger(TakeAttend1704IT.class.getName()).log(Level.SEVERE, null, ex);
        }

        TableColumn col = RequestTB.getColumnModel().getColumn(5);
        JComboBox combo = new JComboBox();
        combo.addItem("Absent with Reason");
        col.setCellEditor(new DefaultCellEditor(combo));
    }//GEN-LAST:event_LoadButActionPerformed

    private void SaveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButActionPerformed
         try {
            FileWriter outputfile = new FileWriter("requestrec.txt");
            BufferedWriter bw = new BufferedWriter(outputfile);

            for (int i = 0; i < tb.getRowCount(); i++) {
                for (int j = 0; j < tb.getColumnCount(); j++) {
                    bw.write((String) tb.getValueAt(i, j) + ";");
                }

                bw.write("");
                bw.newLine();
            }
            bw.close();
            outputfile.close();
            JOptionPane.showMessageDialog(this, "Changes is saved");
            this.setVisible(false);
            AdminMenu am = new AdminMenu();
            am.setVisible(true);


        } catch (IOException ex) {
            Logger.getLogger(TakeAttend1701IT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SaveButActionPerformed

    private void RemoveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButActionPerformed
        int row = RequestTB.getSelectedRow();
        tb.removeRow(row);
    }//GEN-LAST:event_RemoveButActionPerformed

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
            java.util.logging.Logger.getLogger(ViewRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoadBut;
    private javax.swing.JButton RemoveBut;
    private javax.swing.JTable RequestTB;
    private javax.swing.JButton SaveBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
