
package hackerrank.examples;


public class Recursion9 {

    public Recursion9() {
        
        /**
         *  f(f(f(a)))    
         * 
         *  given a=20 and f(a) = 5 + a 
         *  f(20) = 5 + 20 = 25
         *  that means f(f(f(20))) is the same as f(f(25))
         *  
         *  f(25) = 5 + 25 = 30
         *  that means f(f(25)) is the same as f(30)
         * 
         *  f(30) = 5 + 30 = 35
         *  that means f(30) is the same as 35
        **/
        
    }
    
    //if it is static, then we don't need to make an instance of Recursion9 
    //to use it, we're just using the function
    public static int Summation (int n) { 
        //example: 3 + 2 + 1. In main method we call Summation(3);
        
        //Base case - at the end point
        if (n<=0){ //if n is less than or equal to zero, that means we are at
            //the end and that we should return 0
            return 0;//addative identity property - what we use if we want to 
            //         get the same thing again
            //1. 3 is not less or equal to 0, so it will go to the recursive 
            //2. case now n = 2. Remember Summation(n) = n + Summation(n-1) => 
            //   Summation(3)=3+Summation(2). 2 is still greater than 0, so we 
            //   go to recursive case
            //3. now n = 1, so go to recursive case
            //4. now n = 0, so return 0. Summation(0)=0
        }
        //Recursive case - keep going
        else { //otherwise we're not at the end and we should return something 
            //else
            return n + Summation(n-1);
            //1. 3+Summation(3-1) = 3+Summation(2) 
            //   so we have to keep going, because we haven't reached the base 
            //   case
            //2. 3+2+Summation(2-1) = 3+2+Summation(1). Keep going, n is still 
            //   greater than 0
            //3. 3+2+1+Summation(1-1) = 3+2+1+Summation(0). Now we have reached 
            //   the base case
        }
        
        //so all together, we have 3+2+1+0 = 6 = Summation(3)
        
    }
    
    public static int Factorial(int n) {
        //example: 4! = 4*3*2*1. In main we call Factorial(4)
        
        //base case
        if(n<=1){//multiplicative identity 
            return 1;
            //1. 4>1, so go to recursive case
            //2. 3>1, go to recursive case
            //3. 2>1, go to recursive case
            //4. 1=1, return 1. Summation(1)=1. Together: Factorial(4)=4*3*2*1
        }
        //recursive case
        else{
            return n*Factorial(n-1);
            //1. 4*Factorial(3)
            //2. 4*3*Factorial(2)
            //3. 4*3*2*Factorial(1)
        }
        
    }
    
    public static int Exponentiation(int n, int p) {
        //example: 5^3 = 5*5*5. In main we call Exponentiation(5, 3)
        
        //base case
        if(p<=1) {//multiplicative identity
            return 1; 
            //1. p=3>1, go to recursive case
            //2. p=2>1, go to recursive case
            //3. p=1=1, return 1. Exponentiation(1) = 1. So together 5*5*5*1
        }
        
        //recursive case
        else{
            return n*Exponentiation(n, p-1);
            //1. n=5, so n*Exponentiation(5, 3-1) = 5*Exponentiation(5, 2), not
            //   at base case because p>1
            //2. 5*5*Exponentiation(5, 2-1) = 5*5*Exponentiation(5, 1), go to 
            //   base case
        }
        
    }
}
