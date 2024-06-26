package edu.training.les18_java_hw.entity;

import java.util.Objects;

public class Vehicle {
	
	protected String vehicleType;
	protected int numberOfWheels;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String vehicleType, int numberOfWheels) {
		this.vehicleType = vehicleType;
		this.numberOfWheels = numberOfWheels;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	public String displayInfo() {
		return toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(numberOfWheels, vehicleType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return numberOfWheels == other.numberOfWheels && Objects.equals(vehicleType, other.vehicleType);
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleType=" + vehicleType + ", numberOfWheels=" + numberOfWheels + "]";
	}
	
}
