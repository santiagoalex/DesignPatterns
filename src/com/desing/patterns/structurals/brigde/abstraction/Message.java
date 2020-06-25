package com.desing.patterns.structurals.brigde.abstraction;

import com.desing.patterns.structurals.brigde.implementation.MessageSender;

public abstract class Message {

    MessageSender messageSender;

    public Message( MessageSender  messageSender){

        this.messageSender = messageSender;
    }

    abstract  public void send();


}
