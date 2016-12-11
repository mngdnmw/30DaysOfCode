package hackerrank.challenges;

public class Day19Calculator implements Day19AdvancedArithmetic{

    @Override
    public int divisorSum(int n) {
        
        //int[] a = new int[n];- don't need to make an int array
        //int sum = IntStream.of(a).sum(); which means we don't need to sum the array
        int sum =0; //sets the sum to zero initally
        for (int i = 1; i <=n; i++) { //have a for loop that starts at 1 because 
            //other than 0/0, there won't be any integer that is evenly divisible 
            //by 0. It's also pointless because adding a zero won't change the sum
            if (n%i==0){//modulo of zero means n is evenly divisible by i
                //a[i] = i;  
                sum=sum+i; //if it is evenly divisible, we want to add i to our sum
            }
            //else
                //return sum;
            
        }
        return sum;
    }
    
}
