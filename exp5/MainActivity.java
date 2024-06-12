package com.example.exp5;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    Button bt;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                et=findViewById(R.id.un);
                intent.putExtra("un",et.getText().toString());
                et=findViewById(R.id.pwd);
                intent.putExtra("pwd",et.getText().toString());
                startActivity(intent);
            }
        });
    }
}
