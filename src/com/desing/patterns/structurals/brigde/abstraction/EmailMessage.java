package com.desing.patterns.structurals.brigde.abstraction;

import com.desing.patterns.structurals.brigde.implementation.MessageSender;

public class EmailMessage extends Message {

    public EmailMessage ( MessageSender messageSender ){
        super( messageSender );
    }

    @Override
    public void send(){
        messageSender.sendMessage();
    }
}
