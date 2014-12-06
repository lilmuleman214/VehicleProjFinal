package main;

public class TestVehicle {
	
	public static void main(String[] args){
		
		Person a = new Person();
		Truck t1 = new Truck();
		t1.transferOwnership(a);
		
		Person b = new Person();
		t1.transferOwnership(b);
		
		MotorCycle m1 = new MotorCycle();
		m1.setHasSideCar(false);
	}

}
