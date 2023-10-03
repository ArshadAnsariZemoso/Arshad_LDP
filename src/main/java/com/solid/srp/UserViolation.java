package com.solid.srp;

public class UserViolation {

    private String username;
    private String email;

    public UserViolation(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Methods for user data management
    public void saveUserToDatabase() {
        // Code to save user data to the database
    }

    public void updateUserProfile() {
        // Code to update user profile
    }

    // Methods for sending email notifications
    public void sendWelcomeEmail() {
        // Code to send a welcome email to the user
    }

    public void sendPasswordResetEmail() {
        // Code to send a password reset email to the user
    }
}

