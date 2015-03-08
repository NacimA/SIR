package baseDeDonnée;

import CHU.PH;
import static cryptage.Cesar.crypt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import patient.Patient;

public class PHBD {
    
    private static ArrayList<PH> lPH;
    private static PH PH;
    private static ResultSet resultat;
 
    public PHBD(Statement transmission){
            try {
                lPH = new ArrayList<PH>();
                resultat =transmission.executeQuery("select * from ph");     
                while (resultat.next()){
                    PH = new PH();
                    PH.setIdPH(resultat.getInt("idPH"));
                    PH.setNom(resultat.getString("nom"));
                    PH.setPrenom(resultat.getString("prenom"));
                    PH.setMdpPH(resultat.getString("mdpPH"));
                    lPH.add(PH);
                }
            } 
            catch (SQLException ex) {
                Logger.getLogger(PatientBD.class.getName()).log(Level.SEVERE, null, ex);               
            }
    }
    
    public static void ajouterPH(Statement transmission, int idPH,String nom, String prenom,String mdpPH){
        try{
           
            transmission.executeUpdate("insert into ph values ('"+idPH+"','"+nom+"','"+prenom+"','"+mdpPH+"')");
        }
        catch (SQLException ex){         
        }
    }
    
    public ArrayList<PH> getlPH(){
        return lPH;
    }
}

