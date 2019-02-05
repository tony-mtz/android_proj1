package com.example.cs453_assign_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class New_User extends AppCompatActivity {

    private Button btCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__user);

        btCancel = (Button)findViewById((R.id.btnCancel));

        btCancel.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

//                Toast.makeText(MainActivity.this,R.string.toast_string, Toast.LENGTH_LONG);

                //intent object talks to the OS to pass some activity
                //takes context...from where and class
                //source and destination
                Intent i = new Intent(New_User.this, MainActivity.class);
                startActivity(i);
            }
        });

    }

}
