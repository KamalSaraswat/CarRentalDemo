package com.carrental.network;

import com.carrental.application.NotificationService;

public class FirebaseNotificationService implements NotificationService {
    @Override
    public void notify(String carId, String message) {
        // Code to send notification via Firebase
        // Firebase API call
        System.out.println("Firebase: Car " + carId + " - " + message);
    }
}