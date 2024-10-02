import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int count = 0; //initializing count to keep track of how many values are entered
	    float total = 0; //initialize total to track the sum of values 
	    float max = Float.MIN_VALUE; //initialize max to the smallest float value
	    float min = Float.MAX_VALUE; //initialize min to the largest float value
	        
	    //begin loop to get 5 floating-point values from user
	    while (count < 5) {
	    	//prompt user to enter floating-point value while showing progress
	        System.out.print("Enter a floating-point value (" + (count + 1) + "/5): ");
	        //check if user has entered a valid floating-point number
	        if (scanner.hasNextFloat()) {
	            float value = scanner.nextFloat();
	            total += value;
	                
	            //check if the current value is greater than the current max 
	            if (value > max) {
	            	
	            	// update max if value is larger
	                max = value;
	            }
	            //check if the current value is less than the current min
	            if (value < min) {
	            	//update min if the value is smaller
	                min = value;
	            }
	                
	            count++;
	       //Input Validation
	       } else {
	          System.out.println("Invalid input. Please enter a floating-point value.");
	            scanner.next();
	            }
	        }

	        // Calculate average and interest
	        float average = total / 5;
	        float interest = total * 0.20f;

	        // Display results
	        System.out.println("\nResults:");
	        System.out.println("Total: " + total);
	        System.out.println("Average: " + average);
	        System.out.println("Maximum: " + max);
	        System.out.println("Minimum: " + min);
	        System.out.println("Interest on total at 20%: " + interest);

	    }
	}
