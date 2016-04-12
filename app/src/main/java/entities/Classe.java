package entities;

/*
CREATE TABLE Classe (
idClasse INTEGER AUTO_INCREMENT NOT NULL,
nomClasse VARCHAR(255),
promotionClasse INTEGER,
PRIMARY KEY (idClasse)
);

 */
public class Classe {

    private int idClasse ;
    private String nomClasse;
    private int promotionClasse;

    public Classe(int idClasse, String nomClasse, int promotionClasse){
        this.setIdClasse(idClasse);
        this.setNomClasse(nomClasse);
        this.setPromotionClasse(promotionClasse);
    }

    public int getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }

    public int getPromotionClasse() {
        return promotionClasse;
    }

    public void setPromotionClasse(int promotionClasse) {
        this.promotionClasse = promotionClasse;
    }
}
