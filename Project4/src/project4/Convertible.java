package project4;

/**
 * Provides the properties and methods for a convertible car.
 */
public class Convertible extends Car {
    private static final String NAME = "Convertible";
    
    /**
     * Creates an object instance of the Convertible class.
     * @param sonvertibleData The data representing the convertible being stored.
     */
    public Convertible(String[] sonvertibleData) {
        super(sonvertibleData);
    }
    
    /**
     * Returns a String representing the information about the convertible.
     * 
     * Note: This method overrides the Object.toString method.
     * @return a String representing the information about the convertible.
     */
    @Override
    public String toString() {
        return String.format(getRow(), getColor(getColor()), getYear(), getMake(), 
                getModel(), getMileage(), getNumDoors(), NAME, getPrice());
    }
}