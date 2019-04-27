package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void converter(View view) {
        Log.i("convert", "button pressed");
        EditText editText=(EditText)findViewById(R.id.editText);
        String amountinrs=editText.getText().toString();
        double amountinrsDouble=Double.parseDouble(amountinrs);
        double amountindollardouble=amountinrsDouble / 71.31;
        String amountindollarString=String.format("%.2f" , amountindollardouble);
        Log.i("amount in dollar",amountindollarString);
        Toast.makeText(this, "Amount in Dollar" + amountindollarString, Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
