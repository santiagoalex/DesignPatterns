package com.desing.patterns.structurals.brigde.implementation;

public class EmailMessageSender implements MessageSender {

    @Override
        public void sendMessage () {
            System.out.println(" EmailMessageSemder: Sending email message... ");

        }
    }