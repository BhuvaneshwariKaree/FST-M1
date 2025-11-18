package activities;

public class Activity1 {
	
		    public static void main(String[] args) {
	        Car kia= new Car();
	        kia.make = 2019;
	        kia.color = "White";
	        kia.transmission = "Automatic";
	    
	        //Using Car class method
	        kia.displayCharacteristics();
	        kia.accelerate();
	        kia.brake();
	    }
}
