/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemgmtsyst;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class ModifyAtten extends javax.swing.JFrame {

   
    public ModifyAtten() {
        initComponents();
        showdate();
        showtime();

    }

    public void display1608IT() {
        TakeAttend1608IT ta = new TakeAttend1608IT();
        this.setVisible(false);
        ta.setVisible(true);
        ta.Load2But.setVisible(true);
        ta.MainLoadBut.setVisible(false);

        switch (cmboDaydate.getSelectedItem().toString()) {

            case "9th August":
                ta.ClassLab.setText("Lecture");
                ta.TimeLab.setText("8.00am - 10.00am");
                break;
            case "8th August":
            case "10th August":
                ta.ClassLab.setText("Tutorial");
                ta.TimeLab.setText("12.00pm - 2.00pm");
                break;
            case "11th August":
                ta.ClassLab.setText("Replacement Class");
                ta.TimeLab.setText("10.00am - 12.00pm");
                break;
            case "7th August":
                ta.ClassLab.setText("Lecture");
                ta.TimeLab.setText("8.00am - 10.00am");
                break;
        }
    }
    
    public void display1701IT() {
        TakeAttend1701IT ta1 = new TakeAttend1701IT();
        this.setVisible(false);
        ta1.setVisible(true);
        ta1.Load2But.setVisible(true);
        ta1.MainLoadBut.setVisible(false);

        switch (cmboDaydate.getSelectedItem().toString()) {

            case "9th August":
                ta1.ClassLab.setText("Lecture");
                ta1.TimeLab.setText("8.00am - 10.00am");
                break;
            case "8th August":
            case "10th August":
                ta1.ClassLab.setText("Tutorial");
                ta1.TimeLab.setText("12.00pm - 2.00pm");
                break;
            case "11th August":
                ta1.ClassLab.setText("Replacement Class");
                ta1.TimeLab.setText("10.00am - 12.00pm");
                break;
            case "7th August":
                ta1.ClassLab.setText("Lecture");
                ta1.TimeLab.setText("8.00am - 10.00am");
                break;
        }
    }
    
    public void display1704IT() {
        TakeAttend1704IT ta2 = new TakeAttend1704IT();
        this.setVisible(false);
        ta2.setVisible(true);
        ta2.Load2But.setVisible(true);
        ta2.MainLoadBut.setVisible(false);
        

        switch (cmboDaydate.getSelectedItem().toString()) {

            case "9th August":
                ta2.ClassLab.setText("Lecture");
                ta2.TimeLab.setText("8.00am - 10.00am");
                break;
            case "8th August":
            case "10th August":
                ta2.ClassLab.setText("Tutorial");
                ta2.TimeLab.setText("12.00pm - 2.00pm");
                break;
            case "11th August":
                ta2.ClassLab.setText("Replacement Class");
                ta2.TimeLab.setText("10.00am - 12.00pm");
                break;
            case "7th August":
                ta2.ClassLab.setText("Lecture");
                ta2.TimeLab.setText("8.00am - 10.00am");
                break;
        }
    }

    void showdate() {
        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        DateLab.setText(sdf.format(d));

    }

    void showtime() {
        ActionListener actiondate = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

                TimeLab.setText(sdf.format(d.getTime()));
            }

        };
        new javax.swing.Timer(1000, actiondate).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmboIntake = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TakeAttendBut = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cmboDaydate = new javax.swing.JComboBox<>();
        ModuleLab = new javax.swing.JLabel();
        TimeslotLab = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ClassLab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TimeLab = new javax.swing.JLabel();
        DateLab = new javax.swing.JLabel();
        BackMarkAttBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cmboIntake.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cmboIntake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UCDF1608IT", "UC1F1704IT", "UC2F1701IT", " " }));
        cmboIntake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboIntakeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Select Intake     :");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Module              :");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Day/Date          :");

        TakeAttendBut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        TakeAttendBut.setText("Take Attendance");
        TakeAttendBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TakeAttendButActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("Classes               :");

        cmboDaydate.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cmboDaydate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7th August", "8th August", "9th August", "10th August", "11th August", " ", " ", " " }));
        cmboDaydate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboDaydateActionPerformed(evt);
            }
        });

        ModuleLab.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ModuleLab.setText(" ");
        ModuleLab.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TimeslotLab.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        TimeslotLab.setText(" ");
        TimeslotLab.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setText("Timeslot             :");

        ClassLab.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ClassLab.setText(" ");
        ClassLab.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ModuleLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmboIntake, 0, 156, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ClassLab, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TimeslotLab, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmboDaydate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TakeAttendBut)
                        .addGap(10, 10, 10))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmboIntake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ModuleLab))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmboDaydate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ClassLab))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TimeslotLab)
                    .addComponent(jLabel9))
                .addGap(116, 116, 116)
                .addComponent(TakeAttendBut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        jLabel1.setText("View Attendance Record");

        TimeLab.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TimeLab.setText("Time");
        TimeLab.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        DateLab.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        DateLab.setText("Date");
        DateLab.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BackMarkAttBut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        BackMarkAttBut.setText("Back");
        BackMarkAttBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackMarkAttButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(DateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TimeLab, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BackMarkAttBut)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(DateLab)
                    .addComponent(TimeLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackMarkAttBut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmboIntakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboIntakeActionPerformed
        if (cmboIntake.getSelectedItem().toString().equals("UCDF1608IT")) {
            ModuleLab.setText("System Analysis (SA)");
        }
        if (cmboIntake.getSelectedItem().toString().equals("UC1F1704IT")) {
            ModuleLab.setText("Object Oriented (OOP)");
        }
        if (cmboIntake.getSelectedItem().toString().equals("UC2F1701IT")) {
            ModuleLab.setText("Web Application (WAPP)");

        }
    }//GEN-LAST:event_cmboIntakeActionPerformed

    private void TakeAttendButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TakeAttendButActionPerformed
        

        if (cmboIntake.getSelectedItem().toString().equals("UCDF1608IT")) {
            display1608IT();

        } else if (cmboIntake.getSelectedItem().toString().equals("UC1F1704IT")) {
            display1704IT();
        } else if (cmboIntake.getSelectedItem().toString().equals("UC2F1701IT")) {
            display1701IT();
        }

    }//GEN-LAST:event_TakeAttendButActionPerformed

    private void BackMarkAttButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMarkAttButActionPerformed
        this.setVisible(false);
        LecturerMenu lm = new LecturerMenu();
        lm.setVisible(true);
    }//GEN-LAST:event_BackMarkAttButActionPerformed

    private void cmboDaydateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboDaydateActionPerformed
        switch (cmboDaydate.getSelectedItem().toString()) {

            case "9th August":
                ClassLab.setText("Lecture");
                TimeslotLab.setText("8.00am - 10.00am");
                break;
            case "8th August":
            case "10th August":
                ClassLab.setText("Tutorial");
                TimeslotLab.setText("12.00pm - 2.00pm");
                break;
            case "11th August":
                ClassLab.setText("Replacement Class");
                TimeslotLab.setText("10.00am - 12.00pm");
                break;
            case "7th August":
                ClassLab.setText("Lecture");
                TimeslotLab.setText("8.00am - 10.00am");
                break;
        }

    }//GEN-LAST:event_cmboDaydateActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyAtten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyAtten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyAtten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyAtten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyAtten().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackMarkAttBut;
    private javax.swing.JLabel ClassLab;
    private javax.swing.JLabel DateLab;
    private javax.swing.JLabel ModuleLab;
    public javax.swing.JButton TakeAttendBut;
    private javax.swing.JLabel TimeLab;
    private javax.swing.JLabel TimeslotLab;
    public javax.swing.JComboBox<String> cmboDaydate;
    private javax.swing.JComboBox<String> cmboIntake;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
