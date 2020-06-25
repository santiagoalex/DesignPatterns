package com.desing.patterns.creationals.singleton;

public class SingletonClass {

    private static SingletonClass instance = null ;

    private  int Value = 0;

    private SingletonClass (){}

    public static SingletonClass getInstance(){
        if ( instance == null ){
            instance = new SingletonClass();
        }
        return instance;

    }

    public int getValue(){
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }
}
