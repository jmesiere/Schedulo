package com.example.exosethi.schedulo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Inscription extends AppCompatActivity implements View.OnTouchListener,View.OnClickListener {
    private Button validate=null;
    private Button cancel=null;

    EditText firstName_inputText;
    EditText name_inputText;
    EditText email_inputText;
    EditText password_inputText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* Permet de faire transiter des informations entre plusieurs activités
        Intent intent = getIntent();
        EditText loginDisplay = (EditText) findViewById(R.id.identifiant);
        EditText passwordDisplay = (EditText) findViewById(R.id.password);

        if (intent != null) {
            loginDisplay.setText(intent.getStringExtra(EXTRA_LOGIN));
            passwordDisplay.setText(intent.getStringExtra(EXTRA_PASSWORD));
        }*/
        //initialise la vue
        setContentView(R.layout.inscription);

        validate=(Button) findViewById(R.id.valider);
        cancel=(Button) findViewById(R.id.annuler);

        //si un click sur un bouton alors déclenche on click
        validate.setOnClickListener(this);
        cancel.setOnClickListener(this);
        firstName_inputText=(EditText)findViewById(R.id.editFirstName);
        name_inputText=(EditText)findViewById(R.id.editName);
        email_inputText=(EditText)findViewById(R.id.editEmail);
        password_inputText=(EditText)findViewById(R.id.inputPassword);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    @Override
    public void onClick(View v) {
    switch(v.getId()){
        //selon les boutons réalise l'action associée
        case R.id.valider:{
            //test si un des champs est vide
            if (firstName_inputText.getText().toString().equals("")
                    || password_inputText.getText().toString().equals("")
                    || name_inputText.getText().toString().equals("")
                    || email_inputText.getText().toString().equals("")){
                Toast.makeText(Inscription.this,R.string.email_or_password_empty,
                        Toast.LENGTH_SHORT).show();
                //si oui pop-up avec message venant de R.string
                return;
            }
            else if (!emailAdressValide(email_inputText.getText().toString())) {
                Toast.makeText(Inscription.this, R.string.email_invalide,
                        Toast.LENGTH_SHORT).show();
                //si oui pop-up avec message venant de R.string
                return;
            }
            else{
                //inscription en base
                System.out.println("EASYYY");
            }
            break;
        }



        case R.id.annuler:
            Intent intent = new Intent(Inscription.this,MainActivity.class);
            startActivity(intent);
            break;
    }
    }

    private boolean emailAdressValide(String email){
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher m = p.matcher(email);
        if(!m.matches())
            return false;
        return true;
    }



}