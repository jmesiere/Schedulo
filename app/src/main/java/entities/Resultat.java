package entities;

/*
      DROP TABLE IF EXISTS Resultat ;
        CREATE TABLE Resultat (
        idEvaluation,
        idUtilisateur INTEGER,
        note INTEGER NOT NULL	,
        PRIMARY KEY (idEvaluation,idUtilisateur),
        FOREIGN KEY (idEvaluation) REFERENCES Evaluation (idEvaluation),
        FOREIGN KEY (idUtilisateur) REFERENCES Utilisateur (idUtilisateur)
        );
*/

public class Resultat {
    private double note;
    private int idEvaluation;
    private int idUtilisateur;

    public Resultat(double note,int idEvaluation,int idUtilisateur){
        this.note=note;
        this.idEvaluation=idEvaluation;
        this.idUtilisateur=idUtilisateur;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note=note;
    }

    public int getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(int idEvaluation) {
        this.idEvaluation=idEvaluation;
    }
    public int getIdUtilisateur() {
        return idUtilisateur;
    }
    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur=idUtilisateur;
    }



}
