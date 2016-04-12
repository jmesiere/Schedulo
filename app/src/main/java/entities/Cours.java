package entities;

/*
        DROP TABLE IF EXISTS Cours;
        CREATE TABLE Cours (
        idCours INTEGER AUTO_INCREMENT NOT NULL,
        nomCours VARCHAR(255) NOT NULL,
        coefficientCours INTEGER,
        idClasse INTEGER,
        PRIMARY KEY (idCours),
        FOREIGN KEY (idClasse) REFERENCES Classe (idClasse)
        );
        */

public class Cours {
    private int idCours;
    private String nomCours;
    private int coefficientCours;
    private int idClasse;

    public Cours(int idCours, String nomCours, int coefficientCours, int idClasse){
        this.idCours = idCours;
        this.nomCours = nomCours;
        this.coefficientCours = coefficientCours;
        this.idClasse = idClasse;
    }

    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }

    public int getIdCours(){
        return idCours;
    }

    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }

    public String getNomCours(){
        return nomCours;
    }

    public void setCoefficientCours(int coefficientCours) {
        this.coefficientCours = coefficientCours;
    }

    public int getCoefficientCours(){
        return coefficientCours;
    }

    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }

    public int getIdClasse() {
        return idClasse;
    }

}
