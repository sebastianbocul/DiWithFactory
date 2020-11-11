package com.sebix.diwithfactory.Operators.items;

import com.sebix.diwithfactory.Operators.Operator;
import com.sebix.diwithfactory.Operators.OperatorData;
import com.sebix.diwithfactory.Operators.OperatorNewFunction;

public class OperatorAdd implements Operator {
    OperatorData operatorData;
    OperatorNewFunction operatorNewFunction;

    public OperatorAdd(OperatorData operatorData, OperatorNewFunction operatorNewFunction) {
        this.operatorData = operatorData;
        this.operatorNewFunction = operatorNewFunction;
    }

    @Override
    public int getResult() {
        operatorNewFunction.showSomeInfo();
        return operatorData.a + operatorData.b;
    }
}
