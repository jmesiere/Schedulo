package com.example.exosethi.schedulo.common;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.exosethi.schedulo.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import custom_font.MyEditText;
import custom_font.MyTextView;
import entities.Etudiant;
import model.BDDList;

public class Inscription extends AppCompatActivity implements View.OnTouchListener,View.OnClickListener {
    private MyTextView validate=null;
    private BDDList bddlist=new BDDList();

    MyEditText firstName_inputText;
    MyEditText name_inputText;
    MyEditText email_inputText;
    MyEditText password_inputText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //initialise la vue
        setContentView(R.layout.inscription);

        validate=(MyTextView) findViewById(R.id.valider);

        //si un click sur un bouton alors déclenche on click
        validate.setOnClickListener(this);
        firstName_inputText=(MyEditText)findViewById(R.id.editFirstName);
        name_inputText=(MyEditText)findViewById(R.id.editName);
        email_inputText=(MyEditText)findViewById(R.id.editEmail);
        password_inputText=(MyEditText)findViewById(R.id.inputPassword);
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
                Toast.makeText(Inscription.this,R.string.field_missing,
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
                bddlist.addStudent(new Etudiant(-1, firstName_inputText.getText().toString(),
                        name_inputText.getText().toString(),
                        email_inputText.getText().toString(),
                        "test",
                        password_inputText.getText().toString(),
                        2,2));
                System.out.println(bddlist.getStudent(2).getMailUtilisateur());
                System.out.println("Etudiant inscrit !");
            }
            break;
        }


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
