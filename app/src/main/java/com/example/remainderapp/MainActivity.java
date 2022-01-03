package com.example.remainderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    private Button Rem_button;
    TextView result;
    int ans=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=(EditText) findViewById(R.id.editText_first_no);
        number2=(EditText) findViewById(R.id.editText_second_no);
        Rem_button=(Button) findViewById(R.id.rem_button);
        result = (TextView) findViewById(R.id.textView_answer);
        Rem_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double rem = num1 % num2;
                result.setText(Double.toString(rem));
            }
        });
    }
}