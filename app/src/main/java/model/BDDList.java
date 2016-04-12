package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import entities.Session;
import entities.Etudiant;
import entities.Professeur;
import entities.Utilisateur;

public class BDDList implements BDDInterface {

    //data
    Etudiant st1=new Etudiant(1,"jeremymesiere@live.fr","mesiere","jeremy","123","10/04/2016",1);
    Professeur t1=new Professeur(2,"didou@gmail.com","diaz","daniel","123","10/04/2016",2);
    Session c1=new Session(1,"2016-04-12 09:30:00","3","La grammaire",1);

    private ArrayList<Utilisateur> listUtilisateurs;
    private ArrayList<Session> listCourse;

    public BDDList(){
        this.setListUtilisateurs(new ArrayList<Utilisateur>());
        this.setListCourse(new ArrayList<Session>());
        getListUtilisateurs().add(st1);
        getListUtilisateurs().add(t1);
        getListCourse().add(c1);
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
    public ArrayList<Professeur> getAllTeacherFromMatiere(int numMatiere) {
        return null;
    }

    @Override
    public boolean addStudent(Etudiant etudiant) {
        return this.getListEtudiant().add(etudiant);
    }

    @Override
    public ArrayList<Session> allCourseFromADay(String str) {
        ArrayList<Session> tmp = new ArrayList<Session>();
        /*Date date = convertDate(str);
        for(int i = 0;i< getListCourse().size();i++){
            if(getListCourse().get(i).getDay().equals(date))
                tmp.add(getListCourse().get(i));
        }*/
        return tmp;
    }


    public ArrayList<Etudiant> getListEtudiant() {
        return null;
    }


    public ArrayList<Professeur> getListProfesseur() {
        return null;
    }


    public ArrayList<Session> getListCourse() {
        return listCourse;
    }

    public void setListCourse(ArrayList<Session> listCourse) {
        this.listCourse = listCourse;
    }

    public ArrayList<Utilisateur> getListUtilisateurs() {
        return listUtilisateurs;
    }

    public void setListUtilisateurs(ArrayList<Utilisateur> listUtilisateurs) {
        this.listUtilisateurs = listUtilisateurs;
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
}
