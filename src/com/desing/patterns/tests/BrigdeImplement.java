package com.desing.patterns.tests;

import com.desing.patterns.structurals.brigde.abstraction.*;
import com.desing.patterns.structurals.brigde.implementation.*;

public class BrigdeImplement implements ITest{

    @Override
    public void test(){
        System.out.println("--------------------------------------------");
        System.out.println("                  BRIGDE                    ");
        System.out.println("--------------------------------------------");
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage             = new TextMessage( textMessageSender );
        textMessage.send();

        MessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage             = new TextMessage( emailMessageSender );
        emailMessage.send();


    }
}
