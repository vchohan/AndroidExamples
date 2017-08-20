package com.vchohan.androidexamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mListViewButton;

    private Button mDataBindingButton;

    private Button mMovableActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        mListViewButton = (Button) findViewById(R.id.list_view_button);
        mListViewButton.setOnClickListener(this);

        mDataBindingButton = (Button) findViewById(R.id.data_binding_button);
        mDataBindingButton.setOnClickListener(this);

        mMovableActivityButton = (Button) findViewById(R.id.movable_activity_button);
        mMovableActivityButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.list_view_button:
                intent = new Intent(MainActivity.this, ListViewActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            case R.id.data_binding_button:
                intent = new Intent(MainActivity.this, DataBindingActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            case R.id.movable_activity_button:
                intent = new Intent(MainActivity.this, MovableActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
        }
    }
}
