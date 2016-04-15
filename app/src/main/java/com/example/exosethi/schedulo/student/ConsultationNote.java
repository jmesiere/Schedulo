package com.example.exosethi.schedulo.student;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.exosethi.schedulo.R;
import com.example.exosethi.schedulo.student.StudentHomePage;

import java.text.DecimalFormat;
import java.util.ArrayList;

import entities.Cours;
import entities.Etudiant;
import entities.Evaluation;
import entities.Resultat;
import model.BDDList;

public class ConsultationNote extends AppCompatActivity implements View.OnTouchListener,View.OnClickListener {

    private Button boutonAccueil =null;
    private BDDList bddList = new BDDList();
    private LinearLayout linLay; // = new LinearLayout(this);// (LinearLayout) findViewById(R.id.linLay);
    private String sDisplayCours,sDisplayNote, sDisplayMoyenneCours, sDisplayMoyenneGenerale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consultation_note);
        linLay = (LinearLayout) findViewById(R.id.linLay);
        boutonAccueil = (Button) findViewById(R.id.accueil);
        boutonAccueil.setOnClickListener(this);

        affichageNotes();
    }

    private void affichageNotes() {

        Etudiant vincent = bddList.getStudent(2);
        ArrayList<Cours> listeCours = bddList.getListCoursFromEtudiant(vincent.getIdUtilisateur(), vincent.getIdClasse());
        double totalCoefficientCours = 0.0;
        double totalMoyennes = 0.0;
        int countTextView = 0;
        for (int i = 0; i < listeCours.size(); i++) {
            countTextView++;
            ArrayList<Evaluation> listeEvaluations = bddList.getListEvaluationFromCours(vincent.getIdUtilisateur(), listeCours.get(i).getIdCours());
            double totalCoefficient = 0.0;
            double moyenneParNote = 0.0;

            TextView tDisplayCours = new TextView(this);
            tDisplayCours.setId(countTextView);
            tDisplayCours.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.FILL_PARENT, AbsListView.LayoutParams.WRAP_CONTENT));
            tDisplayCours.setPadding(15, 10, 0, 3);
            sDisplayCours = listeCours.get(i).getNomCours() + " : coeff. " + listeCours.get(i).getCoefficientCours();
            tDisplayCours.setText(sDisplayCours);
            tDisplayCours.setTextColor(getResources().getColor(R.color.black));
            tDisplayCours.setTypeface(null, Typeface.BOLD);
            linLay.addView(tDisplayCours);

            for (int j = 0; j < listeEvaluations.size(); j++) {
                ArrayList<Resultat> listResultats = bddList.getListResultatFromEvaluation(vincent.getIdUtilisateur(), listeEvaluations.get(j).getIdEvaluation());
                if (!listResultats.isEmpty()) {
                    totalCoefficient += listeEvaluations.get(j).getCoefficient();
                    moyenneParNote += listResultats.get(0).getNote() * listeEvaluations.get(j).getCoefficient();

                    TextView tDisplayNote = new TextView(this);
                    tDisplayNote.setId(countTextView);
                    tDisplayNote.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.FILL_PARENT, AbsListView.LayoutParams.WRAP_CONTENT));
                    tDisplayNote.setPadding(10, 10, 0, 3);
                    sDisplayNote = "    " + listeEvaluations.get(j).getDateEvaluation() +
                            "   : " + listResultats.get(0).getNote() + "   Coeff. " + listeEvaluations.get(j).getCoefficient();
                    tDisplayNote.setText(sDisplayNote);
                    linLay.addView(tDisplayNote);

                }
            }
            if (totalCoefficient != 0) {
                moyenneParNote = moyenneParNote / totalCoefficient;
                totalCoefficientCours += listeCours.get(i).getCoefficientCours();
                totalMoyennes += moyenneParNote * listeCours.get(i).getCoefficientCours();

                sDisplayMoyenneCours = "    --  --  --  --  --  --  --  --  --  --  --  -- \n"
                        + "    Moyenne : " + moyenneParNote + "    Total coefficients : " + totalCoefficient;
            } else {
                sDisplayMoyenneCours = "    Vous n'avez pas encore de notes.";
            }

            TextView tDisplayMoyenneCours = new TextView(this);
            tDisplayMoyenneCours.setId(countTextView);
            tDisplayMoyenneCours.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.FILL_PARENT, AbsListView.LayoutParams.WRAP_CONTENT));
            tDisplayMoyenneCours.setPadding(10, 10, 5, 3);
            tDisplayMoyenneCours.setText(sDisplayMoyenneCours);
            linLay.addView(tDisplayMoyenneCours);
        }
        if (totalCoefficientCours != 0) {
            totalMoyennes = totalMoyennes / totalCoefficientCours;

            sDisplayMoyenneGenerale = "\n"
                    + "---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- \n"
                    + "Moyenne générale : " + new DecimalFormat("##.##").format(totalMoyennes) + "  Total coefficients : " + totalCoefficientCours;

            TextView tDisplayMoyenneGenerale = new TextView(this);
            tDisplayMoyenneGenerale.setId(countTextView);
            tDisplayMoyenneGenerale.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.FILL_PARENT, AbsListView.LayoutParams.WRAP_CONTENT));
            tDisplayMoyenneGenerale.setPadding(10,10, 5, 3);
            tDisplayMoyenneGenerale.setText(sDisplayMoyenneGenerale);
            linLay.addView(tDisplayMoyenneGenerale);
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            //selon les boutons réalise l'action associée
            case R.id.accueil:{
                System.out.println("Clic bouton retour accueil");

                Intent intent = new Intent(ConsultationNote.this,StudentHomePage.class);
                startActivity(intent);

                break;
            }

        }
    }

}
