package com.example.csc518_prg2;

import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Core {

    // Credit Card Program Attributes
    public static int          numCreditCards       = 0;
    public static CreditCard[] theCreditCards       = new CreditCard[2];
    public static String[]     theCreditCardStrings = new String[2];
    public static CreditCard   currCreditCard       = null;
    // Credit Card Program ListView Components
    public  static ListView creditCardListView;
    public  static ArrayAdapter<String> creditCardListAdapter;

    // Loyalty Program Attributes
    public static int              numLoyaltyPrograms       = 0;
    public static LoyaltyProgram[] theLoyaltyPrograms       = new LoyaltyProgram[2];
    public static String[]         theLoyaltyProgramStrings = new String[2];
    public static LoyaltyProgram   currLoyaltyProgram       = null;
    // Loyalty Program ListView Components
    public static ListView loyaltyProgramListView;
    public static ArrayAdapter<String> loyaltyProgramListAdapter;

}
