package activities;

public class Activity2 {
	
	public static void main(String[] args)
	{
		    int[] numbers = {10, 77, 10, 54, -11, 10};
	        int sum = 0;

	        //find and sum all the 10's
	        for (int i = 0; i < 6; i++) {
	            if (numbers[i] == 10) {
	               sum = sum + numbers[i];
	            }
	        }

	        // Check if the sum is 30
	        if (sum == 30) {
	        	System.out.println("true");
	        } else {
	            System.out.println("false");
	        }
	    }

}




