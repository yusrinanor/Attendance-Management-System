/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemgmtsyst;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;



        
public class AttendanceMgmtSyst {

   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run(){
            ModifyAtten atten = new ModifyAtten();
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(ModifyAtten.DISPOSE_ON_CLOSE);
            frame.getContentPane().add(atten);
            frame.pack();
            frame.setVisible(true);
        }
    });
        
       
    }
    
}
