package project5;

/**
 * Provides the properties and methods for a vehicle.
 */
public class Vehicle {
    private static final String ROW = "%-12s%-16s%-6d%7d";    
    
    // Vehicle properties
    private String make;
    private int mileage;
    private String model;
    private int year;
    
    
	/**
     * Creates an object instance of the Vehicle class.
     * @param vehicleData The data representing the vehicle being stored.
     */
    public Vehicle(String[] vehicleData) {
        make = vehicleData[7];
        model = vehicleData[8];
        year = Integer.parseInt(vehicleData[9]);
        mileage = Integer.parseInt(vehicleData[10]);
        //System.out.println(make + model);
    }
    

	/**
     * Returns the mileage of the vehicle.
     * @return the mileage of the vehicle.
     */
    public int getMileage() {
        return mileage;
         }

	/**
	 * Returns a formatted String containing information about this vehicle.
	 * @return a formatted String containing information about this vehicle.
	 */
    @Override
    public String toString() {
        return String.format(ROW, make, model, year, mileage);
    }

	/**
     * Returns the year of the vehicle.
     * @return the year of the vehicle.
     */
    public int getYear() {
         return year;
    }
}