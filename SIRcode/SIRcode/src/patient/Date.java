/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

/**
 *
 * @author nacim
 */
public class Date {
    private int annee;
    private int mois;
    private int jours;
    private int heure;
    private int minute;
    private int seconde;
    
    
    public Date(int annee, int mois, int jours){
        this.annee=annee;
        this.mois=mois;
        this.jours=jours;
    }
    
      public Date(int annee, int mois, int jours,int heure,int minute,int seconde){
        this.annee=annee;
        this.mois=mois;
        this.jours=jours;
        this.heure=heure;
        this.minute=minute;
        this.seconde=seconde;
        
    }
    

    
    
    
    public String toString(){
        return jours+"/"+mois+"/"+annee;
    }
    /**
     * @return the annee
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * @param annee the annee to set
     */
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    /**
     * @return the mois
     */
    public int getMois() {
        return mois;
    }

    /**
     * @param mois the mois to set
     */
    public void setMois(int mois) {
        this.mois = mois;
    }

    /**
     * @return the jours
     */
    public int getJours() {
        return jours;
    }

    /**
     * @param jours the jours to set
     */
    public void setJours(int jours) {
        this.jours = jours;
    }

    /**
     * @return the heure
     */
    public int getHeure() {
        return heure;
    }

    /**
     * @param heure the heure to set
     */
    public void setHeure(int heure) {
        this.heure = heure;
    }

    /**
     * @return the minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * @param minute the minute to set
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
     * @return the seconde
     */
    public int getSeconde() {
        return seconde;
    }

    /**
     * @param seconde the seconde to set
     */
    public void setSeconde(int seconde) {
        this.seconde = seconde;
    }
}
