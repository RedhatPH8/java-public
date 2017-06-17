package project4;

/**
 * Provides the properties and methods for a sedan car.
 */
public class Sedan extends Car {
    private static final String NAME = "Sedan";
    
    /**
     * Creates an object instance of the Sedan class.
     * @param sedanData The data representing the sedan being stored.
     */
    public Sedan(String[] sedanData) {
        super(sedanData);
    }
    
    /**
     * Returns a String representing the information about the sedan.
     * 
     * Note: This method overrides the Object.toString method.
     * @return a String representing the information about the sedan.
     */
    @Override
    public String toString() {
        return String.format(getRow(), getColor(getColor()), getYear(), getMake(), 
                getModel(), getMileage(), getNumDoors(), NAME, getPrice());
    }
}