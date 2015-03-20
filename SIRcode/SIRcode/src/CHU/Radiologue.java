package CHU;
public class Radiologue {
    
    private String nom;
    private String prenom;
    private int idRadiologue;
    private String mdpRadiologue;
        
    public Radiologue(int idRadiologue,String nom, String prenom,String mdpRadiologue){
        this.idRadiologue=idRadiologue;
        this.nom = nom;
        this.prenom = prenom;
        this.mdpRadiologue=mdpRadiologue;
    }
    
    public Radiologue(){}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getIdRadiologue() {
        return idRadiologue;
    }

    public void setId(int idRadiologue) {
        this.idRadiologue = idRadiologue;
    }

    /**
     * @return the mdpRadiologue
     */
    public String getMdpRadiologue() {
        return mdpRadiologue;
    }

    /**
     * @param mdpRadiologue the mdpRadiologue to set
     */
    public void setMdpRadiologue(String mdpRadiologue) {
        this.mdpRadiologue = mdpRadiologue;
    }
}
