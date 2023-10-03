package com.solid.dip;

public class EmailSender implements MessageSender {
    public void sendMessage(String to, String message) {
        // Code to send an email
        System.out.println("Email sent to " + to + ": " + message);
    }
}

