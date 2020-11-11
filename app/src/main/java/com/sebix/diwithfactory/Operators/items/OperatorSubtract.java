package com.sebix.diwithfactory.Operators.items;

import com.sebix.diwithfactory.Operators.Operator;
import com.sebix.diwithfactory.Operators.OperatorData;
import com.sebix.diwithfactory.Operators.OperatorNewFunction;

public class OperatorSubtract implements Operator {
    OperatorData operatorData;
    OperatorNewFunction operatorNewFunction;

    public OperatorSubtract(OperatorData operatorData, OperatorNewFunction operatorNewFunction) {
        this.operatorData = operatorData;
        this.operatorNewFunction = operatorNewFunction;
    }
    @Override
    public int getResult() {
        operatorNewFunction.showSomeInfo();
        return operatorData.a - operatorData.b;
    }
}
