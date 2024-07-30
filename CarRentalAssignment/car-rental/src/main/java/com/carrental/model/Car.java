package com.carrental.model;

public class Car {
    private String id;
    private Customer customer;
    private SpeedLimit speedLimit;

    public Car(String id, Customer customer, SpeedLimit speedLimit) {
        this.id = id;
        this.customer = customer;
        this.speedLimit = speedLimit;
    }

    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public SpeedLimit getSpeedLimit() {
        return speedLimit;
    }
}
