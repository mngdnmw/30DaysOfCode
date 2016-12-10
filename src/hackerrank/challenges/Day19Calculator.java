package hackerrank.challenges;

public class Day19Calculator implements Day19AdvancedArithmetic{

    @Override
    public int divisorSum(int n) {
        
        //int[] a = new int[n];- don't need to make an int array
        //int sum = IntStream.of(a).sum(); which means we don't need to sum the array
        int sum =0; //sets the sum to zero initally
        for (int i = 1; i < n; i++) { //have a for loop that starts at 1 because 
            //
            if (n%i==0){
                //a[i] = i;  
                
            }else
                return n;
            
        }
        return sum;
    }
    
}
