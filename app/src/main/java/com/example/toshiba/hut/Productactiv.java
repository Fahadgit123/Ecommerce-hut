package com.example.toshiba.hut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Productactiv extends AppCompatActivity {
    private Button button2;
    private Button buttonad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        button2 = (Button)findViewById(R.id.button2);
        buttonad = (Button) findViewById(R.id.buttonad);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThirdactiv();  //activity_catagory.xml
            }

            private void openThirdactiv() {
                Intent intent = new Intent(Productactiv.this, Productcatagactiv.class);
                startActivity(intent);
            }
        });

        buttonad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                openProductadd();}
             private void openProductadd() {
                    Intent intent = new Intent(Productactiv.this, Productadd.class);
                    startActivity(intent);
                }

        });


    }

    private void openProductadd() {
    }
}
