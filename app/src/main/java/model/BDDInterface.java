package model;

import java.util.ArrayList;

import entities.Session;
import entities.Etudiant;
import entities.Professeur;

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










}
