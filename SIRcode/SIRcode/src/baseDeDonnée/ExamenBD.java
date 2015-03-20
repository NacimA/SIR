package baseDeDonnée;

import static cryptage.Cesar.crypt;
import static cryptage.Cesar.decrypt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import patient.Examen;



public class ExamenBD { 
    private static ArrayList<Examen> lExamen;
    private static Examen examen;
    private static ResultSet resultat;
    
    public ExamenBD(Statement transmission){
            try {
                lExamen = new ArrayList<Examen>();
                resultat =transmission.executeQuery("select * from ");     
                while (resultat.next()){
                    System.out.println(resultat.getString("nom"));
                    examen = new Examen();
                    
                    examen.setDateExam(resultat.getDate("dateExam"));
                    examen.setNomPH(decrypt(3,resultat.getString("nomPH")));
                    examen.setTypeExam((char)resultat.getString("typeExam").charAt(0));
                    examen.setCompteRendu(resultat.getString("compteRendu"));
                    examen.setNumArchive(resultat.getInt("numArchive"));
                    examen.setPapier(resultat.getString("papier"));
                    examen.setIdPatient(resultat.getInt("idPatient"));
                                                                         
                    lExamen.add(examen);
                }
            } 
            catch (SQLException ex) {
                Logger.getLogger(PatientBD.class.getName()).log(Level.SEVERE, null, ex);               
            }
                
}
    
           public static void ajouterExamen(Statement transmission, Date date,String nomPH,int idPatient, char typeExam,String compteRendu,int numArchive,String papier){
        try{
           
            transmission.executeUpdate("insert into examen values ('"+date+"','"+crypt(3,nomPH)+"','"+idPatient+"','"+typeExam+"','"+compteRendu+"','"+numArchive+"')");
        }
        catch (SQLException ex){         
        }
    }
    
    public ArrayList<Examen> getlExamen(){
        return lExamen;
    }
    
}
 
            
    
 
    
    

