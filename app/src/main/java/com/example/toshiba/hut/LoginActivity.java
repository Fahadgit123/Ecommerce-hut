package com.example.toshiba.hut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText nameEt;
    private EditText PasswordEtx;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initilizeView();
    }

    private void initilizeView() {
        nameEt = (EditText) findViewById(R.id.editText);
        PasswordEtx = (EditText) findViewById(R.id.editpassword);
        Login = (Button) findViewById(R.id.button);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(nameEt.getText().toString(), PasswordEtx.getText().toString());
            }
        });
    }


    private void validate(String username, String userpassword) {
        if (username.equals("admin") && userpassword.equals("1234")) {
            Intent intent = new Intent(LoginActivity.this, Productactiv.class);
            startActivity(intent);
        }

    }

    @Override
    public void onClick(View view) {
       /* if(view==Login){
            validate(nameEt.getText().toString(), PasswordEtx.getText().toString());
        }*/
    }
}



