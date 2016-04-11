package model;

import java.util.ArrayList;

import entities.Studient;
import entities.Teacher;

/**
 * Created by Exosethi on 14/03/2016.
 */
public class BDDList implements BDDInterface {

    Studient st1=new Studient("jeremy","mesiere","jeremy.mesiere@live.fr","jeremymesiere","123",1);

    public ArrayList<Studient> listStudient;

    public BDDList(){
        this.setListStudient(new ArrayList<Studient>());
        listStudient.add(st1);
    }

    @Override
    public int connexionSucces(String username, String password) {
        int numStu=0;
        for(int i = 0;i< getListStudient().size();i++){
            if(getListStudient().get(i).getUsername().equals(username) && getListStudient().get(i).getPassword().equals(password))
                numStu=getListStudient().get(i).getNumStudient();
        }
        return numStu;
    }

    @Override
    public Studient getStudient(int numStudient) {
        for(int i = 0;i< getListStudient().size();i++){
            if(getListStudient().get(i).getNumStudient()==numStudient)
                return getListStudient().get(i);
        }
        return null;
    }

    @Override
    public ArrayList<Studient> getAllStudientFromTraining(int numClass) {
        return null;
    }

    @Override
    public Teacher getTeacher(int numTeacher) {
        return null;
    }

    @Override
    public ArrayList<Teacher> getAllTeacherFromMatiere(int numMatiere) {
        return null;
    }

    @Override
    public boolean addStudient(Studient studient) {
        return this.getListStudient().add(studient);
    }


    public ArrayList<Studient> getListStudient() {
        return listStudient;
    }

    public void setListStudient(ArrayList<Studient> listStudient) {
        this.listStudient = listStudient;
    }
}
