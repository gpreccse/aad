package com.example.exp8;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity
{
    RadioGroup colorRadioGroup;
    TextView selectedColorTextView;
    Button showSelectionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorRadioGroup = findViewById(R.id.color_radio_group);
        selectedColorTextView = findViewById(R.id.selected_color_text_view);
        showSelectionButton = findViewById(R.id.show_selection_button);

        showSelectionButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int checkedRadioButtonId = colorRadioGroup.getCheckedRadioButtonId();

                if (checkedRadioButtonId != -1)
                {
                    RadioButton checkedRadioButton = findViewById(checkedRadioButtonId);
                    String selectedColor = checkedRadioButton.getText().toString();
                    selectedColorTextView.setText("Your selected color is: " + selectedColor);
                }
                else
                {
                    selectedColorTextView.setText("Please select a color");
                }
            }
        });
    }
}
