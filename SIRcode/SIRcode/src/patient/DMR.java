/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

import java.util.ArrayList;

/**
 *
 * @author nacim
 */
public class DMR {
    private ArrayList<Examen> examens;
    private Patient patient;

    
    public DMR(Patient patient){
        this.patient = patient;
    }
    /**
     * @return the examens
     */
    public ArrayList<Examen> getExamens() {
        return examens;
    }

    /**
     * @param examens the examens to set
     */
    public void setExamens(ArrayList<Examen> examens) {
        this.examens = examens;
    }

    public void ajoutExamens(Examen e){
        examens.add(e);
    }
    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public String toString(){
      String re;
      re = "Patient: "+ patient+ "\n examen:\n"+examens.get(0);
      return re;
    }
}
