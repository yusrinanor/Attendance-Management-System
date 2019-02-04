/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemgmtsyst;


public class AttendanceClass {
    
    MarkAttendance ma;
    TakeAttend1608IT ta;
    TakeAttend1701IT ta1;
    TakeAttend1704IT ta2;
 
 
    
    
    AttendanceClass()
    {
        this.ma = new MarkAttendance();
        this.ta = new TakeAttend1608IT();
        this.ta1 = new TakeAttend1701IT();
        this.ta2 = new TakeAttend1704IT();
         
    }
    
    public void CallAttendance1608IT(){
        //this.ta = new TakeAttend1608IT();
        
        ta.setVisible(true);
        
        if (ma.cmboClass.getSelectedItem().toString().equals("Lecture")) {
            ta.ClassLab.setText("Lecture");
        } else if (ma.cmboClass.getSelectedItem().toString().equals("Tutorial")) {
            ta.ClassLab.setText("Tutorial");
        }

        switch (ma.cmboTimeslot.getSelectedItem().toString()) {

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
    
    public void CallAttendance1701IT(){
        //this.ta1 = new TakeAttend1701IT();
       
        ta1.setVisible(true);
            if (ma.cmboClass.getSelectedItem().toString().equals("Lecture")) {
                ta1.ClassLab.setText("Lecture");
            } else if (ma.cmboClass.getSelectedItem().toString().equals("Tutorial")) {
                ta1.ClassLab.setText("Tutorial");
            }

            switch (ma.cmboTimeslot.getSelectedItem().toString()) {

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
    
    public void CallAttendance1704IT(){
        //this.ta2 = new TakeAttend1704IT();
        
        ta2.setVisible(true);
            if (ma.cmboClass.getSelectedItem().toString().equals("Lecture")) {
                ta2.ClassLab.setText("Lecture");
            } else if (ma.cmboClass.getSelectedItem().toString().equals("Tutorial")) {
                ta2.ClassLab.setText("Tutorial");
            }

            switch (ma.cmboTimeslot.getSelectedItem().toString()) {

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
        
    }



