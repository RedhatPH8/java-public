/*
* Author: Ryan Geddings N01067534
* Course: COP2551
* Homework #: 4
* Title : Leap Year Determinator
* Due Date: 2/14/2016
*
* Determines if a given year is a leap year or not.
*/
package cop2331_hw4_leapyeardeterminator;

        
    import java.util.Scanner;


/**
 *
 * Determines if a given year is a leap year or not.
 */
public class COP2331_HW4_leapyeardeterminator {

 
    public static void main(String[] args) 
    {
       //Displays user name and assignment
        System.out.println("Ryan Geddings, N01067534\nHomework 4 Leap Year");
        
       //Initilizing program
        Scanner input = new Scanner(System.in);
        int year, min = 1900, max = 2030;
        
       //Get User input
         System.out.print("\nEnter a year between 1900 and 2030: ");
         year = input.nextInt();
        
       //Verify user input and determines if leap year or not 
       if (withinRange(year, min, max))
           if (((year % 400) == 0) || ((year % 4) == 0 && (year % 100) != 0))
             System.out.println(year + " is a leap year.");
          else
               System.out.println(year+" is not a leap year.");
       }

         
         
/**
* Determines if year is within range
* @param year The year entered. 
* @param min The minimum range. 
* @param max The maximum range.
* @return is within range (true) or not in range (false).
* 
*/
      
    
           public static boolean withinRange(int year,int min,int max){

            if ((year >= min) && (year <= max)){
                return true;
            }
            else if ((year < min) || (year > max)){
                System.err.println("Year not in range");
            }
               return false;
                       }
}