package com.vchohan.androidexamples;

/**
 * Created by vchohan on 4/2/17.
 */

public class ListViewObject {

    private int iconId;

    private String make;

    private int year;

    private String condition;

    public ListViewObject(String make, int year, int iconId, String condition) {
        this.iconId = iconId;
        this.make = make;
        this.year = year;
        this.condition = condition;
    }

    public int getIconId() {
        return iconId;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public String getCondition() {
        return condition;
    }


}
