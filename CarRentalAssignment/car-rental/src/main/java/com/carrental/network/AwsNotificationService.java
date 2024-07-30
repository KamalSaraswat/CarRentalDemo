package com.carrental.infrastructure;

import com.carrental.application.NotificationService;

public class AwsNotificationService implements NotificationService {
    @Override
    public void notify(String carId, String message) {
        // Code to send notification via AWS
        // AWS API call
        System.out.println("AWS: Car " + carId + " - " + message);
    }
}