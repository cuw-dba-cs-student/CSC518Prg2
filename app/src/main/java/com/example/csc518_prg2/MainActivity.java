package com.example.csc518_prg2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView cCardListView;
    private ArrayAdapter<String> cCardListAdapter;

    private ListView lylPrgListView;
    private ArrayAdapter<String> lylPrgListAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Credit Cards = " + Core.numCreditCards);

        if( Core.numCreditCards > 0) {
            this.cCardListView = (ListView)this.findViewById(R.id.cCardListView);
            this.cCardListAdapter = new ArrayAdapter(this,R.layout.credit_card_list_row,Core.theCreditCardStrings);
            this.cCardListView.setAdapter(this.cCardListAdapter);
        }

        if( Core.numLoyaltyPrograms > 0) {
            this.lylPrgListView = (ListView)this.findViewById(R.id.lylPrgListView);
            this.lylPrgListAdapter = new ArrayAdapter(this,R.layout.credit_card_list_row,Core.theLoyaltyProgramStrings);
            this.lylPrgListView.setAdapter(this.lylPrgListAdapter);
        }



    }

    public void onAddCCBtnPress( View v) {
        Intent i = new Intent(this, AddCCActivity.class);
        this.startActivity(i);
    }

    public void onAddLylPgrBtnPress(View v) {
        Intent i = new Intent(this, AddLylPrgActivity.class);
        this.startActivity(i);
    }
}
