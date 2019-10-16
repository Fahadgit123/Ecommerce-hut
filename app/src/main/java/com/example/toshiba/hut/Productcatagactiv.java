package com.example.toshiba.hut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Productcatagactiv extends AppCompatActivity {
    private Button buttonadd;
    private TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        textView4 = (TextView)findViewById(R.id.textView4);

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFarmer();
            }
        });
        /* buttonadd = (Button) findViewById(R.id.buttonad);

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProductadd();
            }
            private void openProductadd(){
                Intent intent = new Intent(Productcatagactiv.this, Productadd.class);
                startActivity(intent);
            }
        });*/
}

    private void openFarmer() {
        Intent intent = new Intent(Productcatagactiv.this, Farmer.class);
        startActivity(intent);
    }

    /*private void openProductadd() {
    }*/

}
