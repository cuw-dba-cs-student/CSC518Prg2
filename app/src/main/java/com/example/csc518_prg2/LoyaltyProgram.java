package com.example.csc518_prg2;

import android.view.View;

public class LoyaltyProgram {

    private String programName;
    private String bankAfiliation;
    private int    currentBalance;

    public LoyaltyProgram (String programName_in, String bankAfiliation_in, int currentBalance_in ) {
        this.programName    = programName_in;
        this.bankAfiliation = bankAfiliation_in;
        this.currentBalance = currentBalance_in;
        System.out.println(this);
    }

    public void display() {
        System.out.println(this.programName + " " + this.bankAfiliation + " " + this.currentBalance);
    }
}
