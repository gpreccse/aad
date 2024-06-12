package com.example.exp9;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id == R.id.item1)
        {
            Toast.makeText(this, "Bluetooth Selected", Toast.LENGTH_LONG).show();
            return true;
        }
        else if (id == R.id.item2)
        {
            Toast.makeText(this, "Alarm Selected", Toast.LENGTH_LONG).show();
            return true;
        }
        else if (id == R.id.item3)
        {
            Toast.makeText(this, "Social Media Selected", Toast.LENGTH_LONG).show();
            return true;
        }
        else if (id == R.id.subitem1)
        {
            Toast.makeText(this, "Twitter Selected", Toast.LENGTH_LONG).show();
            return true;
        }
        else if (id == R.id.subitem2)
        {
            Toast.makeText(this, "Instagram Selected", Toast.LENGTH_LONG).show();
            return true;
        }
        else
            return super.onOptionsItemSelected(item);
    }
}
