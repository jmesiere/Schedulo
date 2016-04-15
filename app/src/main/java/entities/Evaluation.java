package entities;
/*
DROP TABLE IF EXISTS Evaluation;
        CREATE TABLE Evaluation (
        idEvaluation INTEGER AUTO_INCREMENT NOT NULL,
        dateEvaluation DATE NOT NULL,
        dureeEvaluation DATETIME,
        idCours INTEGER,
        PRIMARY KEY (idEvaluation),
        FOREIGN KEY (idCours) REFERENCES Cours (idCours)
        );
*/

public class Evaluation {

    private int idEvaluation;
    private String dateEvaluation;
    private String dureeEvaluation;
    private int idCours;
    private double coefficient;


    public Evaluation (int idEvaluation, String dateEvaluation, String dureeEvaluation, int idCours, double coefficient){
        this.idEvaluation = idEvaluation;
        this.dateEvaluation = dateEvaluation;
        this.dureeEvaluation = dureeEvaluation;
        this.idCours = idCours;
        this.coefficient = coefficient;

    }

    public int getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(int idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public String getDateEvaluation() {
        return dateEvaluation;
    }

    public void setDateEvaluation(String dateEvaluation) {
        this.dateEvaluation = dateEvaluation;
    }

    public String getDureeEvaluation() {
        return dureeEvaluation;
    }

    public void setDureeEvaluation(String dureeEvaluation) {
        this.dureeEvaluation = dureeEvaluation;
    }

    public int getIdCours() {
        return idCours;
    }

    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCOefficient(int coefficient) {
        this.coefficient = coefficient;
    }
}
