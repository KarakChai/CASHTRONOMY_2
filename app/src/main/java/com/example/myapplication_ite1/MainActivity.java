package com.example.myapplication_ite1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
public static final String EXTRA_MESSAGE="com.example.myapplication_ite1.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Intent intent=getIntent();
    }

    //when the expenditure chip is clicked

    public void expendAmt(View view)
    {
        Intent intent = new Intent(this, ExpenditurePage.class);
        /* EditText editText= (EditText) findViewById(R.id.editText2);
        String message= editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);  */
        startActivity(intent);
    }
        public void bckBtn(View view)
        {
                 Intent intent = new Intent(this,MainActivity.class);
                 startActivity(intent);
                             }
}
