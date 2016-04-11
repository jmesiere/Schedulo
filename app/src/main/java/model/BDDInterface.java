package model;

import java.net.PasswordAuthentication;
import java.util.ArrayList;

import entities.Studient;
import entities.Teacher;

/**
 * Created by Jeremy Mesiere on 14/03/2016.
 */
public interface BDDInterface {
    //vérifie si l'utilisateur existe
    public int connexionSucces(String username,String password);

    //retourne un etudiant selon son numero
    public Studient getStudient(int numStudient);

    //retourne tous les étudiants d'une classe
    public ArrayList<Studient> getAllStudientFromTraining(int numClass);

    //Retourne un professeur selon son numero
    public Teacher getTeacher(int numTeacher);

    //Retourne tous les professeurs selon une matiere
    public ArrayList<Teacher> getAllTeacherFromMatiere(int numMatiere);

    public boolean addStudient(Studient studient);









}
