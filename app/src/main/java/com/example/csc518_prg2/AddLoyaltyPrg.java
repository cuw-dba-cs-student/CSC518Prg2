package com.example.csc518_prg2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AddLoyaltyPrg extends AppCompatActivity {

    EditText programNameText, bankText, curPrgBalText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_loyalty_prg);
    }

    public void onAddLoyaltyButton(View v) {
        String programName = this.programNameText.getText().toString();
        String bankAfiliation = this.bankText.getText().toString();
        int currentBalance = Integer.parseInt(this.curPrgBalText.getText().toString());

        LoyaltyProgram l = new LoyaltyProgram(programName,bankAfiliation,currentBalance);

        l.display();
    }
}