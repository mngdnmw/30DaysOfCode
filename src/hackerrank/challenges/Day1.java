package hackerrank.challenges;

import java.util.Scanner;

public class Day1 {

    public Day1() {
   
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";
		
    Scanner scan = new Scanner(System.in);
    
    /* Declare second integer, double, and String variables. */
    int x = 12;
    double y = 4.0;
    String z = "is the best place to learn and practice coding!";

    /* Read and save an integer, double, and String to your variables.*/
    x  = scan.nextInt();
    y  = scan.nextDouble();

    scan.nextLine ();
    z  = scan.nextLine();

    /* Print the sum of both integer variables on a new line. */
    System.out.println (""+(i+x));

    /* Print the sum of the double variables on a new line. */
    System.out.println (""+(d+y)); 
		
    /* Concatenate and print the String variables on a new line; the 's' variable above should be printed first. */
    System.out.println (""+s+z);
  
    scan.close();
    }
}
