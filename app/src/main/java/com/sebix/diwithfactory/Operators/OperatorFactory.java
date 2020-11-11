package com.sebix.diwithfactory.Operators;

import com.sebix.diwithfactory.Operators.items.OperatorAdd;
import com.sebix.diwithfactory.Operators.items.OperatorMultiply;
import com.sebix.diwithfactory.Operators.items.OperatorSubtract;

class OperatorFactory {

    public static Operator getOperator(String opName,OperatorData operatorData){
        Operator operator = null;

        switch (opName){
            case "add":
                operator = new OperatorAdd(operatorData);
                break;
            case "sub":
                operator = new OperatorSubtract(operatorData);
                break;
            case "multi":
                operator = new OperatorMultiply(operatorData);
                break;
        }

        return operator;
    }
}
