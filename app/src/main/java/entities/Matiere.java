package entities;

public class Matiere {
    private String nameMatiere;
    private String description;
    private int numTeacher;

    public Matiere(String nameMatiere,String description,int numTeacher){
        this.setNameMatiere(nameMatiere);
        this.setDescription(description);
        this.setNumTeacher(numTeacher);
    }


    public String getNameMatiere() {
        return nameMatiere;
    }

    public void setNameMatiere(String nameMatiere) {
        this.nameMatiere = nameMatiere;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumTeacher() {
        return numTeacher;
    }

    public void setNumTeacher(int numTeacher) {
        this.numTeacher = numTeacher;
    }
}
