package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //calculation
    TextView result;

    EditText editNumber1;
    EditText editNumber2;

    Button btnAdd,btnSub,btnMult,btnDiv;

    float result_num;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //
        Intent intent=getIntent();
        final int number1=intent.getIntExtra(MainActivity.EXTRA_NUMBER,0);
        final int number2=intent.getIntExtra(MainActivity.EXTRA_NUMBER2,0);

        EditText editText1=(EditText) findViewById(R.id.editNumber1);
        EditText editText2=(EditText) findViewById(R.id.editNumber2);

        editText1.setText(""+ number1);
        editText2.setText(""+ number2);


        //calculation
        result=findViewById(R.id.result);

        editNumber1=findViewById(R.id.editNumber1);
        editNumber2=findViewById(R.id.editNumber2);

        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMult=findViewById(R.id.btnMult);
        btnDiv=findViewById(R.id.btnDiv);



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(editNumber1.getText().toString());
                num2=Integer.parseInt(editNumber2.getText().toString());
                result.setText(number1+"+"+number2 + "=" + (num1+num2));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(editNumber1.getText().toString());
                num2=Integer.parseInt(editNumber2.getText().toString());
                result.setText(number1+"-"+number2 + "=" + (num1-num2));
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(editNumber1.getText().toString());
                num2=Integer.parseInt(editNumber2.getText().toString());
                result.setText(number1+"*"+number2 + "=" + (num1*num2));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(editNumber1.getText().toString());
                num2=Integer.parseInt(editNumber2.getText().toString());
                result.setText(number1+"/"+number2 + "=" + (num1/num2));
            }
        });

    }
}
