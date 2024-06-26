package edu.training.les18_java_hw.main;

import edu.training.les18_java_hw.entity.*;

public class Transportation {

	public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[7];
        
        vehicles[0] = new Car("Car", 4, "Toyota");
        vehicles[1] = new Car("Car", 4, "Honda");
        vehicles[2] = new Car("Car", 4, "Ford");
        vehicles[3] = new Car();
        vehicles[4] = new Bicycle("Bicycle", 2, "Mountain Bike");
        vehicles[5] = new Bicycle("Bicycle", 2, "Road Bike");
        vehicles[6] = new Bicycle();
        
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            if (vehicle instanceof Car) {
            	System.out.println(((Car) vehicle).displayCarInfo());
            } else if (vehicle instanceof Bicycle) {
            	System.out.println(((Bicycle) vehicle).displayBicycleInfo());
            }
        }
    }

}
