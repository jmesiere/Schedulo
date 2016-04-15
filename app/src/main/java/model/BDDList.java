package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import entities.Classe;
import entities.Cours;
import entities.Evaluation;
import entities.Resultat;
import entities.Session;
import entities.Etudiant;
import entities.Professeur;
import entities.Utilisateur;

public class BDDList implements BDDInterface {

    //data
    Etudiant st1 = new Etudiant(1, "jeremy.mesiere@live.fr", "mesiere", "jeremy", "123", "2016-04-01 16:33:10", 1, 2);
    Etudiant st2 = new Etudiant(2, "vincent.guyonvarch@gmail.com", "guyonvarch", "vincent", "123", "2016-04-02 09:26:02", 1, 2);
    Etudiant st3 = new Etudiant(3, "franck.vieira@gmail.com", "franck", "vieira", "123", "2016-04-01 16:33:10", 1, 5);

    Professeur pr1=new Professeur(4, "didou@gmail.com", "daniel", "diaz", "123", "2016-04-01 16:33:10", 2);

    public ArrayList<Utilisateur> listUtilisateurs;

    Classe cl1 = new Classe(1, "L3 MIAGE Apprentissage", 2016);
    Classe cl2 = new Classe(2, "M1 MIAGE Apprentissage", 2016);
    Classe cl3 = new Classe(3, "M2 MIAGE Apprentissage", 2016);

    Classe cl4 = new Classe(4, "L3 MIAGE Classique", 2016);
    Classe cl5 = new Classe(5, "M1 MIAGE Classique", 2016);
    Classe cl6 = new Classe(6, "M2 MIAGE Classique", 2016);
    private ArrayList<Classe> listClasse;

    Cours co1 = new Cours(1, "Réseaux", 9, 1);
    Cours co2 = new Cours(2, "Algorithmique", 3, 1);
    Cours co3 = new Cours(3, "Compilation", 6, 1);
    Cours co4 = new Cours(4, "Droit", 6, 1);
    Cours co5 = new Cours(5, "Comptabilité", 3, 1);
    Cours co7 = new Cours(7, "Production", 3, 1);
    Cours co8 = new Cours(8, "Anglais", 2, 1);
    Cours co9 = new Cours(9, "Communication", 2, 1);

    Cours co10 = new Cours(10, "Réseaux", 3, 2);
    Cours co20 = new Cours(20, "Algorithmique", 6, 2);
    Cours co30 = new Cours(30, "AOO", 6, 2);
    Cours co40 = new Cours(40, "Droit", 3, 2);
    Cours co50 = new Cours(50, "Comptabilité", 3, 2);
    Cours co60 = new Cours(60, "Statistiques", 3, 2);
    Cours co70 = new Cours(70, "POO", 6, 2);
    Cours co80 = new Cours(80, "Anglais", 2, 2);
    Cours co90 = new Cours(90, "Communication", 2, 2);
    private ArrayList<Cours> listCours;

    Session ss1 = new Session(1, "2016-11-04 09:30:00", "0000-00-00 03:00:00", "Session 1 Droit", 40);
    Session ss2 = new Session(2, "2016-11-04 14:00:00", "0000-00-00 03:00:00", "Session 2 Droit", 40);

    Session ss3 = new Session(3, "2016-12-04 09:30:00", "0000-00-00 03:00:00", "Session 1 Production", 70);
    Session ss4 = new Session(4, "2016-12-04 14:00:00", "0000-00-00 03:00:00", "Session 2 Production", 70);

    Session ss5 = new Session(5, "2016-13-04 09:30:00", "0000-00-00 03:00:00", "Session 1 Comptabilité", 50);
    Session ss6 = new Session(6, "2016-13-04 14:00:00", "0000-00-00 03:00:00", "Session 2 Comptabilité", 50);

    Session ss7 = new Session(7, "2016-14-04 09:30:00", "0000-00-00 03:00:00", "Session 1 Compilation", 30);
    Session ss8 = new Session(8, "2016-14-04 14:00:00", "0000-00-00 03:00:00", "Session 2 Compilation", 30);

    Session ss9 = new Session(9, "2016-15-04 09:30:00", "0000-00-00 03:00:00", "Session 1 Anglais", 80);
    Session ss10 = new Session(10, "2016-15-04 14:00:00", "0000-00-00 03:00:00", "Session 2 Anglais", 80);
    private ArrayList<Session> listSession;

    Evaluation ev1 = new Evaluation(1, "2016-11-04 09:30:00", "0000-00-00 03:00:00", 40,1);
    Evaluation ev11 = new Evaluation(2, "2016-11-04 10:30:00", "0000-00-00 03:00:00", 40, 1);
    Evaluation ev111 = new Evaluation(3, "2016-11-04 11:30:00", "0000-00-00 03:00:00", 40, 1);
    Evaluation ev1111 = new Evaluation(4, "2016-11-04 14:30:00", "0000-00-00 03:00:00", 40, 1);
    Evaluation ev2 = new Evaluation(5, "2016-14-04 14:00:00", "0000-00-00 03:00:00", 30, 1);
    Evaluation ev3 = new Evaluation(6, "2016-15-04 14:00:00", "0000-00-00 03:00:00", 80, 1);
    private ArrayList<Evaluation> listEvaluation;

    Resultat re1 = new Resultat(10.0, 1, 2);
    Resultat re11 = new Resultat(15.0, 2, 2);
    Resultat re12 = new Resultat(14.0, 3, 2);
    Resultat re13 = new Resultat(13.0, 4, 2);
    Resultat re2 = new Resultat(12.0, 5, 2);

    Resultat re3 = new Resultat(8.5, 1, 1);
    Resultat re4 = new Resultat(17.0, 1, 1);

    Resultat re5 = new Resultat(15, 1, 3);

    private ArrayList<Resultat> listResultat;


    public BDDList(){
        this.listUtilisateurs = new ArrayList<Utilisateur>();
        this.listClasse = new ArrayList<Classe>();
        this.listCours = new ArrayList<Cours>();
        this.listEvaluation = new ArrayList<Evaluation>();
        this.listResultat = new ArrayList<Resultat>();
        this.listSession = new ArrayList<Session>();

        listUtilisateurs.add(st1);
        listUtilisateurs.add(st2);
        listUtilisateurs.add(st3);
        listUtilisateurs.add(pr1);

        listClasse.add(cl1);
        listClasse.add(cl2);
        listClasse.add(cl3);
        listClasse.add(cl4);
        listClasse.add(cl5);
        listClasse.add(cl6);

        listCours.add(co1);
        listCours.add(co2);
        listCours.add(co3);
        listCours.add(co4);
        listCours.add(co5);
        listCours.add(co7);
        listCours.add(co8);
        listCours.add(co9);
        listCours.add(co10);
        listCours.add(co20);
        listCours.add(co30);
        listCours.add(co40);
        listCours.add(co50);
        listCours.add(co70);
        listCours.add(co80);
        listCours.add(co90);

        listSession.add(ss1);
        listSession.add(ss2);
        listSession.add(ss3);
        listSession.add(ss4);
        listSession.add(ss5);
        listSession.add(ss6);
        listSession.add(ss7);
        listSession.add(ss8);
        listSession.add(ss9);
        listSession.add(ss10);

        listEvaluation.add(ev1);
        listEvaluation.add(ev11);
        listEvaluation.add(ev111);
        listEvaluation.add(ev1111);
        listEvaluation.add(ev2);
        listEvaluation.add(ev3);

        listResultat.add(re1);
        listResultat.add(re11);
        listResultat.add(re12);
        listResultat.add(re13);
        listResultat.add(re2);
        listResultat.add(re3);
        listResultat.add(re4);
        listResultat.add(re5);
    }

    @Override
    public int connexionSuccess(String mailUtilisateur,String mdpUtilisateur) {
        int numUtil=0;
        for(int i = 0;i< getListUtilisateurs().size();i++){
            if(getListUtilisateurs().get(i).getMailUtilisateur().equals(mailUtilisateur) && getListUtilisateurs().get(i).getMdpUtilisateur().equals(mdpUtilisateur))
                numUtil= getListUtilisateurs().get(i).getIdUtilisateur();
        }
        return numUtil;
    }

    public Utilisateur getUtilisateur(int numUtil){
        for(int i = 0;i< getListUtilisateurs().size();i++){
            if(getListUtilisateurs().get(i).getIdUtilisateur()== numUtil)
                return (Utilisateur)getListUtilisateurs().get(i);
        }
        return null;
    }

    @Override
    public Etudiant getStudent(int numStudent) {
        for(int i = 0;i< getListUtilisateurs().size();i++){
            if(getListUtilisateurs().get(i).getIdUtilisateur()== numStudent)
                return (Etudiant)getListUtilisateurs().get(i);
        }
        return null;
    }

    @Override
    public ArrayList<Etudiant> getAllStudentFromClass(int numClass) {
        return null;
    }

    @Override
    public Professeur getTeacher(int numTeacher) {
        for(int i = 0;i< getListUtilisateurs().size();i++){
            if(getListUtilisateurs().get(i).getIdUtilisateur()==numTeacher)
                return (Professeur)getListUtilisateurs().get(i);
        }
        return null;
    }


    @Override
    public ArrayList<Session> allCourseFromADay(String str) {
        ArrayList<Session> tmp = new ArrayList<Session>();
        Date date = convertDate(str);
        for(int i = 0;i< getListSession().size();i++){
            System.out.println(getListSession().get(i).getDate());
            System.out.println(str);
            if(getListSession().get(i).getDate().equals(str)) {
                System.out.println("ajouter");
                tmp.add(getListSession().get(i));
            }
        }
        return tmp;
    }

    @Override
    public ArrayList<Utilisateur> getListUtilisateur() {
        return null;
    }

    @Override
    public void setListUtilisateur(ArrayList<Utilisateur> listUtilisateur) {

    }

    public Date convertDate(String d) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return simpleDateFormat.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public ArrayList<Professeur> getAllTeacherFromMatiere(int numMatiere) {
        return null;
    }

    @Override
    public boolean addStudent(Etudiant etudiant) {
        return this.getListUtilisateurs().add(etudiant);
    }






    @Override
    public ArrayList<Classe> getListClasse() {
        return listClasse;
    }

    @Override
    public void setListClasse(ArrayList<Classe> listClasse) {
        listClasse = listClasse;
    }

    @Override
    public ArrayList<Cours> getListCours() {
        return listCours;
    }

    @Override
    public void setListCours(ArrayList<Cours> listCours) {
        listCours = listCours;
    }

    @Override
    public ArrayList<Session> getListSession() {
        return listSession;
    }

    @Override
    public void setListSession(ArrayList<Session> listSession) {
        listSession = listSession;
    }

    @Override
    public ArrayList<Evaluation> getListEvaluation() {
        return listEvaluation;
    }

    @Override
    public void setListEvaluation(ArrayList<Evaluation> listEvaluation) {
        listEvaluation = listEvaluation;
    }

    @Override
    public ArrayList<Resultat> getListResultat() {
        return listResultat;
    }

    @Override
    public void setListResultat(ArrayList<Resultat> listResultat) {
        listResultat = listResultat;
    }

    public ArrayList<Cours> getListCoursFromEtudiant(int idUtilisateur, int idClasse) {

        ArrayList<Cours> listCoursEtudiants = new ArrayList<Cours>();

        for (int i = 0; i < getListCours().size(); i++) {
            if (getListCours().get(i).getIdClasse() == idClasse) {
                listCoursEtudiants.add(getListCours().get(i));
            }
        }

        return listCoursEtudiants;
    }

    public ArrayList<Evaluation> getListEvaluationFromCours(int idUtilisateur, int idCours) {
        ArrayList<Evaluation> listEvaluationEtudiantCours = new ArrayList<Evaluation>();
        for (int i = 0; i < getListEvaluation().size(); i++) {
            if (getListEvaluation().get(i).getIdCours() == idCours) {
                listEvaluationEtudiantCours.add(getListEvaluation().get(i));
            }
        }
        return listEvaluationEtudiantCours;
    }

    public ArrayList<Resultat> getListResultatFromEvaluation(int idUtilisateur, int idEvaluation) {
        ArrayList<Resultat> listResultatsEtudiantEvaluation = new ArrayList<Resultat>();

        for (int i = 0; i < getListResultat().size(); i++) {
            if (getListResultat().get(i).getIdEvaluation() == idEvaluation && getListResultat().get(i).getIdUtilisateur() == idUtilisateur) {
                listResultatsEtudiantEvaluation.add(getListResultat().get(i));
            }
        }
        return listResultatsEtudiantEvaluation;
    }

    public ArrayList<Utilisateur> getListUtilisateurs() {
        return listUtilisateurs;
    }

    public void setListUtilisateurs(ArrayList<Utilisateur> listUtilisateurs) {
        this.listUtilisateurs = listUtilisateurs;
    }




}
