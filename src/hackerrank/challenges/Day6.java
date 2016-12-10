
package hackerrank.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Day6 {

    public Day6() 
    {
        Scanner scan = new Scanner(System.in);
        //Scans in the first line: an int that indicates how many test cases (i.e. rows of words) there will be.
        int T = scan.nextInt();
        
        for (int i=0; i<T; i++)
        {
            //Scans in the next line of string.
            scan.nextLine();
            /**
            *Creates a new character array called inputString, which gets its input from the scanner(called scan). 
            *The scanner scans the string and converts it to a character array.
            **/
            char[] string = scan.next().toCharArray();
            
            /**
            *Have never used a StringBuilder before, but I couldn't just do this:
            *   String evenString = "";
            *   String oddString = "";
            **/
            StringBuilder evenString = new StringBuilder();
            StringBuilder oddString = new StringBuilder();
            
            /**
            *The loop runs through the length of the string. Starting at 0, then counts up in 2s. At every even 
            *index of the string, it adds the character to the character array and then adds it to the evenString.
            **/
 
            for (int j=0; j<string.length; j+=2)
            {
                evenString.append(string[j]);
            }
            
            /**
            *Similar to the previous for loop, this runs through the length of the string but starting at 1, then
            *counts up in 2s. Which means at every odd index of the string, it adds the character to the character
            * array and then adds it to the oddString.
            **/
            
            for (int j=1; j<string.length; j+=2)
            {
                oddString.append(string[j]);
            }
            
            System.out.println(evenString + " " + oddString);
 
        }
        
        scan.close();
    }
}

/**
*Notes - had a lot of problems with this. Initially, I didn't read the problem very well, didn't realise that the *first input was an int, which indicated the number of test cases. Secondly, didn't realise that I had to convert *the characters to a single string before printing them (so I ended up just printing the characters seperately on a *new line - however, the ordering was right, which meant I got the math correct). Thirdly, have never used string
*builder or character strings before. 
**/

//    public Day6() {
//        
//    
//        Scanner scan = new Scanner(System.in);
//        int x = scan.nextInt();
//        String s;
//
//        for(int i=0;i<x;i++)
//        {
//            s = scan.next();
//            
//            for(int j=0;j<s.length();j++)
//            {
//                if(j%2 ==0)
//                {
//                    System.out.print(s.charAt(j));
//                }
//            } 
//            System.out.print(" ");
//            
//            for(int j=0;j<s.length();j++)
//            {
//                if(j%2==1)
//                {
//                    System.out.print(s.charAt(j));
//                }
//
//            }
//        System.out.println();
//        }
//    }
//}
    
//    public void testing1()
//    {    
//        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
//
//        char[] myCharArray = input.toCharArray();
//        String evenString = "";
//        String oddString ="";
//
//        for (char i = 0; i < myCharArray.length; i++) 
//        {
//            if (i%2==0) 
//                evenString+=myCharArray[i];
//            else
//                oddString+=myCharArray[i];
//
//        System.out.println(evenString+ oddString);
//    }
// 
