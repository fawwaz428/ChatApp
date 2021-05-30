package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Linking all the views
       addButton =findViewById(R.id.activity_main_add_button);
        //Button onClickListener()
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //here all the work is done when the login button is pressed


                Intent intent=new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);

            }
        });




    }
}