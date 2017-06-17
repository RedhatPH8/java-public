package project4;

/**
 * Provides the properties and methods for a minivan.
 */
public class Minivan extends Vehicle {
    private static final String NAME = "Minivan";
    private static final String OPTION = "Access Ramp";
    
    private boolean hasAccessRamp; // Is a access ramp installed
    
    /**
     * Creates an object instance of the Minivan class.
     * @param minivanData The data representing the minivan being stored.
     */
    public Minivan(String[] minivanData) {
        super(minivanData);
        hasAccessRamp = Boolean.parseBoolean(minivanData[6]);
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
        return Vehicle.MINIVAN;
    }
    
    /**
     * Returns a String representing the information about the minivan.
     * 
     * Note: This method overrides the Object.toString method.
     * @return a String representing the information about the minivan.
     */
    @Override
    public String toString() {
        return String.format(getRow(), getColor(getColor()), getYear(), getMake(), 
                getModel(), getMileage(), hasAccessRamp ? OPTION : "", getPrice());
    }
}