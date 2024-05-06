package com.driver;


public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle '" + name + "' is now steered to direction: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("Vehicle '" + name + "' is now moving at speed: " + currentSpeed + " in direction: " + currentDirection + " degrees");
    }

    public void stop(){
        this.currentSpeed = 0;
        System.out.println("Vehicle '" + name + "' has stopped");
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public String getName() {
        return name;
    }
}