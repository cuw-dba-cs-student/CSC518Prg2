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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Wire up the Singleton to the Credit Card list view
        System.out.println("numCreditCards = " + Core.numCreditCards);
        if(Core.numCreditCards == 0) {
            System.out.println("in the numCreditCards IF block");
            //Core.creditCardListView = (ListView) this.findViewById(R.id.cCardListView);
            //Core.creditCardListAdapter = new ArrayAdapter(this, R.layout.credit_card_list_row, Core.theCreditCardStrings);
        }
        //Core.creditCardListView.setAdapter(Core.creditCardListAdapter);

        // Wire up the Singleton to the Loyalty Program list view
        System.out.println("numLoyaltyPrograms = " + Core.numLoyaltyPrograms);
        if(Core.numLoyaltyPrograms ==0 ) {
            System.out.println("in the numLoyaltyPrograms IF block");
            //Core.loyaltyProgramListView = (ListView)this.findViewById(R.id.lylPrgListView);
            //Core.loyaltyProgramListAdapter = new ArrayAdapter<>(this,R.layout.loyalt_program_list_row, Core.theLoyaltyProgramStrings);
            //Core.loyaltyProgramListView.setAdapter(Core.loyaltyProgramListAdapter);
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
