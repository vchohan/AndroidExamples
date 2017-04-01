package com.vchohan.androidexamples;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.vchohan.androidexamples.databinding.DataBindingActivityBinding;

public class DataBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DataBindingActivityBinding dataBindingActivityBinding =
            DataBindingUtil.setContentView(this, R.layout.data_binding_activity);

        DataBindingJavaObject dataBindingJavaObject = new DataBindingJavaObject("Data Binding", "Vineeth", "Chohan");
        dataBindingActivityBinding.setDataBindingExample(dataBindingJavaObject);
    }
}
