package ComHL7;

import library.interfaces.ClientHL7;
import library.interfaces.Patient;

public class cHL7 {
    public cHL7(String host,int port, Patient p){
        ClientHL7 client = new ClientHL7();
        client.connexion(host, port);
        client.admit(p);
        System.out.println(p.getPatClass()+"\n"+p.getFamillyName()+"\n"+p.getID());
    }
}
