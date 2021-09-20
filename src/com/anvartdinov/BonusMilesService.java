package com.anvartdinov;

public class BonusMilesService {

    public int calculate(int cost) {
        int costOneMile = 20;
        int bonusMiles = cost / costOneMile;
        return bonusMiles;
    }

}
