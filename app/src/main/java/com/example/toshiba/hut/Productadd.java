package com.example.toshiba.hut;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

//activity_ productadd
public class Productadd extends AppCompatActivity {
    private EditText editprod;
    private Button button6add;
    private Switch switch3;

    private String text;
    private Boolean switchonof;
    public static final String SHARED_PREFS = "sharedprefs";
    public static final String TEXT = "text";   //?
    public static final String SWITCH = "switch";

    AddProductInfo addProdutinfo = new AddProductInfo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productadd);
       initializeView();
    }

    private void initializeView() {
        editprod = (EditText)findViewById(R.id.editText3);
        button6add = (Button)findViewById(R.id.button6);
        switch3 = (Switch)findViewById(R.id.switch3);

        button6add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveData();
            }
        });
        loadData();
        updateViews();
    }
    public void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putString(TEXT, editprod.getText().toString());
        editor.putBoolean(SWITCH, switch3.isChecked());

        editor.apply();
        Toast.makeText(this, "Data save",Toast.LENGTH_SHORT).show();
    }

    public void loadData(){
       SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        text = sharedPreferences.getString(TEXT, "");
        switchonof = sharedPreferences.getBoolean(SWITCH, false);
    }
    public void updateViews(){
        editprod.setText(text);
        switch3.setChecked(switchonof);
    }
}
