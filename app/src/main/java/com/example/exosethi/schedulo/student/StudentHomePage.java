package com.example.exosethi.schedulo.student;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.exosethi.schedulo.common.ConsultPlanning;
import com.example.exosethi.schedulo.R;

import custom_font.MyTextView;
import entities.Etudiant;
import model.BDDList;

public class StudentHomePage extends AppCompatActivity implements View.OnTouchListener,View.OnClickListener {

    final String EXTRA_ID ="user_id";
    //variable à changer selon l'utilisateur/jour
    private String nextPeriod="Algorithme de 9h30 à 12h30";
    private String strFinDesCours="18h30";
    private String strProfesseurAbsent="0";
    private String strProfesseurRetard="1";
    private String strExamenPrevu="0";
    private String strDevoirAttendus="2";

    private static BDDList bddlist=new BDDList();
    private MyTextView course=null;
    private MyTextView marks=null;
    private MyTextView planning=null;
    private MyTextView teachers=null;
    Etudiant st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.studenthomepage);

        Intent intent = getIntent();

        if (intent != null) {
            st=bddlist.getStudent(intent.getIntExtra(EXTRA_ID, 1));
        }

        TextView prochainCours=(TextView)(findViewById(R.id.nextPeriod));
        TextView finDesCours=(TextView)(findViewById(R.id.heureFinDesCours));
        TextView profAbsent=(TextView)(findViewById(R.id.nbProfAbsent));
        TextView profRetard=(TextView)(findViewById(R.id.nbProfRetard));
        TextView examenPrevu=(TextView)(findViewById(R.id.nbExamen));
        TextView devoirPrevu=(TextView)(findViewById(R.id.nbDevoir));
        prochainCours.setText(nextPeriod);
        finDesCours.setText(strFinDesCours);
        profAbsent.setText(strProfesseurAbsent);
        profRetard.setText(strProfesseurRetard);
        examenPrevu.setText(strExamenPrevu);
        devoirPrevu.setText(strDevoirAttendus);

        course=(MyTextView) findViewById(R.id.consulterMatiere);
        marks=(MyTextView) findViewById(R.id.consulterNotes);
        planning=(MyTextView) findViewById(R.id.consulterEmploiDuTemps);
        teachers=(MyTextView) findViewById(R.id.consulterProfesseur);

        //si un click sur un bouton alors déclenche on click
        course.setOnClickListener(this);
        marks.setOnClickListener(this);
        planning.setOnClickListener(this);
        teachers.setOnClickListener(this);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //selon les boutons réalise l'action associée
            case R.id.consulterEmploiDuTemps: {
                Intent intent = new Intent(StudentHomePage.this,ConsultPlanning.class);
                startActivity(intent);
                break;
            }
            case R.id.consulterProfesseur:{
                Intent intent = new Intent(StudentHomePage.this,ConsultTeachers.class);
                startActivity(intent);
                break;

            }
            case R.id.consulterMatiere:{
                Intent intent = new Intent(StudentHomePage.this,ConsultCourse.class);
                startActivity(intent);
                break;
            }
            case R.id.consulterNotes:{
                Intent intent = new Intent(StudentHomePage.this,ConsultationNote.class);
                startActivity(intent);
                break;
            }
        }

    }




}
