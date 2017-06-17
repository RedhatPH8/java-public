package project4;

/**
 * Provides the properties and methods for a truck.
 */
public class Truck extends Vehicle {
    private static final String NAME = "Truck";
    private static final String OPTION = "Tow Package";
    
    private boolean hasTowPackage; // Is a towing package installed
    
    /**
     * Creates an object instance of the Truck class.
     * @param truckData The data representing the truck being stored.
     */
    public Truck(String[] truckData) {
        super(truckData);
        hasTowPackage = Boolean.parseBoolean(truckData[6]);
    }
    
    /**
     * Returns a String containing the name of this object.
     * 
     * Note: This method overrides the Vehicle.getName method.
     * @return a String containing the name of this object.
     */
    @Override
    public String getName() {
        return NAME;
    }
    
    /**
     * Returns an integer representation of this object.
     * 
     * Note: This method overrides the Vehicle.getType method.
     * @return an integer representation of this object.
     */
    @Override
    public int getType() {
        return Vehicle.TRUCK;
    }
    
    /**
     * Returns a String representing the information about the truck.
     * 
     * Note: This method overrides the Object.toString method.
     * @return a String representing the information about the truck.
     */
    @Override
    public String toString() {
        return String.format(getRow(), getColor(getColor()), getYear(), getMake(), 
                getModel(), getMileage(), hasTowPackage ? OPTION : "", getPrice());
    }
}