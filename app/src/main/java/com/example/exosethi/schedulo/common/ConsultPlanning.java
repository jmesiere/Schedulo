package com.example.exosethi.schedulo.common;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.exosethi.schedulo.R;

import entities.Session;
import model.BDDList;

public class ConsultPlanning extends FragmentActivity {
    private static BDDList bddlist=new BDDList();

    EditText mEdit;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consultplanning);
        mEdit = (EditText)findViewById(R.id.editText1);
        SimpleDateFormat formater = null;
        Date aujourdhui = new Date();
        formater = new SimpleDateFormat("dd/MM/yyyy");
        String str = formater.format(aujourdhui);
        str.replace('/','-');
        mEdit.setText(str);

        ArrayList<Session> ls = bddlist.allCourseFromADay(str);

        for(int i=0;i<ls.size();i++){
            System.out.println(ls.get(i).getHeure()+" : "+ls.get(i).getContenuSession());
        }
    }

    public void selectDate(View view) {
        DialogFragment newFragment = new SelectDateFragment();
        newFragment.show(getSupportFragmentManager(), "DatePicker");
    }


    public void populateSetDate(int year, int month, int day) {
        mEdit = (EditText)findViewById(R.id.editText1);
        mEdit.setText(day+"-"+month+"-"+year);
    }
    public class SelectDateFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
        public SelectDateFragment(){

        }
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final Calendar calendar = Calendar.getInstance();
            int yy = calendar.get(Calendar.YEAR);
            int mm = calendar.get(Calendar.MONTH);
            int dd = calendar.get(Calendar.DAY_OF_MONTH);
            return new DatePickerDialog(getActivity(), this, yy, mm, dd);
        }

        public void onDateSet(DatePicker view, int yy, int mm, int dd) {
            populateSetDate(yy, mm+1, dd);
        }
    }

}
