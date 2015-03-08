package ComHL7;

import library.interfaces.Patient;
import library.interfaces.ServeurHL7;

public class sHL7 {
    public sHL7(int port){
        ServeurHL7 serveur = new ServeurHL7();
        serveur.connection(port);
        serveur.ecoute();
        String messageHL7 = serveur.protocole();
        Patient p = null;
        p= serveur.getPatient();
        System.out.println(messageHL7);
        System.out.println(p.getFirstName());
        
        
    }    


}
