package com.carrental.application;

import com.carrental.model.Car;
import com.carrental.utils.SpeedEvent;

public class SpeedMonitoringService {
    private NotificationService notificationService;

    public SpeedMonitoringService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void monitorSpeed(Car car, SpeedEvent speedEvent) {
        if (speedEvent.getSpeed() > car.getSpeedLimit().getLimit()) {
            String message = "Speed limit exceeded: " + speedEvent.getSpeed() + " km/h";
            notificationService.notify(car.getId(), message);
            // Here logic for warning the user will be added
        }
    }
}