package com.example.exosethi.schedulo;

import entities.Studient;
import model.BDDList;

/**
 * Created by Exosethi on 14/03/2016.
 */
public class Test {
    public static void main(String[] args){
        BDDList bddList=new BDDList();
        Studient st1=new Studient("jeremy","mesiere","jeremy.mesiere@live.fr","jeremymesiere","123",1);


        bddList.addStudient(st1);

        System.out.println(bddList.connexionSucces("",st1.getPassword()));
    }
}
