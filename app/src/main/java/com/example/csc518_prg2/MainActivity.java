package com.example.csc518_prg2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private ExpandableListAdapter expandableListAdapter;

    List<String> expandableListTitle;
    HashMap<String, List<String>>  expandableListDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] list1 = {"Foo","Bar","Baz"};
        String list1Title = "US Metasyntatic Variables";
        String[] list2 = {"Wibble", "Wobble","Wubble", "Flob"};
        String list2Title = "UK Metasyntantic Variables";

        expandableListView = (ExpandableListView) findViewById(R.id.cCardAndLylPrgExpndLstVw);



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
