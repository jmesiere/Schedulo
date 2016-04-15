package entities;

/*
    DROP TABLE IF EXISTS Utilisateur ;
    CREATE TABLE Utilisateur (
        idUtilisateur INTEGER AUTO_INCREMENT NOT NULL,
        mailUtilisateur VARCHAR(255),
        nomUtilisateur VARCHAR(255),
        prenomUtilisateur VARCHAR(255),
        mdpUtilisateur VARCHAR(255),
        dateInscriptionUtilisateur DATE,
        typeUtilisateur SMALLINT,
        PRIMARY KEY (idUtilisateur)
    );
 */
public class Utilisateur {

    private int idUtilisateur;
    private String mailUtilisateur;
    private String nomUtilisateur;
    private String prenomUtilisateur;
    private String mdpUtilisateur;
    private String dateInscriptionUtilisateur;
    private int typeUtilisateur;
    private int idClasse;

    public Utilisateur(int idUtilisateur, String mailUtilisateur, String nomUtilisateur, String prenomUtilisateur, String mdpUtilisateur, String dateInscriptionUtilisateur, int typeUtilisateur, int idClasse){
        this.idUtilisateur = idUtilisateur;
        this.mailUtilisateur = mailUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur;
        this.mdpUtilisateur = mdpUtilisateur;
        this.dateInscriptionUtilisateur = dateInscriptionUtilisateur;
        this.typeUtilisateur = typeUtilisateur;
        this.idClasse = idClasse;
    }

    public Utilisateur(int idUtilisateur, String mailUtilisateur, String nomUtilisateur, String prenomUtilisateur, String mdpUtilisateur, String dateInscriptionUtilisateur, int typeUtilisateur){
        this.idUtilisateur = idUtilisateur;
        this.mailUtilisateur = mailUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur;
        this.mdpUtilisateur = mdpUtilisateur;
        this.dateInscriptionUtilisateur = dateInscriptionUtilisateur;
        this.typeUtilisateur = typeUtilisateur;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getMailUtilisateur() {
        return mailUtilisateur;
    }

    public void setMailUtilisateur(String mailUtilisateur) {
        this.mailUtilisateur = mailUtilisateur;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getPrenomUtilisateur() {
        return prenomUtilisateur;
    }

    public void setPrenomUtilisateur(String prenomUtilisateur) {
        this.prenomUtilisateur = prenomUtilisateur;
    }

    public String getMdpUtilisateur() {
        return mdpUtilisateur;
    }

    public void setMdpUtilisateur(String mdpUtilisateur) {
        this.mdpUtilisateur = mdpUtilisateur;
    }

    public String getDateInscriptionUtilisateur() {
        return dateInscriptionUtilisateur;
    }

    public void setDateInscriptionUtilisateur(String dateInscriptionUtilisateur) {
        this.dateInscriptionUtilisateur = dateInscriptionUtilisateur;
    }

    public int getTypeUtilisateur() {
        return typeUtilisateur;
    }

    public void setTypeUtilisateur(int typeUtilisateur) {
        this.typeUtilisateur = typeUtilisateur;
    }

    public int getIdClasse(){
        return idClasse;
    }

    public void setIdClasse(int idClasse){
        this.idClasse = idClasse;
    }
}
