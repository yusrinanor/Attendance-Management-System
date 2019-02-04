/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemgmtsyst;

/**
 *
 * @author User
 */
public class ModifyAttendClass {
    ModifyAtten matt;
    TakeAttend1608IT ta;
    TakeAttend1701IT ta1;
    TakeAttend1704IT ta2;
    
    ModifyAttendClass(){
        this.matt = new ModifyAtten();
        this.ta = new TakeAttend1608IT();
        this.ta1 = new TakeAttend1701IT();
        this.ta2 = new TakeAttend1704IT();
    }
    
    public void display1608IT(){
        ta.setVisible(true);
        ta.Load2But.setVisible(true);
        ta.MainLoadBut.setVisible(false);
        
        switch (matt.cmboDaydate.getSelectedItem().toString()) {
     
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
}
