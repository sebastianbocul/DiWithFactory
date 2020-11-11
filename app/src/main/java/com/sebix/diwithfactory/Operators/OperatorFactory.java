package com.sebix.diwithfactory.Operators;

import com.sebix.diwithfactory.Operators.items.OperatorAdd;
import com.sebix.diwithfactory.Operators.items.OperatorMultiply;
import com.sebix.diwithfactory.Operators.items.OperatorSubtract;

public class OperatorFactory {
    OperatorAdd operatorAdd;
    OperatorSubtract operatorSubtract;
    OperatorMultiply operatorMultiply;

    public OperatorFactory(OperatorAdd operatorAdd, OperatorSubtract operatorSubtract, OperatorMultiply operatorMultiply) {
        this.operatorAdd = operatorAdd;
        this.operatorSubtract = operatorSubtract;
        this.operatorMultiply = operatorMultiply;
    }

    public Operator getOperator(String opName){
        Operator operator = null;
        switch (opName){
            case "add":
                operator = operatorAdd;
                break;
            case "sub":
                operator = operatorSubtract;
                break;
            case "multiply":
                operator = operatorMultiply;
                break;
        }

        return operator;
    }
}
