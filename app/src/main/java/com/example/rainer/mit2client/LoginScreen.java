package com.example.rainer.mit2client;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        initializeButtons();
    }

    private void initializeButtons() {
        Button loginButton = (Button) findViewById(R.id.Login_Button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoHomeSreen();
            }
        });

        Button registerButton = (Button) findViewById(R.id.Register_Button);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoRegisterScreen();
            }
        });
    }

    private void gotoHomeSreen(){
        Intent intent = new Intent(this, NavigationDrawer.class);
        startActivity(intent);
    }

    private void gotoRegisterScreen(){
//        Intent intent = new Intent(this, RegisterScreen.class);
//        startActivity(intent);
    }
}
