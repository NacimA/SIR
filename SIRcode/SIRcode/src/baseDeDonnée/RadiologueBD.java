package baseDeDonnée;


import CHU.Radiologue;
import static cryptage.Cesar.crypt;
import static cryptage.Cesar.decrypt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RadiologueBD {
    

    
    private static ArrayList<Radiologue> lRadiologue;
    private static Radiologue radiologue;
    private static ResultSet resultat;
 
    public RadiologueBD(Statement transmission){        
            try {
                lRadiologue = new ArrayList<Radiologue>();
                resultat =transmission.executeQuery("select * from radiologue");     
                while (resultat.next()){
                    radiologue = new Radiologue();
                    radiologue.setId(resultat.getInt("idRadiologue"));
                    radiologue.setNom(decrypt(3,resultat.getString("nom")));
                    radiologue.setPrenom(decrypt(4,resultat.getString(resultat.getString("prenom"))));
                    radiologue.setMdpRadiologue(resultat.getString("mdpRadiologue"));
                    lRadiologue.add(radiologue);
                }
            } 
            catch (SQLException ex) {
                Logger.getLogger(PatientBD.class.getName()).log(Level.SEVERE, null, ex);               
            }
    }
    
    public static void ajouterRadiologue(Statement transmission,int idRadiologue, String nom,String prenom,String mdpRadiologue){
        try{
           
            transmission.executeUpdate("insert into radiologue values ('"+idRadiologue+"','"+crypt(3,nom)+"','"+crypt(4,prenom)+"','"+mdpRadiologue+"')");
        }
        catch (SQLException ex){         
        }
    }
    
    public ArrayList<Radiologue> getlRadiologue(){
        return lRadiologue;
    }
}

    

