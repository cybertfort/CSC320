import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			automobile car = new automobile("Jeep", "Grand Cherokee", "Tan", 2014, 160000);
			
			String[] vehicleInfo = car.listVehicleInfo();
			for (String info : vehicleInfo) {
				System.out.println(info);
			}
			 // Remove vehicle
            String removalStatus = car.removeVehicle();
            System.out.println(removalStatus);

            // Add a new vehicle
            String addStatus = car.addVehicle("Honda", "Civic", "Red", 2020, 12000);
            System.out.println(addStatus);

            // List the new vehicle information
            String[] newVehicleInfo = car.listVehicleInfo();
            for (String info : newVehicleInfo) {
                System.out.println(info);
            }

            // Update the vehicle
            String updateStatus = car.updateVehicle("Honda", "Accord", "Black", 2022, 5000);
            System.out.println(updateStatus);

            // List updated vehicle information
            String[] updatedVehicleInfo = car.listVehicleInfo();
            for (String info : updatedVehicleInfo) {
                System.out.println(info);
            }

            // Ask if the user wants to print the vehicle information to a file
            Scanner scanner = new Scanner(System.in);
            System.out.print("Do you want to print the vehicle information to a file? (Y/N): ");
            String userInput = scanner.nextLine();
            scanner.close();

            if (userInput.equalsIgnoreCase("Y")) {
                printToFile(updatedVehicleInfo);
                System.out.println("Vehicle information printed to file.");
            } else {
                System.out.println("File will not be printed.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to print vehicle information to file
    public static void printToFile(String[] vehicleInfo) {
        try {
            FileWriter writer = new FileWriter("C:\\Temp\\Autos.txt");
            for (String info : vehicleInfo) {
                writer.write(info + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
	}


