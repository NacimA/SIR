package CHU;
public class PH {
    private int idPH;
    private String mdpPH;
    private String nom;
    private String prenom;

    
    public PH(int idPH, String nom, String prenom, String mdpPH) {
        this.idPH = idPH;
        this.nom = nom;
        this.prenom = prenom;
        this.mdpPH = mdpPH;
    }
        
    public PH(){};
    
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


    /**
     * @return the idPH
     */
    public int getIdPH() {
        return idPH;
    }

    /**
     * @param idPH the idPH to set
     */
    public void setIdPH(int idPH) {
        this.idPH = idPH;
    }

    /**
     * @return the mdpPH
     */
    public String getMdpPH() {
        return mdpPH;
    }

    /**
     * @param mdpPH the mdpPH to set
     */
    public void setMdpPH(String mdpPH) {
        this.mdpPH = mdpPH;
    }
}
