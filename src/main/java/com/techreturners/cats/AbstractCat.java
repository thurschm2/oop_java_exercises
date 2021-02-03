package com.techreturners.cats;

abstract class AbstractCat implements Cat {

    private boolean isSleeping = false;
//    private String catSetting;
//    public int height;

    protected AbstractCat() {
    }

    public boolean isAsleep () {
        return isSleeping;
    }

    public boolean goToSleep() {
        isSleeping = true;
        return isSleeping;
    }
    public boolean wakeUp() {
        isSleeping = false;
        return isSleeping;
    }
    public String getSetting() {
        return catSetting;
    }
    public int getAverageHeight() {
        return height;
    }
}

