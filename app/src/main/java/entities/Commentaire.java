package entities;

/*
 idCommentaire INTEGER AUTO_INCREMENT NOT NULL,
 texteCommentaire TEXT,
 idCours INTEGER,
 auteurCommentaire VARCHAR(255) NOT NULL,
 */
public class Commentaire {
    private int idCommentaire;
    private String texteCommentaire;
    private int idCours;
    private String auteurCommentaire;

    public Commentaire(int idCommentaire, String texteCommentaire, int idCours, String auteurCommentaire){
        this.idCommentaire = idCommentaire;
        this.texteCommentaire = texteCommentaire;
        this.idCours = idCours;
        this.auteurCommentaire = auteurCommentaire;
    }

    public int getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(int idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public String getTexteCommentaire() {
        return texteCommentaire;
    }

    public void setTexteCommentaire(String texteCommentaire) {
        this.texteCommentaire = texteCommentaire;
    }

    public int getIdCours() {
        return idCours;
    }

    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }

    public String getAuteurCommentaire() {
        return auteurCommentaire;
    }

    public void setAuteurCommentaire(String auteurCommentaire) {
        this.auteurCommentaire = auteurCommentaire;
    }
}
