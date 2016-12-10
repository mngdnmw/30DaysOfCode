package hackerrank.challenges;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day5 {

    public Day5() {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int answer;

        for (int i = 1; i < 11; i++) {
             answer = n*i;
             System.out.println(n+" x "+i+" = "+answer);
            }
        
    }    
        
}
