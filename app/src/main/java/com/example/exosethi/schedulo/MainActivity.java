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

public class MainActivity extends AppCompatActivity implements View.OnTouchListener,View.OnClickListener {
    private Button register=null;
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
        identifiant_inputText=(EditText)findViewById(R.id.identifiant_input);
        password_inputText=(EditText)findViewById(R.id.password_input);
        setContentView(R.layout.content_main);

        register=(Button) findViewById(R.id.register);

        register.setOnClickListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    @Override
    public void onClick(View v) {
    switch(v.getId()){
        case R.id.connect:{
            checkValue();
        }



        case R.id.register:
            //System.out.println("J'ai cliqué easy");
            setContentView(R.layout.inscription);
            break;
    }
    }
    private void checkValue(){
        //EditText identifiant_inputText=(EditText)findViewById(R.id.identifiant_input);
        //EditText password_inputText=(EditText)findViewById(R.id.password_input);
        final String identifiant_inputStr=identifiant_inputText.getText().toString();
        final String password_inputStr=password_inputText.getText().toString();

        if (identifiant_inputStr.equals("") || password_inputStr.equals("")){
            System.out.println("VIDEEEEEEEEEEEEEE");
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle("Missing value");
            alertDialog.setMessage("Please check that you entered correctly a value for both arrival fuel and fuel uplift.");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    return;
                } });
            alertDialog.show();
        }

    }
}
