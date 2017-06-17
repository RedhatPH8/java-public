package project4;

/**
 * Provides the properties and methods for an SUV.
 */
public class SUV extends Vehicle {
    private static final String NAME = "SUV";
    private static final String OPTION = "Entertainment Package";
    
    private boolean hasEntertainmentPackage; // Is a entertainment package installed
    
    /**
     * Creates an object instance of the SUV class.
     * @param suvData The data representing the SUV being stored.
     */
    public SUV(String[] suvData) {
        super(suvData);
        hasEntertainmentPackage = Boolean.parseBoolean(suvData[6]);
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
        return Vehicle.SUV;
    }
    
    /**
     * Returns a String representing the information about the SUV.
     * 
     * Note: This method overrides the Object.toString method.
     * @return a String representing the information about the SUV.
     */
    @Override
    public String toString() {
        return String.format(getRow(), getColor(getColor()), getYear(), getMake(), 
                getModel(), getMileage(), hasEntertainmentPackage ? OPTION : "", getPrice());
    }
}