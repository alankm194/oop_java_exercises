package com.techreturners.cats;

public class CheetahCat extends AbstractCat{
    public CheetahCat() {
        super("wild", 2000);
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
    }
}
