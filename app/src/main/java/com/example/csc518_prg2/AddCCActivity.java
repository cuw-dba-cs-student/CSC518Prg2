package com.example.csc518_prg2;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class AddCCActivity extends AppCompatActivity {

    //private static final String TAG = "AddCCActivity";

    private TextView cCardStartDate;
    private DatePickerDialog.OnDateSetListener cCardStartDateSetLstnr;
    private EditText cardNameText, minSpendText, rewardPointsText;



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
                DatePickerDialog dpDiag = new DatePickerDialog(AddCCActivity.this, AlertDialog.THEME_DEVICE_DEFAULT_LIGHT,cCardStartDateSetLstnr,year,month,day);
                dpDiag.show();
            }
        });

        cCardStartDateSetLstnr = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//
                String start_date = String.format("%d/%d/%d", month+1, dayOfMonth, year);
                cCardStartDate.setText(start_date);
            }
        };

        this.cardNameText = (EditText)this.findViewById(R.id.cardNameText);
        this.minSpendText = (EditText)this.findViewById(R.id.minSpendText);
        this.rewardPointsText = (EditText)this.findViewById(R.id.rewardPointsText);
    }

    public void onAddCCBtnPressed (View v) {

        Date startDate;
        String cardName = this.cardNameText.getText().toString();
        int minSpend = Integer.parseInt(this.minSpendText.getText().toString());
        int rewardPoints = Integer.parseInt(this.rewardPointsText.getText().toString());

        try {
            startDate = new SimpleDateFormat("MM/dd/yyyy").parse(this.cCardStartDate.getText().toString());
            CreditCard cc = new CreditCard(cardName, startDate, minSpend, rewardPoints);
            cc.display();
            Core.currCreditCard = cc;
            Core.theCreditCards[Core.numCreditCards] = cc;
            Core.theCreditCardStrings[Core.numCreditCards] = cc.toString();

            if(Core.numCreditCards == 0 ){
                Core.creditCardListView.setAdapter(Core.creditCardListAdapter);
                Core.creditCardListView = (ListView) this.findViewById(R.id.cCardListView);
                Core.creditCardListAdapter = new ArrayAdapter(this, R.layout.credit_card_list_row, Core.theCreditCardStrings);
            }

            Core.numCreditCards++;

            Core.creditCardListAdapter.notifyDataSetChanged();

        }
        catch (java.text.ParseException e) {
            e.printStackTrace();
        }



    }



}
