package com.danta.sidqi.triomaut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.PrivateKey;
import java.util.jar.Attributes;


public class LoginPage extends AppCompatActivity {
 private EditText editText ;
 private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        EditText editText =(EditText) findViewById(R.id.Username);
        Button button  = (Button) findViewById(R.id.button);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (editText.getText().toString().equals("admin")) {
            Toast.makeText(LoginPage.this, "Login Success", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(LoginPage.this, MainMenu.class));
        } else {
            Toast.makeText(LoginPage.this, "Login Failed", Toast.LENGTH_SHORT).show();

        }
    }
});
    }
}