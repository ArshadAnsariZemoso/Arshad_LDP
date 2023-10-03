package com.solid.dip;

public class NotificationService {
    private MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendNotification(String recipient, String message) {
        messageSender.sendMessage(recipient, message);
    }
}