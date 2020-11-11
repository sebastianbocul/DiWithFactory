package com.sebix.diwithfactory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.sebix.diwithfactory.Operators.OperatorController;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OperatorController operatorController = new OperatorController(3,5);
        int result = operatorController.createOperatorGetResult();
        Log.d("MyLog", "Result: "+result);
    }
}