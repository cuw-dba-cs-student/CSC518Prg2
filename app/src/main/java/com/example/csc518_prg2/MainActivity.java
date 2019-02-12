package com.example.csc518_prg2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAddCCBtnPress( View v) {
        Intent i = new Intent(this, AddCCActivity.class);
        this.startActivity(i);
    }

    public void onAddLylPgrBtnPress(View v) {
        Intent i = new Intent(this, AddLoyaltyPrg.class);
        this.startActivity(i);
    }
}
