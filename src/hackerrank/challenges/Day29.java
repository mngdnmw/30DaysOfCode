package hackerrank.challenges;

import java.util.Scanner;

/**
 *
 * @author meng
 */
public class Day29
{
    public static void main(String[] args)
    {
            Scanner scanner = new Scanner(System.in);
            //number of test cases
            int t = scanner.nextInt();
            for (int i = 0; i < t; i++)
        {
            //largest number in the set, starting from 1
            int n = scanner.nextInt();
            //A&B cannot be larger than this number
            int k = scanner.nextInt();
            
            
            //Highest possible value of A&B is k-1 because 
            //"A&B is the maximum possible and also less 
            //than a given integer, K"
            
            //K-1 OR K <= N) is always true in cases where K-1 is even.
            if(((k-1)|k) > n && k%2==0){
                System.out.println(k-2);
            }else{
                System.out.println(k-1);               
            }
            
        }
            
            
    }
}
