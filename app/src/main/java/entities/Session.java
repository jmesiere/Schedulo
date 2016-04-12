package entities;

/*
    DROP TABLE IF EXISTS Session;
    CREATE TABLE Session (
        idSession INTEGER AUTO_INCREMENT NOT NULL,
        dateSession DATE NOT NULL,
        dureeSession DATETIME,
        contenuSession VARCHAR(255),
        idCours INTEGER,
        PRIMARY KEY (idSession),
        FOREIGN KEY (idCours) REFERENCES Cours (idCours)
    );

 */

public class Session {
    private int idSession;
    private String dateSession;
    private String dureeSession;
    private String contenuSession;
    private int idCours;

    public Session(int idSession, String dateSession, String dureeSession, String contenuSession, int idCours){
        this.idSession = idSession;
        this.dateSession = dateSession;
        this.dureeSession = dureeSession;
        this.contenuSession = contenuSession;
        this.idCours = idCours;
    }

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public String getDateSession() {
        return dateSession;
    }

    public void setDateSession(String dateSession) {
        this.dateSession = dateSession;
    }

    public String getDureeSession() {
        return dureeSession;
    }

    public void setDureeSession(String dureeSession) {
        this.dureeSession = dureeSession;
    }

    public String getContenuSession() {
        return contenuSession;
    }

    public void setContenuSession(String contenuSession) {
        this.contenuSession = contenuSession;
    }

    public int getIdCours() {
        return idCours;
    }

    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }
}
