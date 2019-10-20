package com.example.ffst;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    TextInputEditText TextInputEditText_email, TextInputEditText_password;
    TextView TextView_login;
    String emailOK = "123@gmail.com";
    String passwordOK = "1234";

    String inputEmail = "";
    String inputPassword = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextInputEditText_email     = findViewById(R.id.et_email);
        TextInputEditText_password  = findViewById(R.id.et_pw);
        TextView_login = findViewById(R.id.tv_login);


        TextView_login.setClickable(false);
        TextInputEditText_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s != null) {
                    Log.d("SENTI", s.toString());
                    inputEmail = s.toString();
                    TextView_login.setEnabled(validation());
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        TextInputEditText_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s != null) {
                    Log.d("SENTI", s.toString());
                    inputPassword = s.toString();
                    TextView_login.setEnabled(validation());
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        TextView_login.setClickable(true);
        TextView_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("SENTI", "onClick");

                String email = TextInputEditText_email.getText().toString();
                String password = TextInputEditText_password.getText().toString();

                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                intent.putExtra("email", email);
                intent.putExtra("password", password);
                startActivity(intent);
            }
        });
    }

    public boolean validation() {
        Log.d("SENTI", inputEmail + " / " + inputPassword + " / " + (inputEmail.equals(emailOK)) + " / " + (inputPassword.equals(passwordOK)));
        return inputEmail.equals(emailOK) &&  inputPassword.equals(passwordOK);
    }

}
