package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends AbstractCat {

    private final Random randomGen;
    private static final int MAX_INT_BOUND = 10;
    private static final int RARE_EVENT_CHANCE = 7;
    public DomesticCat() {
        super("domestic", 23);
        randomGen = new Random();
    }

    @Override
    public String eat() {
        if (randomGen.nextInt(MAX_INT_BOUND) + 1 > RARE_EVENT_CHANCE) {
            return "It will do I suppose";
        }
        return "Purrrrrrr";
    }
}
