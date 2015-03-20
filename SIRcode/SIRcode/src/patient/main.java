/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

import ComHL7.cHL7;
import java.util.ArrayList;
import java.util.Date;
//import library.interfaces.Patient;

/**
 *
 * @author nacim
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    Patient p = new Patient(51,"s",'I');
//    p.setSex('F');
//    p.setFirstName("Sofiane");
//    Date date = new Date();
//    date.setDate(1991);
//    p.setBirth(date);
//    cHL7 r = new cHL7("localhost",4444,p);
        
        Patient p = new Patient("otmani","sofiane");
        Patient pa = new Patient("otami","sohhf");
        Examen examen = new Examen("Nacim", "foutue", 35);
        ArrayList<Examen> exam = new ArrayList<Examen>();
        DMR dmr = new DMR(p);
        System.out.println(examen.toString());
        dmr.ajoutExamens(examen);
        
    }
    
}
