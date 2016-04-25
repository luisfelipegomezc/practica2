package com.luisfelipegomezc.item4;

import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        //return new DatePickerDialog(getActivity(), this, year, month, day);
        Spinner spinner = (Spinner) findViewById(R.id.ciudad);
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        List<String> ciudades = new ArrayList<String>();
        ciudades.add("Medellin");
        ciudades.add("Bogota");
        ciudades.add("Cali");
        ciudades.add("Pereira");
    }

   /* public void showDatePickerDialog(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }*/
}

