package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioButton CTF, FTC;
    private TextView answer;
    private EditText numberInput;
    private Double answer0;
    private Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        CTF = findViewById(R.id.radioButtonCTF);
        FTC = findViewById(R.id.radioButtonFTC);
        answer = findViewById(R.id.answer);
        numberInput = findViewById(R.id.numberInputField);


        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double temp = Double.parseDouble(numberInput.getText().toString());
                if (FTC.isChecked()){
                    FTC(temp);
                } else if (CTF.isChecked()){
                    CTF(temp);
                }

            }
        });


    }


    public double FTC(double value){
        return (value - 32) * 5/9;
    }

    public double CTF(double value){
        return (value * 9/5) + 32;
    }

}

