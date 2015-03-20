package baseDeDonnée;

import static baseDeDonnée.AdministrateurBD.ajouterAdministrateur;
import static baseDeDonnée.ExamenBD.ajouterExamen;
import static baseDeDonnée.PHBD.ajouterPH;
import static baseDeDonnée.PatientBD.ajouterPatient;
import static baseDeDonnée.RadiologueBD.ajouterRadiologue;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import patient.Patient;


public class DBconnect {
    
    private PatientBD patientBD;
    private ArrayList<Patient> lPatient;
    private final String urlConnection = "jdbc:mysql://localhost:3306/sir";
    private String loginConnection = "root";
    private final String password = "root";
    private Connection connection;
    private Statement transmission;
    private int id;
    private String nom,prenom;
    
    
    public DBconnect(){
         try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(urlConnection, loginConnection, password);
            transmission = connection.createStatement();
        } 
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("probleme de connection a MySQL : " + e);
        }
    }
    
    
    public ArrayList<Patient> getlPatient(){
        patientBD = new PatientBD(transmission);
        return patientBD.getlPatient();
    }
    
    
    public void ajoutPatient(int id, String nom, String prenom,int idSIR,Date date, char genre){
        ajouterPatient(transmission,id,nom,prenom,idSIR,date,genre);
    }
    
    public void ajoutExamen(Date date,String nomPH,int idPatient, char typeExam,String compteRendu,int numArchive,String papier){
        ajouterExamen(transmission,date,nomPH,idPatient,typeExam,compteRendu,numArchive,papier);
    }
    
     public void ajoutRadiologue(int idRadiologue,String nom,String prenom,String mdpRadiologue){
        ajouterRadiologue(transmission,idRadiologue,nom,prenom,mdpRadiologue);
    }
     
      public void ajoutPH(int idPH,String nom,String prenom,String mdpPH){
        ajouterPH(transmission,idPH,nom,prenom,mdpPH);
    }
      
    public void ajoutAdministrateur(int idAdministrateur, String nom, String prenom, String mdp) {
        ajouterAdministrateur(transmission, idAdministrateur, nom, prenom, mdp);
    }
}
