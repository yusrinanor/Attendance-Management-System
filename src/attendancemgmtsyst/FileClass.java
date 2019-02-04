/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancemgmtsyst;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class FileClass {

    protected File filename;

    public void textfile1() throws FileNotFoundException {
        
                BufferedReader in = new BufferedReader(new FileReader("adminaccrec.txt"));
                String line;
                int Flag = 0;
            
    }

    public void textfile2() {
        filename = new File("attendancepercent");
    }

    public void textfile3() {
        filename = new File("attendancerecord1608");
    }

    public void textfile4() {
        filename = new File("attendancerecord1701");
    }

    public void textfile5() {
        filename = new File("attendancerecord1704");
    }

    public void textfile6() {
        filename = new File("requestrec");
    }

    public void textfile7() {
        filename = new File("lectaccrecord");
    }

    public void textfile8() {
        filename = new File("lectrecord");
    }

    public void textfile9() {
        filename = new File("attendancerecord1701");
    }

    public void textfile10() {
        filename = new File("studaccrec");
    }

    public void textfile11() {
        filename = new File("studentrecord");
    }

    public void textfile12() {
        filename = new File("UC1F1704IT");
    }
    
    public void textfile13(){
    filename = new File ("UC2F1701IT" );   
    }
    
    public void textfile14(){
    filename = new File ("UCDF1608IT" );   
    }

}
