/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDonnée;


import patient.Examen;
import java.sql.Date;
/**
 *
 * @author nacim
 */
public class maintest {
    public static PatientBD patient;

    public static void main(String[] args) {
        
        
        DBconnect connect = new DBconnect();
        Date date = new Date(93,7,11);
        connect.ajoutPatient(1, "otmani", "soso", 2, date,'F');
        DB dbPatient = new DB();
        // System.out.println(connect.getlPatient().get(0).getBirth());
              
        
        //Examen examen= new Examen();
        
      
     
        
    }
}
