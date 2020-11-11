package com.sebix.diwithfactory.Operators;

public class OperatorController {
    OperatorFactory operatorFactory;

    public OperatorController(OperatorFactory operatorFactory) {
        this.operatorFactory = operatorFactory;
    }

    public int createAndGetOpResult(String opName){
        Operator operator =  operatorFactory.getOperator(opName);
        return operator.getResult();
    }
}
