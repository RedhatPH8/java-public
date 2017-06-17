
package hw7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Hw7 {

    Scanner input = new Scanner(System.in);
    static int[] array =new int [15];
    
    public static void main(String[] args) {
              
        System.out.println("Ryan Geddings, N01067534\nHomework 7");
        System.out.println("\nContents of the Array:");
        populateArray();
        System.out.println("\nThe minimum value " +findMinMax(true) + " is located at index " +search(findMin()));
        System.out.println("The maximum value " +findMinMax(false) + " is located at index " +search(findMax()));
        System.out.printf("The average value of the array is %.2f\n", calcAvg());
        
    }
public static void populateArray(){
    for(int index = 0; index < array.length; index++){
           array[index] = randomFill();
           } 
    System.out.println(Arrays.toString(array));
    
}
public static int search(int value){
    int index = -1;//Flag variable, will also return an error if search value isn't found
    for(int x = 0; x < array.length&&index == -1; x++){ //index ==-1 to stop in case of multiple identical values, also stops search when value found as opposed to checking the whole array 
        if(value==array[x]){
            index = x;
        }
    }
    return index;
}
public static int findMin(){ //look at project 4 for min/mix
    int min = array[0];
        for(int x = 1; x<array.length; x++ ){
            if(array[x]<min){
                min=array[x];
            }
        }
        return min;
}
public static int findMax(){
    int max = array[0];
        for(int x = 1; x<array.length; x++ ){
            if(array[x]>max){
                max=array[x];
            }
        }
        return max;
}
public static int findMinMax(boolean minimum){
    int value = array[0];
        if(minimum==true)
            for(int x = 1; x<array.length; x++ ){
                if(array[x]<value){
                value=array[x];
            }
        }
        //test if smaller
        else
            for(int x = 1; x<array.length; x++ ){
                if(array[x]>value){
                value=array[x];
            }
        }
               //test if larger
        return value;
        }

public static double calcAvg(){
    double sum=0;
    for(int x=0; x<array.length; x++){
        sum += array[x];
    }
        return (sum/array.length);
}
public static int randomFill(){
        Random rand = new Random();
        int randomNum = rand.nextInt(1000);
        return randomNum;
    
}
}