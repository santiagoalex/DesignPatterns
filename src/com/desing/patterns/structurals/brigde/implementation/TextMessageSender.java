package com.desing.patterns.structurals.brigde.implementation;

public class TextMessageSender implements MessageSender {

    @Override
    public void sendMessage(){

        System.out.println("TextMessageSender: Sending text message...");
    }
}
