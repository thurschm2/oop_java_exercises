package com.techreturners.cats;

public abstract class AbstractCat implements Cat {

    private boolean isSleeping = false;
    private String catSetting;
    public int height;

    protected AbstractCat() {
    }

    public void setCatSetting(String catSetting) {
        this.catSetting = catSetting;
    }

    public boolean isAsleep() {
        return isSleeping;
    }

    public boolean goToSleep() {
        this.isSleeping = true;
        return this.isSleeping;
    }

    public boolean wakeUp() {
        this.isSleeping = false;
        return this.isSleeping;
    }

    public String getSetting() {
        return this.catSetting;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAverageHeight() {
        return this.height;
    }

    public String eat(String afterEat) {
        return "Yum !";
    }
}

