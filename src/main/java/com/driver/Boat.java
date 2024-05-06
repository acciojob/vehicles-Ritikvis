package com.driver;

public class Boat {
    private String name;
    private int capacity;

    // Constructor with arguments
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getter methods for name and capacity
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}