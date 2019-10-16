package com.example.toshiba.hut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Farmer extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {
    private EditText etname;
    private Button btnsStore, btnGetall;
    private EditText editText5;
    private DatabaseHelper databaseHelper;
    private ArrayList<String>arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer);

        databaseHelper = new DatabaseHelper(this);
        btnsStore = (Button)findViewById(R.id.btnstore);
        btnsStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //editText6.getText().toString();
                //editText5.getText().toString();
               // spinner
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //String text = spinner.getSelectedItem().toString();
        String text2 =adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
