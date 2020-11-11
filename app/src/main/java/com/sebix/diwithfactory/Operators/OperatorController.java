package com.sebix.diwithfactory.Operators;

public class OperatorController {
    OperatorData operatorData;

    public OperatorController(int a , int b) {
        this.operatorData = new OperatorData(a,b);
    }

    public int createOperatorGetResult(){
        Operator operator = OperatorFactory.getOperator("add",operatorData);
        return operator.getResult();
    }
}
