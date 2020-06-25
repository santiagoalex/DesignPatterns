package com.desing.patterns;

import com.desing.patterns.tests.*;

public class Main {

    public static void main(String args[]){
        ITest adapter = new AdapterImplement();


        adapter.test();

    }

}
