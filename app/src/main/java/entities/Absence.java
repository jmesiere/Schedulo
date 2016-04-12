package entities;

/*
DROP TABLE IF EXISTS Absence ;
        CREATE TABLE Absence (
        idUtilisateur INTEGER AUTO_INCREMENT NOT NULL,
        dateDebut DATE NOT NULL,
        dateFin DATE,
        PRIMARY KEY (idUtilisateur),
        FOREIGN KEY (idUtilisateur) REFERENCES Utilisateur (idUtilisateur)
        );
*/
public class Absence {

    private int idUtilisateur;
    private String dateDebut;
    private String dateFin;

    public Absence(int idUtilisateur, String dateDebut, String dateFin){
        this.idUtilisateur = idUtilisateur;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }
}