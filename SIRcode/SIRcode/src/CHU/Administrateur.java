package CHU;
public class Administrateur {
    private int idAdministrateur;
    private String mdp;
    private String nom;
    private String prenom;
    
     public Administrateur(int idAdministrateur, String nom, String prenom, String mdp) {
        this.idAdministrateur = idAdministrateur;
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
    }

    public Administrateur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the idAdministrateur
     */
    public int getIdAdministrateur() {
        return idAdministrateur;
    }

    /**
     * @param idAdministrateur the idAdministrateur to set
     */
    public void setIdAdministrateur(int idAdministrateur) {
        this.idAdministrateur = idAdministrateur;
    }

    /**
     * @return the mdp
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * @param mdp the mdp to set
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    


    
}
