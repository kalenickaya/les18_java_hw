package edu.training.les18_java_hw.entity;

import java.util.Objects;

public class Car extends Vehicle {

	protected String carBrand;
	
	public Car() {
		super();
	}

	public Car(String vehicleType, int numberOfWheels, String carBrand) {
		super(vehicleType, numberOfWheels);
		this.carBrand = carBrand;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	
	public String displayCarInfo() {
		return toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(carBrand);
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
		Car other = (Car) obj;
		return Objects.equals(carBrand, other.carBrand);
	}

	@Override
	public String toString() {
		return "Car [carBrand=" + carBrand + ", vehicleType=" + vehicleType + ", numberOfWheels=" + numberOfWheels
				+ "]";
	}
	
}
