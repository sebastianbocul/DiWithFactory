package com.sebix.diwithfactory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.sebix.diwithfactory.Operators.OperatorController;
import com.sebix.diwithfactory.Operators.OperatorData;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {
    @Inject
    OperatorData operatorData;
    @Inject
    OperatorController operatorController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operatorData.setA(4);
        operatorData.setB(15);

        int result = operatorController.createAndGetOpResult("multiply");
        Log.d("MyLog", "Result: "+result);
    }
}