package com.vchohan.androidexamples;

/**
 * Created by vchohan on 3/31/17.
 */

public class DataBindingJavaObject {

    public final String pageTitle;

    public final String firstName;

    public final String lastName;

    public DataBindingJavaObject(String pageTitle, String firstName, String lastName) {
        this.pageTitle = pageTitle;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
