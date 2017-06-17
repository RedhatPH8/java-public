/*
    Project 4
    UNFinished Business Vehicle Management System

    by Ima Java Developer

    Manages vehicle information.
*/
package project4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Manages vehicle information.
 */
public class Project4 {
    Collection[] vehicles;
    int[] sizes = new int[] {21, 11, 11, 7};
    
    public static void main(String[] args) {
        System.out.println("Ima Java Programmer\nProject 4");
        
        // Create an object of the Project4 class and call the execute method
        new Project4().execute(args[0]);
    }
    
    /**
     * Creates an object instance of the Project4 class and initializes the vehicle collections.
     */
    public Project4() {
        vehicles = new Collection[4];
        
        for(int x = 0; x < vehicles.length; x++) {
            vehicles[x] = new Collection(sizes[x]);
        }
    }
    
    /**
     * Displays information about each class of vehicle.
     */
    private void displayVehicleData() {
        int total = 0;
        
        for(int x = 0; x < vehicles.length; x++) {
            vehicles[x].displayVehicleInformation();
            total += vehicles[x].getTotal();
        }
        System.out.format("\nTotal Vehicles: %d\n", total);
    }
    
    /**
     * Controls the operation of the program.
     * @param filename The path and name of the input data file.
     */
    private void execute(String filename) {
        readFile(filename);
        displayVehicleData();
    }
    
    /**
     * Reads data from the specified input file into the program.
     * @param filename The path and name of the input data file.
     * @return false if an error occurred while reading the file; otherwise, true.
     */
    private boolean readFile(String filename) {
        boolean goodRead = false; // Set the failure condition
        String line;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while((line = br.readLine()) != null) {
                storeVehicle(line.split(","));
            }
            goodRead = true; // Change to pass condition
        }
        catch(FileNotFoundException fnfe) {
            System.out.format("The program could not find the file: %s.\n", filename);
        }
        catch(IOException ioe) {
            System.out.format("An error occurred while reading the file: %s.\n", filename);
        }
        catch(Exception ex) {
            System.out.format("An unexpected error occurred.  Error information: %s.\n", ex.getMessage());
        }
        return goodRead;
    }
    
    /**
     * Stores a vehicle in the appropriate vehicle collection.
     * @param vehicleData The data representing the vehicle being stored.
     */
    private void storeVehicle(String[] vehicleData) {
        switch (Integer.parseInt(vehicleData[0])) {
            case Vehicle.CONVERTIBLE:
                vehicles[0].add(new Convertible(vehicleData));
                break;
            case Vehicle.HATCHBACK:
                vehicles[0].add(new Hatchback(vehicleData));
                break;
            case Vehicle.SEDAN:
                vehicles[0].add(new Sedan(vehicleData));
                break;
            case Vehicle.MINIVAN:
                vehicles[1].add(new Minivan(vehicleData));
                break;
            case Vehicle.SUV:
                vehicles[2].add(new SUV(vehicleData));
                break;
            case Vehicle.TRUCK:
                vehicles[3].add(new Truck(vehicleData));
                break;
        }
    }
}