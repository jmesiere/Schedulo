package entities;

import java.util.ArrayList;

public class Etudiant extends Utilisateur {

    public Etudiant(int idUtilisateur, String mailUtilisateur, String nomUtilisateur, String prenomUtilisateur, String mdpUtilisateur, String dateInscriptionUtilisateur, int typeUtilisateur,int idClasse){
        super(idUtilisateur, mailUtilisateur, nomUtilisateur, prenomUtilisateur, mdpUtilisateur, dateInscriptionUtilisateur,  typeUtilisateur, idClasse);
    }
}
