package com.example.asus.loginsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity
{
    private EditText etUsername;
    private EditText etpaasword;
    private Button btnLogin;
    private Button btnSignup;
    private UserDB db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etpaasword=(EditText)findViewById(R.id.etPassword);
        etUsername=(EditText) findViewById(R.id.etUserName);
        btnLogin=(Button)findViewById(R.id.btnLogin);
        btnSignup=(Button)findViewById(R.id.btnSignup);
        db=new UserDB(this);



    }



    public void checkUserNamePassword(View view)
    {
        String username = etUsername.getText().toString();
        String password = etpaasword.getText().toString();

        User user= db.getUser(username);
        if(user==null)
        {
            Toast.makeText(this,"user does not exist!",Toast.LENGTH_SHORT).show();
            return;
        }

        if(password.equals((user.getPassword())))
        {
            Intent i=new Intent(this,NewsfeedActivity.class);
            startActivity(i);
        }





      /*  if(username.equals("admin")&&password.equals("admin"))
        {
            Intent i =new Intent(this,NewsfeedActivity.class);
            startActivity(i);

        }
        else
        {
            Toast.makeText(this,"Username or Password is incorrect!",Toast.LENGTH_LONG).show();
       */ }

    }









