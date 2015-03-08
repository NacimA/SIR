/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDonnée;

import java.util.ArrayList;
import patient.Patient;

/**
 *
 * @author nacim
 */
public class DB {
    private ArrayList<Patient> lPatient;
    private DBconnect dbConnect;
    
    public DB(){
        dbConnect = new DBconnect();
        lPatient = dbConnect.getlPatient();
        for(Patient p :lPatient){
        System.out.println(p.getId());
            System.out.println(p.getGenre());
        }
        }
}
