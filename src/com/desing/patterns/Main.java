package com.desing.patterns;

import com.desing.patterns.tests.*;

public class Main {

    public static void main(String args[]){

        //Imprimiendo la implementacion del adapter
        ITest adapter = new AdapterImplement();
        adapter.test();

        // Imprimiendo la implementacion del Brigde
        ITest brigde  = new BrigdeImplement();
        brigde.test();

        //Imprimiendo la implementacion del singleton
        ITest singleton = new SingletonImplement();
        singleton.test();

        //Imprimiendo la implementacion del Factory method
        ITest factory = new FactoryMethodImplement();
        factory.test();

        //Imprimiendo la implementacion del prototype
        ITest prototype = new PrototypeImplement();
        prototype.test();


    }

}
