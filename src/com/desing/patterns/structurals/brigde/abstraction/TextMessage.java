package com.desing.patterns.structurals.brigde.abstraction;

import com.desing.patterns.structurals.brigde.implementation.MessageSender;

public class TextMessage extends Message {

    public TextMessage( MessageSender messageSender){
        super( messageSender );
    }

    @Override
    public void send(){

        messageSender.sendMessage();
    }


}
