package com.example.exosethi.schedulo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import entities.Studient;
import model.BDDList;

public class Acceuil extends AppCompatActivity implements View.OnTouchListener,View.OnClickListener {

    //final GlobalClass globalVariable =(GlobalClass)getApplicationContext();
    final String EXTRA_ID ="user_id";
    //variable à changer selon l'utilisateur/jour
    private String nextPeriod="Algorithme de 9h30 à 12h30";
    private static BDDList bddlist=new BDDList();
    private Button course=null;
    private Button marks=null;
    private Button planning=null;
    private Button teachers=null;
    Studient st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.acceuil);

        Intent intent = getIntent();

        if (intent != null) {
            st=bddlist.getStudient(intent.getIntExtra(EXTRA_ID,1));
        }

        TextView name=(TextView)(findViewById(R.id.name));
        TextView firstName=(TextView)(findViewById(R.id.firstName));
        TextView nextP=(TextView)(findViewById(R.id.nextPeriod));
        name.setText(st.getName());
        firstName.setText((st.getFirstName()));
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
                Intent intent = new Intent(Acceuil.this,ConsultPlanning.class);
                startActivity(intent);
                break;
            }
            case R.id.consulterProfesseur:{
                Intent intent = new Intent(Acceuil.this,ConsultTeachers.class);
                startActivity(intent);
                break;

            }
            case R.id.consulterMatiere:{
                Intent intent = new Intent(Acceuil.this,ConsultCourse.class);
                startActivity(intent);
                break;
            }
            case R.id.consulterNotes:{
                Intent intent = new Intent(Acceuil.this,ConsultMarks.class);
                startActivity(intent);
                break;
            }
        }

    }




}
