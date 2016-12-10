
package hackerrank.challenges;

import java.util.Scanner;

public class Day2 {

    public Day2() {
      
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tipAmount = mealCost * tipPercent/100;
        double taxAmount = mealCost * taxPercent/100;
        double totalCostD = mealCost + tipAmount + taxAmount;
         
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(totalCostD);
      
        // Print your result
        System.out.println("The total meal cost is "+ totalCost + " dollars.");
    }
    
}
