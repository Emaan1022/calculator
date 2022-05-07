package com.example.mc_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Add(View view){
        EditText et1=(EditText) findViewById(R.id.editTextNumber2);
        EditText et2=(EditText) findViewById(R.id.editTextNumber3);
        EditText et3=(EditText) findViewById(R.id.editTextNumber4);

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
             int result=n1+n2;

             et3.setText("Adding value is:"+result);
    }

    public void Subtract(View view){
        EditText et1=(EditText) findViewById(R.id.editTextNumber2);
        EditText et2=(EditText) findViewById(R.id.editTextNumber3);
        EditText et3=(EditText) findViewById(R.id.editTextNumber4);

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1-n2;

        et3.setText("Subtracting value is:"+result);
    }

    public void Multiply(View view){
        EditText et1=(EditText) findViewById(R.id.editTextNumber2);
        EditText et2=(EditText) findViewById(R.id.editTextNumber3);
        EditText et3=(EditText) findViewById(R.id.editTextNumber4);

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1*n2;

        et3.setText("Multipying value is:"+result);
    }

    public void Divide(View view){
        EditText et1=(EditText) findViewById(R.id.editTextNumber2);
        EditText et2=(EditText) findViewById(R.id.editTextNumber3);
        EditText et3=(EditText) findViewById(R.id.editTextNumber4);

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1/n2;

        et3.setText("Dividing value is:"+result);
    }
}