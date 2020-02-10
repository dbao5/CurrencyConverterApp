package com.example.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void clickFunction(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        //Toast.makeText(MainActivity.this, editText.getText().toString(),
        // Toast.LENGTH_LONG).show();
        String str = editText.getText().toString();
        goToActivity2(str);
    }
    public void goToActivity2(String s){
        Intent intent = new Intent(this, pounds.class);
        intent.putExtra("Message", s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
