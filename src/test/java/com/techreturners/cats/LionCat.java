package com.techreturners.cats;

public class LionCat extends AbstractCat {
    private String catSetting = "lion";
    private int height = 1100;
    private String afterEat = "Roar!!!!";

    public LionCat() {
        setHeight(height);
        setCatSetting(catSetting);
    }

    @Override
    public String eat() {
        return this.afterEat;
    }
}
