package com.example.stefanwapnick.navigationexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    public static final String INTENT_MESSAGE_EXTRA = "INTENT_MESSAGE_EXTRA";

    private EditText messageInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageInput = (EditText) findViewById(R.id.mainActivityMessageInput);
    }

    public void onSendMessage(View v){
        Intent navigateIntent = new Intent(this, SecondActivity.class);
        navigateIntent.putExtra(INTENT_MESSAGE_EXTRA, messageInput.getText().toString());
        startActivity(navigateIntent);
    }
}
