package com.solid.dip;

public class NotificationServiceViolated {
    private EmailSenderViolated emailSender;

    public NotificationServiceViolated() {
        this.emailSender = new EmailSenderViolated();
    }

    public void sendNotification(String recipient, String message) {
        emailSender.sendEmail(recipient, message);
    }
}
