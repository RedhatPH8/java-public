/*
    Project 5
    UNFinished Business Owner Management System

    by Ima Java Developer

    Manages owner information.
*/
package project5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
  Manages owner information.
 */
public class Project5 {
    private static final int MAX_OWNERS = 50;
	
	private Collection owners;
    
    public static void main(String[] args) {
        System.out.println("Ima Java Programmer\nProject 5");
        
		// Creates an object of the Project5 class, calls the execute method, and
		// passes the filename of the input file provided in the command-line arguments
        new Project5().execute(args[0]);
    }
    
	/**
     * Creates an object instance of the Project5 class and initializes the owner collection.
     */
    public Project5() {
        owners = new Collection(MAX_OWNERS);
    }
    
	/**
     * Controls the operation of the program.
     * @param filename The path and name of the input data file.
     */
    private void execute(String filename) {
        readFile(filename);
        owners.displayOwners();
        owners.sortData(Collection.LAST_NAME);
        owners.sortData(Collection.MILEAGE);
        owners.sortData(Collection.YEAR);
        owners.sortData(Collection.CITY_STATE);
    }
    
	/**
     * Reads data from the specified input file into the program.
     * @param filename The path and name of the input data file.
     * @return false if an error occurred while reading the file; otherwise, true.
     */
    private void readFile(String filename) {
        String line;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while((line = br.readLine()) != null) {
                owners.add(new Owner(line.split(",")));
            }
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
    }
}