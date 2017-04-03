package com.vchohan.androidexamples;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private List<ListViewObject> myCars = new ArrayList<ListViewObject>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_activity);

        populateCarList();
        populateListView();
        registerClickCallback();
    }

    private void populateCarList() {
        myCars.add(new ListViewObject("asfd", 1940, 0, "asdfas"));
        myCars.add(new ListViewObject("asfd", 1940, 0, "asdfas"));
        myCars.add(new ListViewObject("asfd", 1940, 0, "asdfas"));
        myCars.add(new ListViewObject("asfd", 1940, 0, "asdfas"));
        myCars.add(new ListViewObject("asfd", 1940, 0, "asdfas"));
    }

    private void populateListView() {

        //create list of items
//        String[] myItems = {"Blue", "Red", "Yellow", "Green"};

        //build adapter
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view_items, myItems);
        ArrayAdapter<ListViewObject> adapter = new MyListAdapter();

        //configure the list view
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private class MyListAdapter extends ArrayAdapter<ListViewObject> {

        public MyListAdapter() {
            super(ListViewActivity.this, R.layout.list_view_items, myCars);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View itemView = convertView;
            if (itemView == null) {
                itemView = getLayoutInflater().inflate(R.layout.list_view_items, parent, false);
            }

            // find the list view item to work with
            ListViewObject currentCar = myCars.get(position);

            //fill in the view
            ImageView imageView = (ImageView) itemView.findViewById(R.id.list_view_icon);
            imageView.setImageResource(currentCar.getIconId());

            TextView largeTextView = (TextView) itemView.findViewById(R.id.list_view_large_text);
            largeTextView.setText(currentCar.getMake());

            TextView mediumTextView = (TextView) itemView.findViewById(R.id.list_view_medium_text);
            mediumTextView.setText(String.valueOf(currentCar.getYear()));

            TextView smallTextView = (TextView) itemView.findViewById(R.id.list_view_small_text);
            smallTextView.setText(currentCar.getCondition());

            return itemView;
        }
    }

    private void registerClickCallback() {
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                TextView textView = (TextView) view;

                ListViewObject clickedCar = myCars.get(position);

                String message = "Booya! " + position + "String: " + clickedCar.getMake();
                Toast.makeText(ListViewActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }
}
