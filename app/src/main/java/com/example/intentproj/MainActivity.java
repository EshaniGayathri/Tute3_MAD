package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

//import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //
    public static final String EXTRA_NUMBER="com.example.intentproj.EXTRA_NUMBER";
    public static final String EXTRA_NUMBER2="com.example.intentproj.EXTRA_NUMBER2";


    Button button;//navigate to second activity
    Toast toast;//for create toast

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnclickButtonLister();//navigate to second activity


    }

    //navigate to second activity
    public void OnclickButtonLister(){
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Creating the LayoutInflater instance
                LayoutInflater li=getLayoutInflater();

                //Getting the View object as defined in the custom_toast.xml file
                View layout = li.inflate(R.layout.custom_toast, (ViewGroup)
                        findViewById(R.id.custom_toast_layout));

                TextView toastText=layout.findViewById(R.id.custom_toast_message);
                toastText.setText(("Opening calculating..."));

                //Creating the Toast object
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,150);
                toast.setView(layout);//setting the view of custom toast layout
                toast.show();


                /*create toast
                Context context=getApplicationContext();
                CharSequence text="Sending message...";
                int duration=Toast.LENGTH_SHORT;
                toast=Toast.makeText(context,text,duration);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.show();
                */

                //navigate numbers second activity
                EditText editText1=(EditText) findViewById(R.id.editNumber1);
                int number1=Integer.parseInt(editText1.getText().toString());

                EditText editText2=(EditText) findViewById(R.id.editNumber2);
                int number2=Integer.parseInt(editText2.getText().toString());


                Intent intent=new Intent(MainActivity.this,SecondActivity.class);

                //navigate numbers second activity
                intent.putExtra(EXTRA_NUMBER,number1);
                intent.putExtra(EXTRA_NUMBER2,number2);


                startActivity(intent);
            }
        });
    }

}