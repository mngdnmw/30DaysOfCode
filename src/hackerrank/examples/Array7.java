package hackerrank.examples;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Meng
 */
public class Array7 {
//
    public Array7() {
        
        /**
         * Ways to intialise an array.
         * Must always specify what is going into the array (e.g. int, string, 
         * char etc.) because only one data type can go into an array
         */
        int[] intArray1; //we haven't technically initialised the arrary yet
        int[] intArray2 = new int[4]; //initialises a new 4 call empty array 
        printArray(intArray2);
        int[] intArray3 = {7, 4, 6, 9, 7}; //initialises a new array by adding 
                                           //the values to it 
        
        String[] stringArray1 ={"bananas", "apples", "pears"}; 
        //same as the int array previously, but with strings
        
        System.out.println(Arrays.toString(intArray2));
        //prints out 4 zeros because there is nothing in the array
        System.out.println(Arrays.toString(intArray3));
        //prints out what we put in the array in the set order we put them in
        
        //index  0   1   2   3  
        //array [10, 8,  5, 1] ------> length of 4
        //if you're trying to access or point to an index outside of the array, 
        //for example -1th index of an array (which does not exist) then you'll 
        //get a null pointer
        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 1;
        
        //custom print out arrays
        printArray(intArray2);
        printArray(intArray3);
        
        //retrieve objects
        System.out.println(Array.get(intArray3, 0));
        System.out.println(intArray2[3]);//just a different way of retrieving
        
        //given functions
        Arrays.sort(intArray3);//changes the way the array is arranged given the 
        //algorithm, which here is in ascending order
        printArray((intArray3));
        System.out.println(intArray3);//we can't just say 
        //System.out.println(intArray3) because that just prints the object's 
        //class name representation, then "@" followed by its hashcode -
        //I@7852e922. So we have to convert it to string first (as above).
        
        printArray(stringArray1);//this still works, but the code has low 
        //cohesion. However, we won't solve this until later with interfaces.
        
        for (String s : stringArray1) {//an enhanced for loop, which says 
            //that for each item within the stringArray1 called s, we'll do 
            //something
            System.out.print("Hi ");//there are 3 items in the list, so we'll
            //print out hi 3 times
            System.out.print(s+" ");//print out each item in the array
            //prints out: "Hi bananas Hi apples Hi pears"
            
        }

    }
    
    public static void printArray(int[] array) {//also made a mistake when I 
        //tried to print stringArray1, because a string cannot be converted to 
        //an int, so we have to make another method to print a string array
        System.out.print("[");//made a mistake here to println rather than just 
        //print, so everything was printed on a new line
        for (int i = 0; i < array.length; i++) {
            int item = array[i]; //we're going to get whatever is at index i 
            //and put it in item
            System.out.print(item);
            if(i<array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void printArray(String[] array) {//but this is bad, because we
        //are essentially duplicating the method above
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            String item = array[i]; 
            System.out.print(item);
            if(i<array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
//    public static void main(String[] args) {
//        
//        /**
//         * Ways to intialise an array.
//         * Must always specify what is going into the array (e.g. int, string, 
//         * char etc.) because only one data type can go into an array
//         */
//        int[] intArray1; //we haven't technically initialised the arrary yet
//        int[] intArray2 = new int[4]; //initialises a new 4 call empty array 
//        int[] intArray3 = {3, 4, 5, 6, 7}; //initialises a new array by adding 
//                                           //the values to it 
//        
//        String[] stringArray1 ={"bananas", "apples", "pears"}; 
//        //same as the int array previously, but with strings
//        
//        System.out.println(Arrays.toString(intArray2));
//        System.out.println(Arrays.toString(intArray3));
//    }
    
}
