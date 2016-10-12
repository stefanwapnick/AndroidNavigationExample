package com.example.stefanwapnick.navigationexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        TextView messageReceivedText = (TextView) findViewById(R.id.secondActivityMessageReceivedText);

        Intent intent = getIntent();
        if(intent != null){
            messageReceivedText.setText(String.format("Got %s", intent.getStringExtra(MainActivity.INTENT_MESSAGE_EXTRA)));
        }
    }
}
