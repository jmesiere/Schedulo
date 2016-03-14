package com.example.exosethi.schedulo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import model.BDDList;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener,View.OnClickListener {
    private Button register=null;
    private Button connect=null;
    private BDDList bddlist=new BDDList();
    //
    final String EXTRA_LOGIN = "identifiant_input";
    final String EXTRA_PASSWORD = "password_input";
    EditText identifiant_inputText;
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
        setContentView(R.layout.content_main);

        connect=(Button) findViewById(R.id.connect);
        register=(Button) findViewById(R.id.register);

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
            else
                System.out.println(identifiant_inputText.getText().toString());
            System.out.println(password_inputText.getText().toString());

                if(bddlist.connexionSucces(identifiant_inputText.getText().toString(),password_inputText.getText().toString())){
                    Intent intent = new Intent(MainActivity.this,Acceuil.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,R.string.user_not_found,
                            Toast.LENGTH_SHORT).show();
                }

            break;
        }



        case R.id.register:
            Intent intent = new Intent(MainActivity.this,Inscription.class);
            startActivity(intent);
            break;
    }
    }



}
