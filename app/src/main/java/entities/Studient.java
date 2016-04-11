package entities;

import java.util.ArrayList;

/**
 * Created by Jeremy Mesiere on 14/03/2016.
 */
public class Studient extends User {
    private int numStudient;
    private ArrayList<Note> listNotes;

    public Studient(){
        super();
        this.setNumStudient(-1);
        this.setListNotes(new ArrayList<Note>());
    }

    public Studient(String firstName,String name, String email,String username, String password,int numStudient){
        super(firstName,name,email,username,password);
        this.setNumStudient(numStudient);
        this.listNotes=new ArrayList<Note>();
    }

    public Studient(Studient stu){
        super(stu);
        this.numStudient=stu.getNumStudient();
        this.listNotes=stu.getListNotes();
    }


    public int getNumStudient() {
        return numStudient;
    }

    public void setNumStudient(int numStudient) {
        this.numStudient = numStudient;
    }

    public ArrayList<Note> getListNotes() {
        return listNotes;
    }

    public void setListNotes(ArrayList<Note> listNotes) {
        this.listNotes = listNotes;
    }
}
