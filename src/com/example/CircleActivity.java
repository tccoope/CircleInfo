package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CircleActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button calculate=(Button)findViewById(R.id.calcButton);
        calculate.setOnClickListener(onCalculate);
    }

    private View.OnClickListener onCalculate=new View.OnClickListener(){
        public void onClick(View v){
            EditText radEntry=(EditText)findViewById(R.id.radEntry);
            TextView areaText=(TextView)findViewById(R.id.areaText);
            TextView periText = (TextView) findViewById(R.id.periText);
            DecimalFormat fmt=new DecimalFormat("0.000");
            double area, perimeter, radius;

            radius=Double.parseDouble(radEntry.getText().toString());
            perimeter=2*Math.PI*radius;
            area=Math.PI*Math.pow(radius,2);

            periText.setText(fmt.format(perimeter));
            areaText.setText(fmt.format(area));
        }
    };
}
