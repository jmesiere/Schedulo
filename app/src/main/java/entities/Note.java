package entities;

public class Note {
    private double mark;
    private double coef;
    private int numMatiere;

    public Note(double mark,double coef,int numMatiere){
        this.mark=mark;
        this.coef=coef;
        this.numMatiere=numMatiere;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public double getCoef() {
        return coef;
    }

    public void setCoef(double coef) {
        this.coef = coef;
    }

    public int getNumMatiere() {
        return numMatiere;
    }

    public void setNumMatiere(int numMatiere) {
        this.numMatiere = numMatiere;
    }
}
