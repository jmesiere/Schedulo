package com.example.exosethi.schedulo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import entities.Etudiant;
import entities.Session;
import model.BDDList;

/**
 * Created by Exosethi on 14/03/2016.
 */
public class Test {
    public static void main(String[] args){
        BDDList bddList=new BDDList();
        //Etudiant st1=new Etudiant("jeremy","mesiere","jeremy.mesiere@live.fr","jeremymesiere","123",1);


        /*bddList.addStudent(st1);

        System.out.println(bddList.connexionSuccessStudent("jeremymesiere", "123"));

        System.out.println(bddList.connexionSuccessStudent("", st1.getPassword()));*/

        System.out.println(bddList.connexionSuccess("didou@gmail.com","123"));

        /*SimpleDateFormat formater = null;

        Date aujourdhui = new Date();

        formater = new SimpleDateFormat("dd/MM/yyyy");
        String str = formater.format(aujourdhui);

        System.out.println(formater.format(aujourdhui));*/

        /*SimpleDateFormat formater = null;
        Date aujourdhui = new Date();
        formater = new SimpleDateFormat("dd/MM/yyyy");
        String str = formater.format(aujourdhui);
        ArrayList<Session> ls = bddList.allCourseFromADay(str);

        for(int i=0;i<ls.size();i++){
            System.out.println(ls.get(i).getHeure()+" : "+ls.get(i).getContenuSession());
        }*/
    }
}
