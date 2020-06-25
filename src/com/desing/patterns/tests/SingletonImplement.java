package com.desing.patterns.tests;

import com.desing.patterns.creationals.singleton.SingletonClass;

public class SingletonImplement implements ITest {
     @Override
    public void test (){
         System.out.println( "Probando el patron singleton" );

         System.out.println( "Primera instancia" );
         SingletonClass firstInstance = SingletonClass.getInstance();
         System.out.println( "obteniendo el primer valor singleton: " + firstInstance.getValue() );
         firstInstance.setValue(10);
         System.out.println( "Probando el patron singleton despues del cambio: " + firstInstance.getValue() );


         System.out.println( "Segunda instancia" );
         SingletonClass secondInstance = SingletonClass.getInstance();
         System.out.println( "Obteniendo el segundo valor singleton: " + secondInstance.getValue());

         System.out.println( "El valor debe ser el mismo por que es el objetivo del patron singleton " );


     }
}
