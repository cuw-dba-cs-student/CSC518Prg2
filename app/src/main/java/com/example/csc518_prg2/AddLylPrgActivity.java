package com.example.csc518_prg2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AddLylPrgActivity extends AppCompatActivity {

    EditText programNameText, bankText, curPrgBalText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_loyalty_prg);

        this.programNameText = (EditText)this.findViewById(R.id.programNameText);
        this.bankText = (EditText)this.findViewById(R.id.bankText);
        this.curPrgBalText = (EditText)this.findViewById(R.id.curPrgBalText);
    }

    public void onAddLoyaltyButtonPressed(View v) {
        System.out.println("onAddLoyaltyButton called");
        String programName = this.programNameText.getText().toString();
        String bankAfiliation = this.bankText.getText().toString();
        int currentBalance = Integer.parseInt(this.curPrgBalText.getText().toString());

        LoyaltyProgram lp = new LoyaltyProgram(programName,bankAfiliation,currentBalance);
        lp.display();
        Core.currLoyaltyProgram = lp;
        Core.theLoyaltyPrograms[Core.numLoyaltyPrograms] = lp;
        Core.theLoyaltyProgramStrings[Core.numLoyaltyPrograms] = lp.toString();
        if(Core.numLoyaltyPrograms == 0 ){
            Core.loyaltyProgramListView = (ListView)this.findViewById(R.id.lylPrgListView);
            Core.loyaltyProgramListAdapter = new ArrayAdapter<>(this,R.layout.loyalt_program_list_row, Core.theLoyaltyProgramStrings);
            Core.loyaltyProgramListView.setAdapter(Core.loyaltyProgramListAdapter);
        }
        else {
            Core.loyaltyProgramListAdapter.notifyDataSetChanged();
        }
        Core.numLoyaltyPrograms++;

        //Core.loyaltyProgramListAdapter.notifyDataSetChanged();

    }
}
