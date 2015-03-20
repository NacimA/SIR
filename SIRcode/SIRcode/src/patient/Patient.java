package patient;
import java.sql.Date;
public class Patient {

    private Integer id;      
    private char patClass;
    private String famillyName;
    private String firstName;
    private int idSIR;
    private Date birth;
    private char genre;
    
    public Patient(String famillyName, String firstName){
        this.famillyName = famillyName;
        this.firstName = firstName;
    }
    
    public Patient(){}
    
    public Patient(Integer Id, String famillyName, char patClass, Date birth, char sex, String firstName){
        this.id = Id;
        this.patClass = patClass;
        this.famillyName = famillyName;
        this.genre = genre;
        this.firstName = firstName;
        this.birth = birth;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public char getPatClass() {
        return patClass;
    }

    public void setPatClass(char patClass) {
        this.patClass = patClass;
    }

    public String getFamillyName() {
        return famillyName;
    }

    public void setFamillyName(String famillyName) {
        this.famillyName = famillyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getIdSIR() {
        return idSIR;
    }

    public void setIdSIR(int idSIR) {
        this.idSIR = idSIR;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }   
}