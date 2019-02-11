package com.example.csc518_prg2;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class AddCC extends AppCompatActivity {

    private static final String TAG = "AddCC";

    private TextView mDisplayStartDate;
    private DatePickerDialog.OnDateSetListener mStartDateSetListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cc);

        mDisplayStartDate = (TextView) findViewById(R.id.ccStartDate);

        mDisplayStartDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day  = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dpDiag = new DatePickerDialog(AddCC.this, AlertDialog.THEME_DEVICE_DEFAULT_LIGHT,mStartDateSetListener,year,month,day);
                //dpDiag.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dpDiag.show();
            }
        });

        mStartDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//
            }
        };
    }
}
