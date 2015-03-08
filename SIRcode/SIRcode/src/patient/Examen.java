/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

import java.util.Date;

/**
 *
 * @author nacim
 */
public class Examen {
    private Date dateExam;
    private String nomPH;
    private char typeExam;
    private String compteRendu;
    private int numArchive;
    private String papier = "Voir DMR papier";
    private int idPatient;

    
    public Examen(Date dateExam, String nomPH,int idPatient, char typeExam, String compteRendu, int numArchive){
        this.dateExam = dateExam;
        this.nomPH = nomPH;
        this.typeExam = typeExam;
        this.compteRendu = compteRendu;
        this.numArchive = numArchive;
        this.idPatient = idPatient;
    }
        public Examen( String nomPH,  String compteRendu, int numArchive){
        this.nomPH = nomPH;
        this.compteRendu = compteRendu;
        this.numArchive = numArchive;
    }
        public Examen(){
                
        }
    /**
     * @return the dateExam
     */
    public Date getDateExam() {
        return dateExam;
    }

    /**
     * @param dateExam the dateExam to set
     */
    public void setDateExam(Date dateExam) {
        this.dateExam = dateExam;
    }

    /**
     * @return the nomPH
     */
    public String getNomPH() {
        return nomPH;
    }

    /**
     * @param nomPH the nomPH to set
     */
    public void setNomPH(String nomPH) {
        this.nomPH = nomPH;
    }

    /**
     * @return the typeExam
     */
    public char getTypeExam() {
        return typeExam;
    }

    /**
     * @param typeExam the typeExam to set
     */
    public void setTypeExam(char typeExam) {
        this.typeExam = typeExam;
    }

    /**
     * @return the compteRendu
     */
    public String getCompteRendu() {
        return compteRendu;
    }

    /**
     * @param compteRendu the compteRendu to set
     */
    public void setCompteRendu(String compteRendu) {
        this.compteRendu = compteRendu;
    }

    /**
     * @return the numArchive
     */
    public int getNumArchive() {
        return numArchive;
    }

    /**
     * @param numArchive the numArchive to set
     */
    public void setNumArchive(int numArchive) {
        this.numArchive = numArchive;
    }

    /**
     * @return the papier
     */
    public String getPapier() {
        return papier;
    }

    /**
     * @param papier the papier to set
     */
    public void setPapier(String papier) {
        this.papier = papier;
    }
    public String toString(){
        String re;
        re = "nomPH:"+nomPH+compteRendu+numArchive;
        return re;
    }

    /**
     * @return the idPatient
     */
    public int getIdPatient() {
        return idPatient;
    }

    /**
     * @param idPatient the idPatient to set
     */
    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }
}
