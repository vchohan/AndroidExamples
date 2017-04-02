package com.vchohan.androidexamples;

import android.databinding.BaseObservable;
import android.view.View;

/**
 * Created by vchohan on 3/31/17.
 */

public class DataBindingJavaObject extends BaseObservable {

    private String pageTitle;

    private String someText;

    public final String firstName;

    public final String lastName;

    private View.OnClickListener onClickListener;

    public View.OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getSomeText() {
        return someText;
    }

    public void setSomeText(String someText) {
        this.someText = someText;
    }

    public DataBindingJavaObject(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
