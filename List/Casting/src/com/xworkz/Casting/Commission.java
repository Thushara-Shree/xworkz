package com.xworkz.Casting;

import com.xworkz.external.Fee;
import com.xworkz.internal.Cash;

public class Commission {

    public void bribe(Cash cash){
        cash.rupee();
        cash.yen();
        cash.euro();
        cash.dollar();
        cash.cash();

        if(cash instanceof Fee){
            Fee fee=(Fee)cash;
            fee.cash();
        }

    }
}
