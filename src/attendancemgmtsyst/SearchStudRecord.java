/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemgmtsyst;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class SearchStudRecord extends javax.swing.JFrame {

    public SearchStudRecord() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchStudTxt = new javax.swing.JTextField();
        SearchStudRecBut = new javax.swing.JButton();
        BackStudRecBut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NameTxt = new javax.swing.JTextField();
        CourseTxt = new javax.swing.JTextField();
        PasswordTxt = new javax.swing.JTextField();
        IntakeTxt = new javax.swing.JTextField();
        StudIDTxt = new javax.swing.JTextField();
        ViewBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SearchStudTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchStudTxtActionPerformed(evt);
            }
        });

        SearchStudRecBut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        SearchStudRecBut.setText("Search");
        SearchStudRecBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchStudRecButActionPerformed(evt);
            }
        });

        BackStudRecBut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        BackStudRecBut.setText("Back");
        BackStudRecBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackStudRecButActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Name                          :");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Intake                         :");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Course                        :");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Student ID (Login ID):");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Password                    :");

        NameTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        NameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTxtActionPerformed(evt);
            }
        });

        CourseTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        CourseTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseTxtActionPerformed(evt);
            }
        });

        PasswordTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        IntakeTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        IntakeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntakeTxtActionPerformed(evt);
            }
        });

        StudIDTxt.setEditable(false);
        StudIDTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        StudIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudIDTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IntakeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(StudIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(IntakeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CourseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ViewBut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ViewBut.setText("Save");
        ViewBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ViewBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackStudRecBut, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SearchStudTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchStudRecBut))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchStudTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchStudRecBut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewBut)
                    .addComponent(BackStudRecBut))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchStudRecButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchStudRecButActionPerformed
        String id = SearchStudTxt.getText();

        String line;
        String[] records;

        int flag = 0;

        File filename = new File("studentrecord.txt");
        FileReader file = null;
        try {
            file = new FileReader(filename);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SearchStudRecord.class.getName()).log(Level.SEVERE, null, ex);
        }

        BufferedReader br = new BufferedReader(file);

        try {

            while ((line = br.readLine()) != null) {

                records = line.split(";");
                String name = records[0];
                String ID = records[1];
                String intake = records[2];
                String course = records[3];
                String pass = records[4];

                if (ID.equals(id)) {

                    flag = 1;
                    StudIDTxt.setText(ID);
                    NameTxt.setText(name);
                    IntakeTxt.setText(intake);
                    CourseTxt.setText(course);
                    PasswordTxt.setText(pass);
                }

                if (flag == 0) {
                    System.out.println("5");
                    JOptionPane.showMessageDialog(null, "Input invalid");
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(SearchStudRecord.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*try{
           
       BufferedReader br = new BufferedReader(new FileReader("studentrecord.txt"));
       String line = null;
       while((line = br.readLine()) != null){
           String[] records = line.split(";");
           String name = records[0];
           String ID = records[1];
           String intake = records[2];
           String course = records[3];
           String pass = records[4];
           
           if(ID.equals(id)){
               flag = 1;
               StudIDTxt.setName(id);
               NameTxt.setName(name);
               IntakeTxt.setName(intake);
               CourseTxt.setName(course);
               PasswordTxt.setName(pass);  
           }
       }
           if(flag == 0 ){
               JOptionPane.showMessageDialog(null, "Please enter valid input");
           } 
           
      
           
       
       } catch (IOException ex) {
           Logger.getLogger(SearchStudRecord.class.getName()).log(Level.SEVERE, null, ex);
       }*/

    }//GEN-LAST:event_SearchStudRecButActionPerformed

    private void BackStudRecButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackStudRecButActionPerformed
        this.setVisible(false);
        AdminMenu am = new AdminMenu();
        am.setVisible(true);
    }//GEN-LAST:event_BackStudRecButActionPerformed

    private void SearchStudTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchStudTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchStudTxtActionPerformed

    private void NameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTxtActionPerformed

    }//GEN-LAST:event_NameTxtActionPerformed

    private void CourseTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseTxtActionPerformed

    private void IntakeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntakeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IntakeTxtActionPerformed

    private void StudIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudIDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudIDTxtActionPerformed

    private void ViewButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButActionPerformed
        this.setVisible(false);
        ViewStudentRec vs = new ViewStudentRec();
        vs.setVisible(true);


    }//GEN-LAST:event_ViewButActionPerformed

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
            java.util.logging.Logger.getLogger(SearchStudRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchStudRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchStudRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchStudRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchStudRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackStudRecBut;
    private javax.swing.JTextField CourseTxt;
    private javax.swing.JTextField IntakeTxt;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JTextField PasswordTxt;
    private javax.swing.JButton SearchStudRecBut;
    private javax.swing.JTextField SearchStudTxt;
    public javax.swing.JTextField StudIDTxt;
    private javax.swing.JButton ViewBut;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
