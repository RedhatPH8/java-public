package project5;

/**
 * Provides the properties and methods for a collection of owners.
 */
public class Collection {

    // Sorting descriptions
    public static final int CITY_STATE = 0;
    public static final int LAST_NAME = 1;
    public static final int MILEAGE = 2;
    public static final int UNSORTED = 3;
    public static final int YEAR = 4;

    private int numOwners;

    private Owner[] owners;
    private String[] sortTypes = new String[]{"Sorted by City and State", "Sorted by Last Name", "Sorted by Mileage", "Unsorted", "Sorted by Year"};

    /**
     * Creates an object instance of the Collection class and initializes the
     * owner collection.
     *
     * @param maxSize The maximum number of owners stored in this collection.
     */
    public Collection(int maxSize) {
        owners = new Owner[maxSize];
    }

    /**
     * Adds a owner to the collection.
     *
     * @param owner The owner to add.
     */
    public void add(Owner owner) {
        owners[numOwners++] = owner;
    }

    /**
     * Displays information about the owners and the vehicles they own.
     */
    public void displayOwners() {
        displayOwners(sortTypes[UNSORTED]);
    }

    /**
     * Displays information about the owners and the vehicles they own.
     *
     * @param sortType The description of the sort performed on the owner data.
     */
    private void displayOwners(String sortType) {
        System.out.format("\nOwner Information(%s):\n\n", sortType);
        System.out.println(owners[0].getHeader());
        for (Owner owner : owners) {
            System.out.println(owner.toString());
        }
    }

    /**
     * Returns the total number of owners stored in this collection.
     *
     * @return the total number of owners stored in this collection.
     */
    public int getTotal() {
        return owners.length;
    }

    /**
     * Determines which sorting method to call based on the specified sort type.
     *
     * Note: Once the data is sorted, this method displays the owner
     * information.
     *
     * @param sortType The type of sort to perform.
     */
    public void sortData(int sortType) {
        switch (sortType) {
            case 0: // City and State
                sortByOwnerCityState();
                break;
            case 1: // Last Name
                sortByOwnerLastName();
                break;
            case 2: // Mileage
                sortByVehicleMileage();
                break;
            case 3: // Unsorted
                break;
            case 4: // Year
                sortByVehicleYear();
                break;
            default:
                System.out.println("Error:  Illegal Sort Type Selected");
        }
        displayOwners(sortTypes[sortType]);
    }

    /**
     * Sorts the owner data by State, and then by City using the Bubble Sort
     * algorithm.
     */

    private void sortByOwnerCityState() {
        for (int y = 0; y<owners.length; y++) { 				//traversal loop
            for (int x = 0; x<owners.length-1; x++) {
                if (owners[x].getState().compareToIgnoreCase(owners[x+1].getState())>0){
                    swap(x, x + 1);
                } else if ((owners[x].getState().compareToIgnoreCase(owners[x+1].getState()) == 0) && (owners[x].getCity().compareToIgnoreCase(owners[x+1].getCity()) > 0)){
                    swap(x, x + 1);
                }
            }
        }
    }

    /**
     * Sorts the owner data by Last Name using the Bubble Sort algorithm.
     */
    private void sortByOwnerLastName() {

        
        for (int y = 0; y < owners.length; y++) {	//traversal loop
            for (int x = 0; x < owners.length-1; x++) {		//comparison loop
                
                if (owners[x].getLastName().compareToIgnoreCase(owners[x + 1].getLastName()) > 0) {
                    swap(x, x + 1);
                }
            }
        }
    }

    /**
     * Sorts the owner data by vehicle Mileage using the Bubble Sort algorithm.
     */
    private void sortByVehicleMileage() {
        for (int y = 0; y < owners.length; y++) {	//traversal loop
            for (int x = 0; x < owners.length-1; x++) {		//comparison loop
                if (owners[x].getVehicle().getMileage() > owners[x + 1].getVehicle().getMileage()) {
                    swap(x, x + 1);
                }
            }
        }
    }

    /**
     * Sorts the owner data by vehicle Year using the Bubble Sort algorithm.
     *
     * Note: The data must be sorted in descending order (newest to oldest).
     */
    private void sortByVehicleYear() {
        for (int y = 0; y < owners.length; y++) {	//traversal loop
            for (int x = 0; x < owners.length-1; x++) {		//comparison loop
                if (owners[x].vehicle.getYear() < owners[x + 1].vehicle.getYear()) {
                    swap(x, x + 1);
                }
            }
        }
    }

    /**
     * Swaps values between the two specified locations in an array.
     *
     * @param pos1 The position of the first value to swap.
     * @param pos2 The position of the second value to swap.
     */
    private void swap(int pos1, int pos2) {
        Owner temp = owners[pos1];
        owners[pos1] = owners[pos2];
        owners[pos2] = temp;
    }
}
