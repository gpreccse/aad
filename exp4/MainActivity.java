package com.example.exp4_5e4;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Button mButton;
    EditText mEdit;
    TextView mText;
    Spinner sp;
    RadioGroup rb;

    String[] states = {"Andhra Pradesh", "Telangana", "Madhya Pradesh", "Gujarat", "Goa", "Tamil Nadu", "Karnataka", "Kerala"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin = findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter<String> aa = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, states);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

        mButton = findViewById(R.id.button1);
        mButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                StringBuilder s = new StringBuilder();
                mEdit = findViewById(R.id.editText1);
                s.append("Hello ").append(mEdit.getText().toString()).append("!\n");

                mEdit = findViewById(R.id.editText3);
                s.append("Address ").append(mEdit.getText().toString()).append("\n");

                rb = findViewById(R.id.r);
                int d = rb.getCheckedRadioButtonId();
                RadioButton x = findViewById(d);
                s.append("Gender ").append(x.getText().toString()).append("\n");

                mEdit = findViewById(R.id.editTextDate2);
                s.append("Date of birth ").append(mEdit.getText().toString()).append("\n");

                mEdit = findViewById(R.id.editText4);
                s.append("Age ").append(mEdit.getText().toString()).append("\n");

                sp = findViewById(R.id.spinner);
                s.append("State ").append(sp.getSelectedItem().toString()).append("\n");

                mText = findViewById(R.id.textViewResult);
                mText.setText(s.toString());
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), states[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}

