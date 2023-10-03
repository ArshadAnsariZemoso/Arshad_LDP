package com.solid.dip;

public class Main {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender(); // Instantiate the concrete sender
        NotificationService notificationService = new NotificationService(emailSender);
        notificationService.sendNotification("user@example.com", "Hello!");
    }
}