package com.example.supratimdey.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private AndroidFlavourAdapter flavourAdapter;

    ArrayList<AndroidFlavour> androidFlavors = new ArrayList<AndroidFlavour>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        androidFlavors.add(new AndroidFlavour("Donut", "1.6", R.drawable.donut));
        androidFlavors.add(new AndroidFlavour("Eclair", "2.0-2.1", R.drawable.eclair));
        androidFlavors.add(new AndroidFlavour("Froyo", "2.2-2.2.3", R.drawable.froyo));
        androidFlavors.add(new AndroidFlavour("GingerBread", "2.3-2.3.7", R.drawable.gingerbread));
        androidFlavors.add(new AndroidFlavour("Honeycomb", "3.0-3.2.6", R.drawable.honeycomb));
        androidFlavors.add(new AndroidFlavour("Ice Cream Sandwich", "4.0-4.0.4", R.drawable.icecream));
        androidFlavors.add(new AndroidFlavour("Jelly Bean", "4.1-4.3.1", R.drawable.jellybean));
        androidFlavors.add(new AndroidFlavour("KitKat", "4.4-4.4.4", R.drawable.kitkat));
        androidFlavors.add(new AndroidFlavour("Lollipop", "5.0-5.1.1", R.drawable.lollipop));
        androidFlavors.add(new AndroidFlavour("Marshmallow", "6.0-6.0.1", R.drawable.marshmallow));

        flavourAdapter = new AndroidFlavourAdapter(this, androidFlavors);

        ListView listView= (ListView) findViewById(R.id.listview_flavor);

        listView.setAdapter(flavourAdapter);
    }


}
