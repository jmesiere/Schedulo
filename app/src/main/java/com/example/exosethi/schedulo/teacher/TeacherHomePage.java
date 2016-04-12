package com.example.exosethi.schedulo.teacher;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.exosethi.schedulo.common.ConsultPlanning;
import com.example.exosethi.schedulo.R;

import entities.Professeur;
import model.BDDList;

public class TeacherHomePage extends AppCompatActivity implements View.OnTouchListener,View.OnClickListener {

    final String EXTRA_ID ="user_id";
    //variable à changer selon l'utilisateur/jour
    private String nextPeriod="Algorithme de 9h30 à 12h30";
    private static BDDList bddlist=new BDDList();
    private Button lateness=null;
    private Button absence=null;
    private Button planning=null;
    Professeur professeur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.teacherhomepage);

        Intent intent = getIntent();

        if (intent != null) {
            professeur =bddlist.getTeacher(intent.getIntExtra(EXTRA_ID,1));
        }

        TextView name=(TextView)(findViewById(R.id.name));
        TextView firstName=(TextView)(findViewById(R.id.firstName));
        TextView nextP=(TextView)(findViewById(R.id.nextPeriod));
        name.setText(professeur.getNomUtilisateur());
        firstName.setText((professeur.getPrenomUtilisateur()));
        nextP.setText(nextPeriod);


        lateness=(Button) findViewById(R.id.notifierRetard);
        absence=(Button)findViewById(R.id.notifierAbsence);
        planning=(Button) findViewById(R.id.consulterEmploiDuTemps);


        //si un click sur un bouton alors déclenche on click

        lateness.setOnClickListener(this);
        absence.setOnClickListener(this);
        planning.setOnClickListener(this);

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
                Intent intent = new Intent(TeacherHomePage.this,ConsultPlanning.class);
                startActivity(intent);
                break;
            }
            case R.id.notifierRetard:{
                Toast.makeText(getBaseContext(), "Ajout d'une notification", Toast.LENGTH_SHORT).show();
                createNotification();
                break;
            }

            }

        }


    private final void createNotification(){

        final NotificationManager mNotification = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        final Intent launchNotifiactionIntent = new Intent(this, TeacherHomePage.class);
        final PendingIntent pendingIntent = PendingIntent.getActivity(this,2
                , launchNotifiactionIntent,
                PendingIntent.FLAG_ONE_SHOT);

        Notification.Builder builder = new Notification.Builder(this)
                .setWhen(System.currentTimeMillis())
                .setTicker("AAAA")
                .setSmallIcon(R.drawable.ic_launcher)
                .setContentTitle(getResources().getString(R.string.notification_title))
                .setContentText(getResources().getString(R.string.notification_desc))
                .setContentIntent(pendingIntent);

        mNotification.notify(1, builder.build());
    }




}
