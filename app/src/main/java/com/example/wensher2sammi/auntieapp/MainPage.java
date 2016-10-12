package com.example.wensher2sammi.auntieapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        //Definition of android objects
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Spinner spinner = (Spinner) findViewById(R.id.main_spinner);

        setSupportActionBar(toolbar);

        // Set Spinner to active
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.main_category, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        // Floating Action Button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /** Called when the user touches the buttons */
    public void onclick_btn_search(View view) {
        // Do something in response to button click
        setContentView(R.layout.activity_search_page);
    }

    public void onclick_btn_bestbuy(View view)  {
        // Do something in response to button click
        setContentView(R.layout.activity_search_page);

    }

}
