package hackerrank.challenges;

import java.util.Scanner;

public class Day11Original {

    public Day11Original() {

        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int max = -63, sum = 0;//the minimum summation of 7 cells in the hour glass
        // is -9*7 = -63
//        int sum[] = new int[16];//new int array to store the sum of the hourglass. 
//        //it's been initialised as 16 because the maximum number of 4x4 
//        //hourglasses that can be made in a 6x6 array is 16. this is because 
//        //only 4 new hour glasses can be made per length of the array and 4 new
//        //hour glasses per height of the array.
//        int c = 0; //cell coordinate initialisation for the sum array //the minimum summation of 7 cells in the hour glass
        // is -9*7 = -63
//        int sum[] = new int[16];//new int array to store the sum of the hourglass. 
//        //it's been initialised as 16 because the maximum number of 4x4 
//        //hourglasses that can be made in a 6x6 array is 16. this is because 
//        //only 4 new hour glasses can be made per length of the array and 4 new
//        //hour glasses per height of the array.
//        int c = 0; //cell coordinate initialisation for the sum array 

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[j][i] = scan.nextInt();
            }

            for (int k = 0; k < 4; k++) {
                for (int l = 0; l < 4; l++) {
//                sum[c]= //adds the values of the arr that forms hourglasses and 
//                        //puts them in the sum array
//                        arr[k][l] + arr[k + 1][l] + arr[k + 2][l]
//                        + arr[k + 1][l + 1]
//                        + arr[k][l + 2] + arr[k + 1][l + 2] + arr[k + 2][l + 2];
//                c++; //increases the cell coordinate of the sum array, so that
//                    //it can store the sum of the next hourglass

                    sum = arr[k][l] + arr[k + 1][l] + arr[k + 2][l]
                            + arr[k + 1][l + 1]
                            + arr[k][l + 2] + arr[k + 1][l + 2] + arr[k + 2][l + 2];
                    // System.out.println(i+". "+sum);

                }

                if (sum > max) {
                    max = sum;
                }

            }

        }
        System.out.println(max);
    }
}
