package com.sebix.diwithfactory.di;

import com.sebix.diwithfactory.Operators.OperatorController;
import com.sebix.diwithfactory.Operators.OperatorData;
import com.sebix.diwithfactory.Operators.OperatorFactory;
import com.sebix.diwithfactory.Operators.OperatorNewFunction;
import com.sebix.diwithfactory.Operators.items.OperatorAdd;
import com.sebix.diwithfactory.Operators.items.OperatorMultiply;
import com.sebix.diwithfactory.Operators.items.OperatorSubtract;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;

@Module
@InstallIn(ApplicationComponent.class)
class AppModules {
    @Singleton
    @Provides
    public static OperatorData dataClass() {
        return new OperatorData();
    }

    @Singleton
    @Provides
    public static OperatorController operatorController(OperatorFactory operatorFactory) {
        return new OperatorController(operatorFactory);
    }

    @Singleton
    @Provides
    public static OperatorFactory operatorFactory(OperatorAdd operatorAdd,OperatorSubtract operatorSubtract,OperatorMultiply operatorMultiply) {
        return new OperatorFactory(operatorAdd,operatorSubtract,operatorMultiply);
    }

    @Singleton
    @Provides
    public static OperatorAdd operatorAdd(OperatorData dataClass, OperatorNewFunction operatorNewFunction) {
        return new OperatorAdd(dataClass,operatorNewFunction);
    }

    @Singleton
    @Provides
    public static OperatorSubtract operatorSubtract(OperatorData dataClass, OperatorNewFunction operatorNewFunction) {
        return new OperatorSubtract(dataClass,operatorNewFunction);
    }
    @Singleton
    @Provides
    public static OperatorMultiply operatorMultiply(OperatorData dataClass) {
        return new OperatorMultiply(dataClass);
    }
    @Singleton
    @Provides
    public static OperatorNewFunction operatorNewFunction() {
        return new OperatorNewFunction();
    }
}
