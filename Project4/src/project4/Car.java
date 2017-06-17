package project4;

/**
 * Provides the properties and methods for a car.
 */
public class Car extends Vehicle {
    public static final String HEADER = "\n%-8s%-7s%-13s%-17s%-7s   %-5s   %-16s%-5s";
    public static final String ROW =    "%-8s%-7d%-13s%-17s%7d   %5s   %-16s%5s";
    
    private static final String NAME = "Car";
    
    private int numDoors; // How many doors this car has.
    
    /**
     * Creates an object instance of the Car class.
     * @param carData The data representing the car being stored.
     */
    protected Car(String[] carData) {
        super(carData);
        numDoors = Integer.parseInt(carData[6]);
    }

    /**
     * Returns the header used for the list of cars.
     * 
     * Note: This method overrides the Vehicle.getHeader method.
     * @return the header used for the list of cars.
     */
    @Override
    protected String getHeader() {
        return String.format(HEADER, "Color", "Year", "Make", "Model", "Mileage", 
                "Doors", "Body Type", "Price") + String.format(HEADER, "-----", 
                "----", "----", "-----", "-------", "-----", "---------", "-----");
    }
    
    /**
     * Returns a String containing the name of this object.
     * 
     * Note: This method overrides the Vehicle.getName method.
     * @return a String containing the name of this object.
     */
    @Override
    protected String getName() {
        return NAME;
    }
    
    /**
     * Returns the number of doors this car has.
     * @return the number of doors this car has.
     */
    protected int getNumDoors() {
        return numDoors;
    }
    
    /**
     * Returns the format String for displaying a row of car information.
     * 
     * Note: This method overrides the Vehicle.getRow method.
     * @return the format String for displaying a row of car information.
     */
    @Override
    protected String getRow() {
        return ROW;
    }
    
    /**
     * Returns an integer representation of this object.
     * 
     * Note: This method overrides the Vehicle.getType method.
     * @return an integer representation of this object.
     */
    @Override
    protected int getType() {
        return Vehicle.CAR;
    }
}