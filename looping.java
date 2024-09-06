import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int count = 0;
	    float total = 0;
	    float max = Float.MIN_VALUE;
	    float min = Float.MAX_VALUE;
	        
	    while (count < 5) {
	        System.out.print("Enter a floating-point value (" + (count + 1) + "/5): ");
	        if (scanner.hasNextFloat()) {
	            float value = scanner.nextFloat();
	            total += value;
	                
	            if (value > max) {
	                max = value;
	            }
	            if (value < min) {
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
