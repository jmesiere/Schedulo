package entities;

/**
 * Created by Jeremy Mesiere on 14/03/2016.
 */
public class Teacher extends User {
    private int numTeacher;

    public Teacher(){
        super();
        this.setNumTeacher(-1);
    }

    public Teacher(String firstName,String name, String email,String username, String password,int numTeacher){
        super(firstName,name,email,username,password);
        this.setNumTeacher(numTeacher);
    }


    public int getNumTeacher() {
        return this.numTeacher;
    }

    public void setNumTeacher(int numTeacher) {
        this.numTeacher = numTeacher;
    }
}
