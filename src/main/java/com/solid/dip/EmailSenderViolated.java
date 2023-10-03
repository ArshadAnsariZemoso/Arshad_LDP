package com.solid.dip;

public class EmailSenderViolated {
    public void sendEmail(String to, String message) {
        // Code to send an email
        System.out.println("Email sent to " + to + ": " + message);
    }
}
