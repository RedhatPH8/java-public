package project4;

/**
 * Provides the properties and methods for a hatchback car.
 */
public class Hatchback extends Car {
    private static final String NAME = "Hatchback";
    
    /**
     * Creates an object instance of the Hatchback class.
     * @param hatchbackData The data representing the hatchback being stored.
     */
    public Hatchback(String[] hatchbackData) {
        super(hatchbackData);
    }
    
    /**
     * Returns a String representing the information about the hatchback.
     * 
     * Note: This method overrides the Object.toString method.
     * @return a String representing the information about the hatchback.
     */
    @Override
    public String toString() {
        return String.format(getRow(), getColor(getColor()), getYear(), getMake(), 
                getModel(), getMileage(), getNumDoors(), NAME, getPrice());
    }
}