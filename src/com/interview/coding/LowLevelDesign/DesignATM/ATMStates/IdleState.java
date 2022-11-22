package com.interview.coding.LowLevelDesign.DesignATM.ATMStates;

import com.interview.coding.LowLevelDesign.DesignATM.ATM;
import com.interview.coding.LowLevelDesign.DesignATM.Card;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
