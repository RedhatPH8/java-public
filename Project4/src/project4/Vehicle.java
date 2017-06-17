package project4;

/**
 * Provides the properties and methods for a vehicle.
 */
public abstract class Vehicle {
    public static final String HEADER = "\n%-8s%-7s%-13s%-17s%-7s   %-24s%-5s";
    public static final String ROW =    "%-8s%-7d%-13s%-17s%7d   %-24s%5s";
    
    // Vehicle types
    public static final int CAR = 0;
    public static final int CONVERTIBLE = 1;
    public static final int HATCHBACK = 2;
    public static final int MINIVAN = 4;
    public static final int SEDAN = 3;
    public static final int SUV = 5;
    public static final int TRUCK = 6;
    
    // Colors
    public static final int COLOR_BLACK = 0;
    public static final int COLOR_BLUE = 1;
    public static final int COLOR_RED = 2;
    
    // Vehicle properties
    private int color;
    private String make;
    private int mileage;
    private String model;
    private int price;
    private int year;
    
    // Array of colors names
    String[] colors = new String[] {"Black", "Blue", "Red"};
    
    /**
     * Creates an object instance of the Vehicle class.
     * @param vehicleData The data representing the vehicle being stored.
     */
    protected Vehicle(String[] vehicleData) {
        make = vehicleData[1];
        model = vehicleData[2];
        year = Integer.parseInt(vehicleData[3]);
        color = Integer.parseInt(vehicleData[4]);
        mileage = Integer.parseInt(vehicleData[5]);
        price = Integer.parseInt(vehicleData[7]);
    }

    /**
     * Returns the color of the vehicle.
     * @return the color of the vehicle.
     */
    protected int getColor() {
        return color;
    }
    
    /**
     * Returns the name of the vehicle color.
     * @param color The color of the vehicle.
     * @return the name of the vehicle color.
     */
    protected String getColor(int color) {
        return colors[color];
    }

    /**
     * Returns the header used for the list of vehicles.
     * @return the header used for the list of vehicles.
     */
    protected String getHeader() {
        return String.format(HEADER, "Color", "Year", "Make", "Model", "Mileage", 
                "Option", "Price") + String.format(HEADER, "-----", "----", 
                "----", "-----", "-------", "------", "-----");
    }
    
    /**
     * Returns the make of the vehicle.
     * @return the make of the vehicle.
     */
    protected String getMake() {
        return make;
    }

    /**
     * Returns the mileage of the vehicle.
     * @return the mileage of the vehicle.
     */
    protected int getMileage() {
        return mileage;
    }

    /**
     * Returns the model of the vehicle.
     * @return the model of the vehicle.
     */
    protected String getModel() {
        return model;
    }
    
    /**
     * Returns the price of the vehicle.
     * @return the price of the vehicle.
     */
    protected int getPrice() {
        return price;
    }
    
    /**
     * Returns the format String for displaying a row of vehicle information.
     * @return the format String for displaying a row of vehicle information.
     */
    protected String getRow() {
        return ROW;
    }

    /**
     * Returns the year of the vehicle.
     * @return the year of the vehicle.
     */
    protected int getYear() {
        return year;
    }
    
    /***************************************************************************
     * Abstract methods are listed below.
     * 
     * An abstract method supports the Object-Oriented Programming concepts of
     * Inheritance and Polymorphism.
     * 
     * Abstract methods do not have a body.
     **************************************************************************/
    
    /**
     * Returns a String containing the name of this object.
     * @return a String containing the name of this object.
     */
    protected abstract String getName();
    
    /**
     * Returns an integer representation of this object.
     * @return an integer representation of this object.
     */
    protected abstract int getType();
}