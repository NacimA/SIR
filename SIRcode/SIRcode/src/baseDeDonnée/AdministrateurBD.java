package baseDeDonnée;

import CHU.Administrateur;
import static cryptage.Cesar.crypt;
import static cryptage.Cesar.decrypt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdministrateurBD {
    private static ArrayList<Administrateur> lAdministrateur;
    private static Administrateur administrateur;
    private static ResultSet resultat;
 
    public AdministrateurBD(Statement transmission){
            try {
                lAdministrateur = new ArrayList<Administrateur>();
                resultat =transmission.executeQuery("select * from administrateur");     
                while (resultat.next()){
                    administrateur = new Administrateur();                   
                    administrateur.setIdAdministrateur(resultat.getInt("idAdministrateur"));
                    administrateur.setNom(decrypt(4,resultat.getString("nom")));
                    administrateur.setPrenom(decrypt(4,resultat.getString("prenom")));
                    administrateur.setMdp(resultat.getString("mdp"));
                    lAdministrateur.add(administrateur);
                }
            } 
            catch (SQLException ex) {
                Logger.getLogger(PatientBD.class.getName()).log(Level.SEVERE, null, ex);               
            }
    }
    
    public static void ajouterAdministrateur(Statement transmission, int idAdministrateur,String nom, String prenom,String mdp){
        try{
           
            transmission.executeUpdate("insert into administrateur values ('"+idAdministrateur+"','"+crypt(3,nom)+"','"+crypt(4,prenom)+"','"+mdp+"')");
        }
        catch (SQLException ex){         
        }
    }
    
    public ArrayList<Administrateur> getlAdministrateur(){
        return lAdministrateur;
    }
    
    
    
    
    
    
    
}
