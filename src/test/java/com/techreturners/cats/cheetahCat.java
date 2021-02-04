package com.techreturners.cats;

public class cheetahCat extends AbstractCat{
    private String catSetting = "cheetah";
    private int height = 1100;
    private String afterEat = "Zzzzzzz";

    public cheetahCat() {
        super();
        setHeight(height);
        setCatSetting(catSetting);
    }

    @Override
    public String eat() {
        return this.afterEat;
    }


}
