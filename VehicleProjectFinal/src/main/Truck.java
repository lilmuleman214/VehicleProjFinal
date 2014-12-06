package main;

public class Truck extends Vehicle implements VehicleInterface{
	
	public int NumberOfAxels;
	
	public Truck(){
		
	}

	public int getNumberOfAxels() {
		return NumberOfAxels;
	}

	public void setNumberOfAxels(int numberOfAxels) {
		NumberOfAxels = numberOfAxels;
	}

}
