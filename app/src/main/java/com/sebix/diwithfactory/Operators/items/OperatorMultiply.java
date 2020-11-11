package com.sebix.diwithfactory.Operators.items;

import com.sebix.diwithfactory.Operators.Operator;
import com.sebix.diwithfactory.Operators.OperatorData;

public class OperatorMultiply implements Operator {
    OperatorData operatorData;

    public OperatorMultiply(OperatorData operatorData) {
        this.operatorData = operatorData;
    }

    @Override
    public int getResult() {
        return operatorData.a + operatorData.b;
    }
}
