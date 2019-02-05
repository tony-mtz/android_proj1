package com.example.cs453_assign_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button myButton;
    private TextView tvLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myButton = (Button)findViewById(R.id.btnSubmit);
        tvLabel = (TextView)findViewById((R.id.tvNewUser));

        tvLabel.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

//                Toast.makeText(MainActivity.this,R.string.toast_string, Toast.LENGTH_LONG);

                //intent object talks to the OS to pass some activity
                //takes context...from where and class
                //source and destination
                Intent i = new Intent(MainActivity.this, New_User.class);
                startActivity(i);
            }
        });


    }
}
