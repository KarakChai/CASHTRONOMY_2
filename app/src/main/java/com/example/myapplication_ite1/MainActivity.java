package com.example.myapplication_ite1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //when the expenditure chip is clicked

    public void expendAmt(View view)
    {
        Intent intent = new Intent(this, ExpenditurePage.class);
        startActivity(intent);
    }

}
