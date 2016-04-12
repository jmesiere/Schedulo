package entities;

/*

    DROP TABLE IF EXISTS Retard;
    CREATE TABLE Retard (
            idRetard INTEGER AUTO_INCREMENT NOT NULL,
            justificatifRetard VARCHAR(255),
            texteRetard TEXT,
            idSession INTEGER,
            idUtilisateur INTEGER,
            PRIMARY KEY (idRetard),
            FOREIGN KEY (idSession) REFERENCES Session (idSession),
            FOREIGN KEY (idUtilisateur) REFERENCES Utilisateur (idUtilisateur)
    );
 */

public class Retard {
    private int idRetard;
    private String justificatifRetard;
    private String texteRetard;
    private int idSession;
    private int idUtilisateur;

    public Retard(int idRetard, String justificatifRetard, String texteRetard, int idSession, int idUtilisateur){
        this.idRetard = idRetard;
        this.justificatifRetard = justificatifRetard;
        this.texteRetard = texteRetard;
        this.idSession = idSession;
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdRetard() {
        return idRetard;
    }

    public void setIdRetard(int idRetard) {
        this.idRetard = idRetard;
    }

    public String getJustificatifRetard() {
        return justificatifRetard;
    }

    public void setJustificatifRetard(String justificatifRetard) {
        this.justificatifRetard = justificatifRetard;
    }

    public String getTexteRetard() {
        return texteRetard;
    }

    public void setTexteRetard(String texteRetard) {
        this.texteRetard = texteRetard;
    }

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
}