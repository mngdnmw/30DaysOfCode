package hackerrank.challenges;

import java.util.Scanner;

/**
 *
 * @author meng
 */
public class Day26
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //Read dates as strings and save them into string arrays
        String[] actual = scan.nextLine().split("\\s+");
        String[] expected = scan.nextLine().split("\\s+");

        //Converts the string arrays to int arrays
        int[] actualReturn = new int[actual.length];
        int i = 0;
        for (String date : actual)
        {
            actualReturn[i] = Integer.parseInt(date);
            i++;
        }

        int[] expectedReturn = new int[expected.length];
        int j = 0;
        for (String date : expected)
        {
            expectedReturn[j] = Integer.parseInt(date);
            j++;
        }

        int diffInYears = expectedReturn[2] - actualReturn[2];
        int diffInMonths = expectedReturn[1] - actualReturn[1];
        int diffInDays = expectedReturn[0] - actualReturn[0];

        int fine = 0;

        //Early return in terms of the year
        if (diffInYears>0)
        {
            fine = 0;
        }
        //Returned in the same year
        else if (diffInYears == 0)
        { 
            //System.out.println("here year");
            fine = 500 * diffInMonths*-1;

            //Checks if returned in the same month
            if (diffInMonths >= 0)
            {
                System.out.println("here month");
                fine = 15 * diffInDays*-1;

                //Checks if returned in the same month
                if (diffInDays >= 0)
                {
                  //System.out.println("here day");
                    fine = 0;
                }

            }

        }
        //Late return in terms of the year
        else
        {
            fine = 10000;
        }

//        System.out.println(diffInYears);
//        System.out.println(diffInMonths);
//        System.out.println(diffInDays);
        System.out.println(fine);
    }

}
