package hackerrank.challenges;

import java.util.Scanner;

/**
 *
 * @author meng
 */
public class Day25

{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //Number of test cases
        int cases = scan.nextInt();

        //Iterates through the number of cases
        for (int i = 0; i < cases; i++)
        {
            boolean prime = true;
            //Scans the integer to check if is prime number
            int n = scan.nextInt();

            if (n == 1)
            {
                System.out.println("Not prime");
            } else
            {
//                //Iterates through all the numbers up to n to see if it is divisible by n
//                for (int j = 2; j < n; j++)
//                {
//                    //Sets the boolean prime to true if n%j has zero remainders
//                    if (n % j == 0)
//                    {
//                        prime = true;
//                    }
//                }

                //If a number is divisable by another number less or equal to the square root of the first number then it is NOT prime. 
                //That is the reason for O(sqrt(n))run time.
                for (int j = 2; j * j <= n; j++)
                {
                    //If divisible
                    if (n % j == 0)
                    {
                        prime =false; 
                    }

                }

                if (prime == true)
                {
                    System.out.println("Prime");
                } else

                {
                    System.out.println("Not prime");
                }

            }
        }

    }

}
