package com.example.csc518_prg2;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class AddCreditCard extends AppCompatActivity {

    //private static final String TAG = "AddCreditCard";

    private TextView cCardStartDate;
    private DatePickerDialog.OnDateSetListener cCardStartDateSetLstnr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cc);

        cCardStartDate = (TextView) findViewById(R.id.ccStartDate);

        cCardStartDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day  = cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dpDiag = new DatePickerDialog(AddCreditCard.this, AlertDialog.THEME_DEVICE_DEFAULT_LIGHT,cCardStartDateSetLstnr,year,month,day);
                dpDiag.show();
            }
        });

        cCardStartDateSetLstnr = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//
                String start_date = String.format("Start date: %d/%d/%d", month+1, dayOfMonth, year);
                cCardStartDate.setText(start_date);
            }
        };
    }


}
