package com.driver.test;

import com.driver.Boat;

public class TestCases {
    public static void main(String[] args) {
        // Create a Boat object using the constructor with arguments
        Boat boat = new Boat("My Boat", 10);

        // Access the name and capacity of the boat using the correct method names
        String boatName = boat.getName();  // Using getName() instead of getVehicleName()
        int boatCapacity = boat.getCapacity();  // Using getCapacity() instead of getVehicleCapacity()

        // Print the boat's details
        System.out.println("Boat Name: " + boatName);
        System.out.println("Boat Capacity: " + boatCapacity);
    }
}