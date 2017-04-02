package com.vchohan.androidexamples;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.vchohan.androidexamples.databinding.DataBindingActivityBinding;

public class DataBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DataBindingActivityBinding dataBindingActivityBinding =
            DataBindingUtil.setContentView(this, R.layout.data_binding_activity);

        //passing value through parameters if the value does not change, via constructor
        DataBindingJavaObject dataBindingJavaObject = new DataBindingJavaObject("Vineeth", "Chohan");

        //passing value through setter/getter
        dataBindingJavaObject.setPageTitle("DATA BINDING");
        dataBindingJavaObject.setSomeText("asdfasdf");
        dataBindingJavaObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DataBindingActivity.this, "FoooBar", Toast.LENGTH_SHORT).show();
            }
        });

        dataBindingActivityBinding.setDataBindingExample(dataBindingJavaObject);

    }
}
