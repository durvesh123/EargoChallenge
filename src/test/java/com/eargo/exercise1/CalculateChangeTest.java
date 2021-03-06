package com.eargo.exercise1;

import org.junit.Assert;

import java.util.List;
import java.util.ArrayList;


public class CalculateChangeTest{

    private CalculateChange calculateChange;

    @org.junit.Before
    public void setUp() throws Exception {
        calculateChange = new CalculateChange();
    }

    @org.junit.Test
    public void getMinimumCoinsHappyScenario1() {

        List<String> expected = new ArrayList<>();
        expected.add("Dimes 0");
        expected.add("Nickel 1");
        expected.add("Quarters 3");
        expected.add("Pennies 3");
        Assert.assertEquals(expected, calculateChange.getMinimumCoinsGreedy(83));
    }

    @org.junit.Test
    public void getMinimumCoinsHappyScenario2() {

        List<String> expected = new ArrayList<>();
        expected.add("Dimes 0");
        expected.add("Nickel 0");
        expected.add("Quarters 3");
        expected.add("Pennies 0");
        Assert.assertEquals(expected, calculateChange.getMinimumCoinsGreedy(75));
    }

    @org.junit.Test
    public void getMinimumCoinsWithNegativeInput() {
        Assert.assertNull(null, calculateChange.getMinimumCoinsGreedy(-83));
    }


    @org.junit.Test
    public void minCoinsRequiredDPTest() {
        int coins [] = new int[]{1,5,10,25};
        Assert.assertEquals(7, calculateChange.minCoinsRequiredDP(coins, coins.length, 83 ));
    }




}