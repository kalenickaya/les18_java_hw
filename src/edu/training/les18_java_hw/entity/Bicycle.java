package edu.training.les18_java_hw.entity;

import java.util.Objects;

public class Bicycle extends Vehicle {
	
	protected String bicycleType;
	
	public Bicycle() {
		super();
	}
	
	public Bicycle(String vehicleType, int numberOfWheels, String bicycleType) {
		super(vehicleType, numberOfWheels);
		this.bicycleType = bicycleType;
	}

	public String getBicycleType() {
		return bicycleType;
	}

	public void setBicycleType(String bicycleType) {
		this.bicycleType = bicycleType;
	}
	
	public String displayBicycleInfo() {
		return toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(bicycleType);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bicycle other = (Bicycle) obj;
		return Objects.equals(bicycleType, other.bicycleType);
	}

	@Override
	public String toString() {
		return "Bicycle [bicycleType=" + bicycleType + ", vehicleType=" + vehicleType + ", numberOfWheels="
				+ numberOfWheels + "]";
	}

}
