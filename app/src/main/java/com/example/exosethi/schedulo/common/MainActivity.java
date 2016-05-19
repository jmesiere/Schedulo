package com.example.exosethi.schedulo.common;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.exosethi.schedulo.R;
import com.example.exosethi.schedulo.student.StudentHomePage;
import com.example.exosethi.schedulo.teacher.TeacherHomePage;

import custom_font.MyTextView;
import model.BDDList;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener,View.OnClickListener {
    private MyTextView connect=null;
    private MyTextView register=null;
    private static BDDList bddlist=new BDDList();
    //
    final String EXTRA_ID ="user_id";
    final String EXTRA_PASSWORD = "password_input";
    EditText identifiant_inputText;
    EditText password_inputText;

    //GlobalClass globalVariable=(GlobalClass)getApplicationContext();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //initialise la vue
        setContentView(R.layout.content_main);

        connect=(MyTextView) findViewById(R.id.connect);
        register=(MyTextView) findViewById(R.id.create);

        //si un click sur un bouton alors déclenche on click

        connect.setOnClickListener(this);
        register.setOnClickListener(this);

        identifiant_inputText=(EditText)findViewById(R.id.identifiant_input);
        password_inputText=(EditText)findViewById(R.id.password_input);


    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    @Override
    public void onClick(View v) {
    switch(v.getId()){
        //selon les boutons réalise l'action associée
        case R.id.connect:{
            //test si un des champs est vide
            if (identifiant_inputText.getText().toString().equals("") || password_inputText.getText().toString().equals("")){
                Toast.makeText(MainActivity.this,R.string.email_or_password_empty,
                        Toast.LENGTH_SHORT).show();
                //si oui pop-up avec message venant de R.string
                return;
            }
            else {
                int numUtil = bddlist.connexionSuccess(identifiant_inputText.getText().toString(), password_inputText.getText().toString());
                if (numUtil!=0) {
                    if(bddlist.getUtilisateur(numUtil).getTypeUtilisateur()==1){
                        Intent intent = new Intent(MainActivity.this, StudentHomePage.class);
                        intent.putExtra(EXTRA_ID,numUtil);
                        startActivity(intent);
                    }else{
                        Intent intent = new Intent(MainActivity.this, TeacherHomePage.class);
                        intent.putExtra(EXTRA_ID,numUtil);
                        startActivity(intent);
                    }

                    }

                else {
                    Toast.makeText(MainActivity.this, R.string.user_not_found,
                            Toast.LENGTH_SHORT).show();
                }
            }

            break;
        }

        case R.id.create: {
            Intent intent = new Intent(MainActivity.this, Inscription.class);
            startActivity(intent);
            break;
        }
    }
    }



}
