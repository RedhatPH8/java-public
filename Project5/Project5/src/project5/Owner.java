package project5;

/**
 * Provides the properties and methods for an owner.
 */
public class Owner {
    private static final String ROW = "%-12s%-12s%-49s%-17s%-41s";
    private static final String ADDRESS = "%s %s, %s  %s";
	
    Vehicle vehicle ;
    //private Collection vehicle;
	// Owner properties
        private String lastName;
        private String firstName;
        private String address;
        private String city;
        private String state;
        private String phone;
        private String zip;

	/**
     * Creates an object instance of the Owner class.
     * @param ownerData The data representing the owner being stored.
     */
    protected Owner(String[] ownerData) {
        vehicle = new Vehicle(ownerData);
        lastName = ownerData[0];
        firstName = ownerData[1];
        address = ownerData[2];
        city = ownerData[3];
        state = ownerData[4];
        zip = ownerData[5];
        phone = ownerData[6];
        
        
    }
    
	/**
     * Returns the city of the owner.
     * @return the city of the owner.
     */
    public String getCity() {
        return city;
    }
    
	/**
	 * Returns a formatted String containing the header for an owner report.
	 * @return a formatted String containing the header for an owner report.
	 */
    public String getHeader() {
        return String.format("%-12s%-12s%-49s%-17s%-12s%-16s%-6s%-7s\n%-12s%-12s%-49s%-17s%-12s%-16s%-6s%-7s", 
                "Last Name", "First Name", "Address", "Phone", "Make", "Model", "Year", "Mileage", 
                "---------", "----------", "-------", "-----", "----", "-----", "----", "-------");
    }
    
	/**
     * Returns the last name of the owner.
     * @return the last name of the owner.
     */
    public String getLastName() {
        return lastName;
    }
    
	/**
     * Returns the state of the owner.
     * @return the state of the owner.
     */
    public String getState() {
        return state;
    }
    
	/**
     * Returns the vehicle of the owner.
     * @return the vehicle of the owner.
     */
    public Vehicle getVehicle() {
        return vehicle;
    }
	/**
	 * Returns a formatted String containing information about this owner.
	 * @return a formatted String containing information about this owner.
	 */
    @Override
    public String toString() {
        return String.format(ROW, lastName, firstName, String.format(ADDRESS, address, city, state, zip), phone, vehicle.toString());
    }
}