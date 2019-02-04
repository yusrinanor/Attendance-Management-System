/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemgmtsyst;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class AdminMenu extends javax.swing.JFrame {

    /**
     * Creates new form AdminMenu
     */
    public AdminMenu() {
        initComponents();
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
        RegisterBut = new javax.swing.JButton();
        SearchBut = new javax.swing.JButton();
        LogOutBut = new javax.swing.JButton();
        ViewReqBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        jLabel1.setText("Directory");

        jLabel2.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel2.setText("Welcome");

        RegisterBut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        RegisterBut.setText("Register Lecturer/Student");
        RegisterBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButActionPerformed(evt);
            }
        });

        SearchBut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        SearchBut.setText("Search Records");
        SearchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButActionPerformed(evt);
            }
        });

        LogOutBut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LogOutBut.setText("Log Out");
        LogOutBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButActionPerformed(evt);
            }
        });

        ViewReqBut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ViewReqBut.setText("View Request Forms");
        ViewReqBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewReqButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(LogOutBut))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ViewReqBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SearchBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RegisterBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LogOutBut))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addComponent(RegisterBut)
                .addGap(29, 29, 29)
                .addComponent(SearchBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(ViewReqBut)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButActionPerformed
        this.setVisible(false);
        RegisterLectStud rls = new RegisterLectStud();
        rls.setVisible(true);
    }//GEN-LAST:event_RegisterButActionPerformed

    private void SearchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButActionPerformed
         this.setVisible(false);
         ViewRecord vr = new ViewRecord();
        vr.setVisible(true);
    }//GEN-LAST:event_SearchButActionPerformed

    private void LogOutButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButActionPerformed
        try {
            this.setVisible(false);
            LogInAdmin lna = new LogInAdmin();
            lna.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LogOutButActionPerformed

    private void ViewReqButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewReqButActionPerformed
       this.setVisible(false);
       ViewRequest vr = new ViewRequest();
       vr.setVisible(true);
    }//GEN-LAST:event_ViewReqButActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOutBut;
    private javax.swing.JButton RegisterBut;
    private javax.swing.JButton SearchBut;
    private javax.swing.JButton ViewReqBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
