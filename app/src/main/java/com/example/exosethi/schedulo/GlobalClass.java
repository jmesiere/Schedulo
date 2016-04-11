package com.example.exosethi.schedulo;

import android.app.Activity;
import android.app.Application;

import model.BDDList;

/**
 * Created by Exosethi on 11/04/2016.
 */
public class GlobalClass extends Activity {

    private int idStudient=0;
    private int idTeacher=0;
    private BDDList bdd =new BDDList();


    public int getIdStudient() {
        return idStudient;
    }

    public void setIdStudient(int idStudient) {
        this.idStudient = idStudient;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public BDDList getBdd() {
        return bdd;
    }

    public void setBdd(BDDList bdd) {
        this.bdd = bdd;
    }
}
