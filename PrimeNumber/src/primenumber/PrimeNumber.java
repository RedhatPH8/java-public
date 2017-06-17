/*
* Author: Ryan Geddings N01067534
* Course: COP2551
* Homework #: 5
* Title : Prime Number Determinator
* Due Date: 3/6/2016
*
* Determines if a number is a prime, and if so how many prime numbers preceed it.
 */
package primenumber;

import java.util.Scanner;
 

/**
*
*Determines if a number is a prime, and if so how many prime numbers preceed it.
*/

public class PrimeNumber {

    public static void main(String[] args) {
/* Initialize program, set max and min input values
*/
        Scanner input=new Scanner(System.in); 
        int value, min = 0, max = 1000;
        
        System.out.println("Ryan Geddings, N01067534\nHomework 5 Prime Numbers\n");
        System.out.print("Enter a number between 0 and 1000: ");
        value = input.nextInt(); 
      
/*
        Determine if input is within range, then if it's a prime number
        */       
        
        withinRange(value, min, max);
       isPrime(value);
           countPrimes(value);
           System.out.println("Exactly " + counter + " prime number(s) exist between 0 and " + value);
    }
    
    public static int counter = 0;
    
    /*
    Count the amount of prime numbers
    */
        public static int countPrimes(int input) {
            int number = 0;
            do
            { 
                if (isPrime(number)){
                    counter++; number++;
                }else number++;
            }while (number <= input);
        return number;
    }
    
    public static boolean isPrime(int testValue) {
    if (testValue <= 1) {
        return false;
       }
       for (int i = 2; i <= Math.sqrt(testValue); i++) {
           if (testValue % i == 0) {
               return false;
           }
       }
       return true;
   }    
    
    /*
    Is input within range
    */
    
    public static boolean withinRange(int value, int min, int max) {
            if ((value >= min) && (value <= max)){
                return true;
            }
            else if ((value < min) || (value > max)){
                System.err.println("Input not in range");
            }
               return false;
                       }
}
