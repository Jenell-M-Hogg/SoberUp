package com.example.amjh.soberup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        android.widget.TextView myT = (TextView) findViewById(R.id.myTextView1);
        myT.setText("Hullo this is your sobering up friend");




    }
}
