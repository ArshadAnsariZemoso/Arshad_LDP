package com.solid.dip;

public class MainViolated {
    public static void main(String[] args) {
        NotificationServiceViolated notificationService = new NotificationServiceViolated();
        notificationService.sendNotification("user@example.com", "Hello!");
    }
}