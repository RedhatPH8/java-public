/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw8;

/**
 *
 * @author geddi
 */
import java.util.Arrays;
import java.util.Random;

public class HW8 {

    static int[] values = new int[15];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ryan Geddings, N01067534\nHomework 8");
        System.out.println("\nContents of the Array (unsorted):");
        populateArray(values, 10, 1000);
        System.out.println(Arrays.toString(values));
        System.out.println("\nContents of the Array (sorted):");
        bubbleSort(values);
        System.out.println(Arrays.toString(values));
    }
    /**
     * 
     * @param array
     * @param seed
     * @param maxValue 
     */
    public static void populateArray(int[] array, int seed, int maxValue) {
        Random rng = new Random(seed);
        for (int index = 0; index < array.length; index++) {
            array[index] = rng.nextInt(maxValue);
        }
    }
    /**
     * 
     * @param array 
     */
    public static void bubbleSort(int[] array) {
        int count = 0;
        for (int y = 0; y < array.length; y++) {				//traversal loop
            for (int x = 0; x <= array.length-1; x++) {			//comparison loop
                count++;
                if (array[x] > array[x + 1]) {
                    swap(array, x, x + 1);
                }
            }
        }
    }
    /**
     * 
     * @param array
     * @param pos1
     * @param pos2 
     */
    public static void swap(int[] array, int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }
}
