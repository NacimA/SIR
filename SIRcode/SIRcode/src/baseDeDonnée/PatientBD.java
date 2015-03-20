/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDonnée;

import static cryptage.Cesar.crypt;
import static cryptage.Cesar.decrypt;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import patient.Patient;


/**
 *
 * @author nacim
 */
public class PatientBD {
    
    private static ArrayList<Patient> lPatient;
    private static Patient patient;
    private static ResultSet resultat;
 
    public PatientBD(Statement transmission){
            try {
                lPatient = new ArrayList<Patient>();
                resultat =transmission.executeQuery("select * from patient");     
                while (resultat.next()){
                    patient = new Patient();                   
                    patient.setFamillyName(decrypt(3,resultat.getString("nom")));
                    patient.setId(resultat.getInt("id"));
                    patient.setFirstName(decrypt(3,resultat.getString("prenom")));
                    patient.setGenre((char)resultat.getString("genre").charAt(0));
                    patient.setBirth(resultat.getDate("date"));
                    patient.setIdSIR(resultat.getInt("idSIR"));
                    lPatient.add(patient);
                }
            } 
            catch (SQLException ex) {
                Logger.getLogger(PatientBD.class.getName()).log(Level.SEVERE, null, ex);               
            }
    }
    
    public static void ajouterPatient(Statement transmission, int id,String nom, String prenom,int idSIR,Date date,char genre){
        try{
           
            transmission.executeUpdate("insert into patient values ('"+id+"','"+crypt(3,nom)+"','"+crypt(4,prenom)+"','"+idSIR+"','"+date+"','"+genre+"')");
        }
        catch (SQLException ex){         
        }
    }
    
    public ArrayList<Patient> getlPatient(){
        return lPatient;
    }
}
