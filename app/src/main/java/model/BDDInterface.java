package model;

import java.util.ArrayList;

import entities.Classe;
import entities.Cours;
import entities.Evaluation;
import entities.Resultat;
import entities.Session;
import entities.Etudiant;
import entities.Professeur;
import entities.Utilisateur;

public interface BDDInterface {
    //vérifie si l'utilisateur existe
    public int connexionSuccess(String mailUtilisateur,String mdpUtilisateur);

    //retourne un etudiant selon son numero
    public Etudiant getStudent(int namStudent);

    //retourne tous les étudiants d'une classe
    public ArrayList<Etudiant> getAllStudentFromClass(int numClass);

    //Retourne un professeur selon son numero
    public Professeur getTeacher(int numTeacher);

    //Retourne tous les professeurs selon une matiere
    public ArrayList<Professeur> getAllTeacherFromMatiere(int numMatiere);

    public boolean addStudent(Etudiant etudiant);

    public ArrayList<Session> allCourseFromADay(String str);

    public ArrayList<Utilisateur> getListUtilisateur();

    public void setListUtilisateur(ArrayList<Utilisateur> listUtilisateur);

    public ArrayList<Classe> getListClasse();

    public void setListClasse(ArrayList<Classe> listClasse);

    public ArrayList<Cours> getListCours();

    public void setListCours(ArrayList<Cours> listCours);

    public ArrayList<Session> getListSession();

    public void setListSession(ArrayList<Session> listSession);

    public ArrayList<Evaluation> getListEvaluation();

    public void setListEvaluation(ArrayList<Evaluation> listEvaluation);

    public ArrayList<Resultat> getListResultat();

    public void setListResultat(ArrayList<Resultat> listResultat);
    /* Fin ajouts Vincent */








}
