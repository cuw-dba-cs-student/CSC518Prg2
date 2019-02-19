package com.example.csc518_prg2;

import java.util.Date;

public class CreditCard {

    private String cardName;
    private Date startDate;
    private int minSpend;
    private int rewardPoints;

    //Per the google sytle guide https://google.github.io/styleguide/javaguide.html#s5.2.5-non-constant-field-names
    //my blatant disregard of camel case in java code is pure heresy. See https://community.oracle.com/docs/DOC-1007838
    //for the evil guidelines I have been corrupted with from PL/SQL.
    public CreditCard (String cardname_in, Date startdate_in, int minspend_in, int rewardpoints_in) {
        this.cardName     = cardname_in;
        this.startDate    = startdate_in;
        this.minSpend     = minspend_in;
        this.rewardPoints = rewardpoints_in;
    }

    public void display() {
        System.out.println(this.cardName + " " + this.startDate + " " + this.minSpend + " " + this.rewardPoints);
    }

    public String toString() {
        return this.cardName + " " + this.startDate + " " + this.minSpend + " " + this.rewardPoints;
    }

}

