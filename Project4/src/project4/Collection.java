package project4;

/**
 * Provides the properties and methods for a collection of vehicles.
 */
public class Collection {
    public static final String DOUBLE_ROW = "%-19s %.2f\n";
    public static final String INT_ROW = "%-19s %d\n";
    public static final String STRING_ROW = "%-19s %s\n";
    
    private int numVehicles;
    private Vehicle[] vehicles;
    
    /**
     * Creates an object instance of the Collection class and initializes the vehicle collection.
     * @param maxSize The maximum number of vehicles stored in this collection.
     */
    public Collection(int maxSize) {
        vehicles = new Vehicle[maxSize];
    }
    
    /**
     * Adds a vehicle to the collection.
     * @param vehicle The vehicle to add.
     */
    public void add(Vehicle vehicle) {
        vehicles[numVehicles++] = vehicle;
    }
    
    /**
     * Displays information about this collection of vehicles, as well as all of  
     * the data for the vehicles in this collection.
     */
    public void displayVehicleInformation() {
        System.out.format("\n%s Information:\n", vehicles[0].getName());
        System.out.format(INT_ROW, String.format("Total %ss:", vehicles[0].getName()), numVehicles);
        
        System.out.format(INT_ROW, "Minimum Price:", getMaxMinPrice(true));
        System.out.format(INT_ROW, "Maximum Price:", getMaxMinPrice(false));
        System.out.format(DOUBLE_ROW, "Average Price:", getAveragePrice());
        System.out.format(INT_ROW, "Minimum Mileage:", getMaxMinMileage(true));
        System.out.format(INT_ROW, "Maximum Mileage:", getMaxMinMileage(false));
        System.out.format(DOUBLE_ROW, "Average Mileage:", getAverageMileage());
        System.out.format(INT_ROW, "Minimum Year:", getMaxMinYear(true));
        System.out.format(INT_ROW, "Maximum Year:", getMaxMinYear(false));
        System.out.format(STRING_ROW, "Least Avail. Color:", getColor(true));
        System.out.format(STRING_ROW, "Most Avail. Color:", getColor(false));

        System.out.println(vehicles[0].getHeader());
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
    
    /**
     * Returns the average mileage of all of the vehicles in this collection.
     * @return the average mileage of all of the vehicles in this collection.
     */
    private double getAverageMileage() { //vehicles[x,5]
            double sum=0; 
        for (Vehicle vehicle : vehicles) {
            sum += vehicle.getMileage();
        }
        return (sum/vehicles.length);
       //return 0; // Replace 0 with the appropriate return value or variable
    }
    
    /**
     * Returns the average price of all of the vehicles in this collection.
     * @return the average price of all of the vehicles in this collection.
     */
    private double getAveragePrice() {
        double sum=0; 
        for (Vehicle vehicle : vehicles) {
            sum += vehicle.getPrice();
        }
        return (sum/vehicles.length);
       //return 0; // Replace 0 with the appropriate return value or variable
    }
    
    /**
     * Returns the least available or most available color of the vehicles in this collection.
     * @param leastAvailable True to get the least available color; otherwise, false.
     * @return the least available or most available color of the vehicles in this collection.
     */
    private String getColor(boolean leastAvailable) {
        //generate new empty array for color quantities based on total colors in vehicle class
        int[] localColors = new int[this.vehicles[0].colors.length]; 
        //fill array based on objects colors
        int count = this.vehicles.length;
        int y = 0;
        int z;
        do {
            z= this.vehicles[y].getColor();   //colors[z]++   where z = vehicles[y].getColor()
                localColors[z]++;
                y++;
                count--;
        } while (count > 0);
//        int ind =0;
//        do {
//            System.out.println(localColors[ind] +" "+ ind);
//            ind++;
//        } while (ind < localColors.length);
        //determine largest or smallest quantity in array
        int index=0;        
        int value = localColors[index];
        //test if smaller
        if(leastAvailable==true)
            //for (int pos : localColors ) {
            for(int x = 1; x<localColors.length; x++ ){
                if(localColors[x]<value){
                value=localColors[x];
                index = x;
            }
        }
        //test if larger
        else
            for(int x = 1; x<localColors.length; x++ ){
                if(localColors[x]>value){
                value=localColors[x];
                index = x;}
        }
        //return largest or smallest color based on index value
        return this.vehicles[0].colors[index] + " (" + value + ")";   
        }
     
    
    /**
     * Returns the minimum or maximum mileage of the vehicles in this collection.
     * @param minimum True to get the minimum mileage; otherwise, false.
     * @return the minimum or maximum mileage of the vehicles in this collection.
     */
    private int getMaxMinMileage(boolean minimum) {
    int value = vehicles[0].getMileage();
        if(minimum==true)
            for(int x = 1; x<vehicles.length; x++ ){
                if(vehicles[x].getMileage()<value){
                value=vehicles[x].getMileage();
            }
        }
        //test if smaller
        else
            for(int x = 1; x<vehicles.length; x++ ){
                if(vehicles[x].getMileage()>value){
                value=vehicles[x].getMileage();
            }
        }
               //test if larger
        return value;
        }

    
    /**
     * Returns the minimum or maximum price of the vehicles in this collection.
     * @param minimum True to get the minimum price; otherwise, false.
     * @return the minimum or maximum price of the vehicles in this collection.
     */
    private int getMaxMinPrice(boolean minimum) {
    int value = vehicles[0].getPrice();
        if(minimum==true)
            for(int x = 1; x<vehicles.length; x++ ){
                if(vehicles[x].getPrice()<value){
                value=vehicles[x].getPrice();
            }
        }
        //test if smaller
        else
            for(int x = 1; x<vehicles.length; x++ ){
                if(vehicles[x].getPrice()>value){
                value=vehicles[x].getPrice();
            }
        }
               //test if larger
        return value;
        }
    
    /**
     * Returns the minimum or maximum year of the vehicles in this collection.
     * @param minimum True to get the minimum year; otherwise, false.
     * @return the minimum or maximum year of the vehicles in this collection.
     */
    private int getMaxMinYear(boolean minimum) {
    int value = vehicles[0].getYear();
        if(minimum==true)
            for(int x = 1; x<vehicles.length; x++ ){
                if(vehicles[x].getYear()<value){
                value=vehicles[x].getYear();
            }
        }
        //test if smaller
        else
            for(int x = 1; x<vehicles.length; x++ ){
                if(vehicles[x].getYear()>value){
                value=vehicles[x].getYear();
            }
        }
               //test if larger
        return value;
        }
    
    /**
     * Returns the total number of vehicles stored in this collection.
     * @return the total number of vehicles stored in this collection.
     */
    public int getTotal() {
        return vehicles.length;
    }
}