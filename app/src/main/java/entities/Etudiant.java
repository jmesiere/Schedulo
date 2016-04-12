package entities;

public class Etudiant extends Utilisateur {

    public Etudiant(int idUtilisateur, String mailUtilisateur, String nomUtilisateur, String prenomUtilisateur, String mdpUtilisateur, String dateInscriptionUtilisateur, int typeUtilisateur){
        super(idUtilisateur, mailUtilisateur, nomUtilisateur, prenomUtilisateur, mdpUtilisateur, dateInscriptionUtilisateur,  typeUtilisateur);
    }
}
