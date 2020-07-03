package com.desing.patterns.tests;

import com.desing.patterns.creationals.factoryMethod.*;

public class FactoryMethodImplement implements ITest {

    @Override
    public void test(){
        System.out.println("--------------------------------------------");
        System.out.println("             FACTORY METHOD                 ");
        System.out.println("--------------------------------------------");
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");


    }
}
