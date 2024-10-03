import java.io.FileWriter;
import java.io.IOException;


public class automobile {
    // Variables for vehicle information
    private String autoMake;
    private String autoModel;
    private String autoColor;
    private int autoYear;
    private int mileage;
    
    // Default Constructor
    public automobile() {
        this.autoMake = "";
        this.autoModel = "";
        this.autoColor = "";
        this.autoYear = 0;
        this.mileage = 0;
    }

    // Parameterized Constructor to initialize vehicle information
    public automobile(String autoMake, String autoModel, String autoColor, int autoYear, int mileage) {
        this.autoMake = autoMake;
        this.autoModel = autoModel;
        this.autoColor = autoColor;
        this.autoYear = autoYear;
        this.mileage = mileage;
    }

    // Method to remove a vehicle
    public String removeVehicle() {
        try {
            this.autoMake = "";
            this.autoModel = "";
            this.autoColor = "";
            this.autoYear = 0;
            this.mileage = 0;
            return "Vehicle removed successfully.";
        } catch (Exception e) {
            return "Failed to remove vehicle: " + e.getMessage();
        }
    }

    //Adding a vehicle
    public String addVehicle(String autoMake, String autoModel, String autoColor, int autoYear, int mileage) {
        // Checking if the vehicle slot is empty
        try {
            this.autoMake = autoMake;
            this.autoModel = autoModel;
            this.autoColor = autoColor;
            this.autoYear = autoYear;
            return "Vehicle added successfully.";
        } catch (Exception e) {
            return "Failed to add vehicle." + e.getMessage();
        }
    }

    // Method to display vehicle details
    public String[] listVehicleInfo() {
        try {
            String[] vehicleInfo = { "Make: " + this.autoMake, "Model: " + this.autoModel, 
                                     "Color: " + this.autoColor, "Year: " + this.autoYear, 
                                     "Mileage: " + this.mileage };
            return vehicleInfo;
        } catch (Exception e) {
            return new String[]{"Error retrieving vehicle information: " + e.getMessage()};
        }
    }

    // Method to update a vehicle's details
    public String updateVehicle(String newMake, String newModel, String newColor, int newYear, int newMileage) {
        try {
            this.autoMake = newMake;
            this.autoModel = newModel;
            this.autoColor = newColor;
            this.autoYear = newYear;
            this.mileage = newMileage;
            return "Vehicle updated successfully.";
        } catch (Exception e) {
            return "Failed to update vehicle: " + e.getMessage();
        }
    }
}

