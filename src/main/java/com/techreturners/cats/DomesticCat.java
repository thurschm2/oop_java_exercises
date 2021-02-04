package com.techreturners.cats;

public class DomesticCat extends AbstractCat {
    private String catSetting = "domestic";
    private int height= 23;
    private String afterEat = "???????";
    public DomesticCat () {
        super(); // to enable the passing of parameters to abstract class
        setHeight(height);
        setCatSetting( catSetting);
    }
    @Override
    public String eat() {
        return this.afterEat;
    }


}