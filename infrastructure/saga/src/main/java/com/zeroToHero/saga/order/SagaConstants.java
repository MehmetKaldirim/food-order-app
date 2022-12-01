package com.zeroToHero.saga.order;

public final class SagaConstants {

    // we will make class final and also add private constructors as a best practice
    // This will hold the constants with static final fields, so we dont want to anyone create an instance
    //of this class
    private SagaConstants(){
    }


    public static final String ORDER_SAGA_NAME = "OrderProcessingSaga";
}
