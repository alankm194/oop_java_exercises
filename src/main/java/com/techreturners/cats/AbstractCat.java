package com.techreturners.cats;

public abstract class AbstractCat implements Cat{
    protected boolean isAsleep;
    protected String setting;
    protected int averageHeight;

    public AbstractCat(String setting, int averageHeight) {
        this.isAsleep = false;
        this.setting = setting;
        this.averageHeight = averageHeight;
    }

    @Override
    public boolean isAsleep() {
        return isAsleep;
    }

    @Override
    public void goToSleep() {
        isAsleep = true;
    }

    @Override
    public void wakeUp() {
        isAsleep = false;
    }

    @Override
    public String getSetting() {
        return setting;
    }

    @Override
    public int getAverageHeight() {
        return averageHeight;
    }
}
