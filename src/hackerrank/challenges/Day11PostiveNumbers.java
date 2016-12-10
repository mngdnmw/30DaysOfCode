//package hackerrank.challenges;
//
//import java.util.Scanner;
//
//public class Day11PostiveNumbers {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(
//                "1 1 1 0 0 0\n" +
//"0 1 0 0 0 0\n" +
//"1 1 1 0 0 0\n" +
//"0 0 2 4 4 0\n" +
//"0 0 0 2 0 0\n" +
//"0 0 1 2 4 0");
//
//        int arr[][] = new int[6][6];
//        int max = -63, sum = 0;//the minimum summation of 7 cells in the hour glass is -9*7 = -63
//
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++) {
//                arr[j][i] = scan.nextInt(); //not arr[i][j]
//                //System.out.println(String.valueOf(arr[j][i]));
//            }
//        }
//
//        for (int x = 0; x < 4; x++) {
//            for (int y = 0; y < 4; y++) {
//
//                sum = arr[x][y] + arr[x + 1][y] + arr[x + 2][y]
//                        + arr[x + 1][y + 1]
//                        + arr[x][y + 2] + arr[x + 1][y + 2] + arr[x + 2][y + 2];
//
////                   System.err.println(String.valueOf(arr[x][y]) + arr[x + 1][y] + arr[x + 2][y]);
////                    System.err.println(" " + arr[x + 1][y + 1]);
////                    System.err.println(String.valueOf(arr[x][y + 2]) + arr[x + 1][y + 2] + arr[x + 2][y + 2]);
////                    System.err.println("");
////                    System.err.println("Sum: " + sum);
////                    System.err.println("");
////                    System.err.println("");
//                if (sum > max) {
//                    max = sum;//this needs to be in here rather than outside 
//                  
//                    //of the nested loop because the max won't update as it 
//                    //goes through the loop
//                }
//            }
//        }
//        System.out.println(max);
//    }
//    
//}
//
