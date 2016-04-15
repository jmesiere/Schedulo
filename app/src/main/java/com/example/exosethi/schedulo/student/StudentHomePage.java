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

import entities.Etudiant;
import model.BDDList;

public class StudentHomePage extends AppCompatActivity implements View.OnTouchListener,View.OnClickListener {

    final String EXTRA_ID ="user_id";
    //variable à changer selon l'utilisateur/jour
    private String nextPeriod="Algorithme de 9h30 à 12h30";
    private static BDDList bddlist=new BDDList();
    private Button course=null;
    private Button marks=null;
    private Button planning=null;
    private Button teachers=null;
    Etudiant st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.studenthomepage);

        Intent intent = getIntent();

        if (intent != null) {
            st=bddlist.getStudent(intent.getIntExtra(EXTRA_ID, 1));
        }

        TextView name=(TextView)(findViewById(R.id.name));
        TextView firstName=(TextView)(findViewById(R.id.firstName));
        TextView nextP=(TextView)(findViewById(R.id.nextPeriod));
        name.setText(st.getNomUtilisateur());
        firstName.setText((st.getPrenomUtilisateur()));
        nextP.setText(nextPeriod);

        course=(Button) findViewById(R.id.consulterMatiere);
        marks=(Button) findViewById(R.id.consulterNotes);
        planning=(Button) findViewById(R.id.consulterEmploiDuTemps);
        teachers=(Button) findViewById(R.id.consulterProfesseur);

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
