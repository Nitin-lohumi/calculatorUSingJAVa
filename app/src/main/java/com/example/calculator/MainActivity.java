package com.example.calculator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    TextView Result;
    EditText number1,number2;
    Button plus,subs,divide,multiply;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Result =findViewById(R.id.Result);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        plus = findViewById(R.id.plus);
        subs = findViewById(R.id.subtract);
        divide = findViewById(R.id.divide);
        multiply = findViewById(R.id.multi);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=0,num2=0,res;
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                res = num1+num2;
                Result.setText(res);
            }
        });
        subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=0,num2=0,res;
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                res = num1-num2;
                Result.setText( res);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=0,num2=0,res;
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                res =num1*num2;
                Result.setText( res);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                double num1=0,num2=0,res;
                num1 = Double.parseDouble(number1.getText().toString());
                num2 = Double.parseDouble(number2.getText().toString());
                res = num1/num2;
                Result.setText(""+res);
            }
        });
    }
}