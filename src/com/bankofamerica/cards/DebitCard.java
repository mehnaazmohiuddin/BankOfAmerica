package com.bankofamerica.cards;
import  com.mehnaaz.sdk.bank.model.Card;

public class DebitCard extends Card {
    int maxCardLimit;
    public void setCardLimit(int maxLimit){
        this.maxCardLimit = maxLimit;
    }


}
