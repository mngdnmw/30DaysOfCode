package hackerrank.challenges;

import java.util.Scanner;

/**
 * @author Meng
 */
public class Day20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Scans first line to get the size of the array
        int arraySize = scan.nextInt();
        //Initialise the int array 
        int unsorted[] = new int[arraySize];
        //Scans in each integer into the array
        for (int i = 0; i < arraySize; i++) {
            unsorted[i] = scan.nextInt();
        }
        int numberOfSwaps = 0, temp = 0;
        for (int i = 0; i < arraySize; i++) {
            // Track number of elements swapped during a single array traversal
            for (int j = 0; j < arraySize - 1; j++) {
                // Swap adjacent elements if they are in decreasing order. Unsorted values float to the back of the array
                if (unsorted[j] > unsorted[j + 1]) {
                    temp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = temp;
                    numberOfSwaps++;
                }
            }
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        scan.close();

        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + unsorted[0]);
        System.out.println("Last Element: " + unsorted[unsorted.length - 1]);

    }

}
