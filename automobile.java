public class automobile {
    // Variables for vehicle information
    private String autoMake;
    private String autoModel;
    private String autoColor;
    private int autoYear;

    // Constructor to initialize vehicle information
    public automobile(String autoMake, String autoModel, String autoColor, int autoYear) {
        this.autoMake = autoMake;
        this.autoModel = autoModel;
        this.autoColor = autoColor;
        this.autoYear = autoYear;
    }

    // Method to remove a vehicle
    public String removeVehicle(String autoMake, String autoModel, String autoColor, int autoYear) {
        // Check if the provided values match the stored vehicle's values
        if (this.autoMake.equals(autoMake) && this.autoModel.equals(autoModel) &&
            this.autoColor.equals(autoColor) && this.autoYear == autoYear) {
            //Removing the vehicle by clearing the fields
            this.autoMake = "";
            this.autoModel = "";
            this.autoColor = "";
            this.autoYear = 0;
            return "Vehicle removed successfully.";
        } else {
            return "Vehicle details mismatch. Removal failed.";
        }
    }

    //Adding a vehicle
    public String addVehicle(String autoMake, String autoModel, String autoColor, int autoYear) {
        // Checking if the vehicle slot is empty
        if (this.autoMake == "" && this.autoModel == "" && this.autoYear == 0) {
            this.autoMake = autoMake;
            this.autoModel = autoModel;
            this.autoColor = autoColor;
            this.autoYear = autoYear;
            return "Vehicle added successfully.";
        } else {
            return "Vehicle slot already occupied.";
        }
    }

    // Method to display vehicle details
    public String displayVehicle() {
        if (this.autoMake == "" || this.autoModel == "" || this.autoYear == 0) {
            return "No vehicle in inventory.";
        } else {
            return "Make: " + this.autoMake + ", Model: " + this.autoModel +
                   ", Color: " + this.autoColor + ", Year: " + this.autoYear;
        }
    }

    // Method to update a vehicle's details
    public String updateVehicle(String newMake, String newModel, String newColor, int newYear) {
        if (this.autoMake != "" && this.autoModel != "" && this.autoYear != 0) {
            this.autoMake = newMake;
            this.autoModel = newModel;
            this.autoColor = newColor;
            this.autoYear = newYear;
            return "Vehicle updated successfully.";
        } else {
            return "No vehicle to update.";
        }
    }
}
