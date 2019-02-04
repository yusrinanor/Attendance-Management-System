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
public class MarkAttendance extends javax.swing.JFrame {

  

    public MarkAttendance() {
        initComponents();

        showdate();
        showtime();

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
    public void form1608IT() {
        TakeAttend1608IT ta = new TakeAttend1608IT();
        this.setVisible(false);
        ta.setVisible(true);
        
        if (cmboClass.getSelectedItem().toString().equals("Lecture")) {
            ta.ClassLab.setText("Lecture");
        } if (cmboClass.getSelectedItem().toString().equals("Tutorial")) {
            ta.ClassLab.setText("Tutorial");
        }

        switch (cmboTimeslot.getSelectedItem().toString()) {

            case "8.00am - 10.00am":
                ta.TimeLab.setText("8.00am - 10.00am");
                break;
            case "10.00am - 12.00pm":
                ta.TimeLab.setText("10.00am - 12.00pm");
                break;
            case "12.00pm - 2.00pm":
                ta.TimeLab.setText("12.00pm - 2.00pm");
                break;
            case "2.00pm - 4.00pm":
                ta.TimeLab.setText("2.00pm - 4.00pm");
                break;
        }
    }

    public void form1701IT() {
        TakeAttend1701IT ta1 = new TakeAttend1701IT();
        this.setVisible(false);
        ta1.setVisible(true);
            if (cmboClass.getSelectedItem().toString().equals("Lecture")) {
                ta1.ClassLab.setText("Lecture");
            } else if (cmboClass.getSelectedItem().toString().equals("Tutorial")) {
                ta1.ClassLab.setText("Tutorial");
            }

            switch (cmboTimeslot.getSelectedItem().toString()) {

                case "8.00am - 10.00am":
                    ta1.TimeLab.setText("8.00am - 10.00am");
                    break;
                case "10.00am - 12.00pm":
                    ta1.TimeLab.setText("10.00am - 12.00pm");
                    break;
                case "12.00pm - 2.00pm":
                    ta1.TimeLab.setText("12.00pm - 2.00pm");
                    break;
                case "2.00pm - 4.00pm":
                    ta1.TimeLab.setText("2.00pm - 4.00pm");
                    break;
            }

        }
    

    public void form1704IT() {
        TakeAttend1704IT ta2 = new TakeAttend1704IT();
        this.setVisible(false);
        ta2.setVisible(true);
            if (cmboClass.getSelectedItem().toString().equals("Lecture")) {
                ta2.ClassLab.setText("Lecture");
            } else if (cmboClass.getSelectedItem().toString().equals("Tutorial")) {
                ta2.ClassLab.setText("Tutorial");
            }

            switch (cmboTimeslot.getSelectedItem().toString()) {

                case "8.00am - 10.00am":
                    ta2.TimeLab.setText("8.00am - 10.00am");
                    break;
                case "10.00am - 12.00pm":
                    ta2.TimeLab.setText("10.00am - 12.00pm");
                    break;
                case "12.00pm - 2.00pm":
                    ta2.TimeLab.setText("12.00pm - 2.00pm");
                    break;
                case "2.00pm - 4.00pm":
                    ta2.TimeLab.setText("2.00pm - 4.00pm");
                    break;
            }
        }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmboIntake = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmboClass = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        TakeAttendBut = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cmboTimeslot = new javax.swing.JComboBox<>();
        ModuleLab = new javax.swing.JLabel();
        BackMarkAttBut = new javax.swing.JButton();
        TimeLab = new javax.swing.JLabel();
        DateLab = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        jLabel1.setText("Attendance Marking");

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

        cmboClass.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cmboClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lecture", "Tutorial", " " }));
        cmboClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboClassActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Timeslot             :");

        TakeAttendBut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        TakeAttendBut.setText("Take Attendance");
        TakeAttendBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TakeAttendButActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("Classes               :");

        cmboTimeslot.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cmboTimeslot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8.00am - 10.00am", "10.00am - 12.00pm", "12.00pm - 2.00pm", "2.00pm - 4.00pm", " ", " " }));

        ModuleLab.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ModuleLab.setText(" ");
        ModuleLab.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TakeAttendBut))
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
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmboClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmboTimeslot, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmboClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmboTimeslot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addComponent(TakeAttendBut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackMarkAttBut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        BackMarkAttBut.setText("Back");
        BackMarkAttBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackMarkAttButActionPerformed(evt);
            }
        });

        TimeLab.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TimeLab.setText("Time");
        TimeLab.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        DateLab.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        DateLab.setText("Date");
        DateLab.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BackMarkAttBut))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(DateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TimeLab, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TimeLab)
                        .addComponent(DateLab)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BackMarkAttBut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMarkAttButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMarkAttButActionPerformed
        this.setVisible(false);
        LecturerMenu lm = new LecturerMenu();
        lm.setVisible(true);
    }//GEN-LAST:event_BackMarkAttButActionPerformed

    private void cmboClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboClassActionPerformed

    }//GEN-LAST:event_cmboClassActionPerformed

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
            
            form1608IT();
            
        }
        if (cmboIntake.getSelectedItem().toString().equals("UC2F1701IT")) {
            form1701IT();
            
        }
        if (cmboIntake.getSelectedItem().toString().equals("UC1F1704IT")) {
            form1704IT();
            

        }
    }//GEN-LAST:event_TakeAttendButActionPerformed

    

    

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarkAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarkAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackMarkAttBut;
    private javax.swing.JLabel DateLab;
    private javax.swing.JLabel ModuleLab;
    private javax.swing.JButton TakeAttendBut;
    private javax.swing.JLabel TimeLab;
    public javax.swing.JComboBox<String> cmboClass;
    private javax.swing.JComboBox<String> cmboIntake;
    public javax.swing.JComboBox<String> cmboTimeslot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
