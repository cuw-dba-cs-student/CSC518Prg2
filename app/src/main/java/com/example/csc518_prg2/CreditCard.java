package com.example.csc518_prg2;

import java.util.Date;

public class CreditCard {

    private String cardName;
    private Date startDate;
    private int minSpend;
    private int rewardPoints;

    //Per the google sytle guide https://google.github.io/styleguide/javaguide.html#s5.2.5-non-constant-field-names
    //my blatant disregard of camel case in java code is pure heresy.
    public CreditCard (String p_card_name_in, Date p_start_date_in, int p_min_spend_in, int p_reward_points_in) {
        this.cardName     = p_card_name_in;
        this.startDate    = p_start_date_in;
        this.minSpend     = p_min_spend_in;
        this.rewardPoints = p_reward_points_in;
    }


}

