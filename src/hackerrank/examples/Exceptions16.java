package hackerrank.examples;

public class Exceptions16 {
    //checked (during run time - syntax) 
    //vs. 
    //unchecked (when program is executed - logic) exceptions
    
    //if we don't handle the error, we must declare it via the "throws" keyword 
    //this means we'll handle this error higher up in the program

    public static void main(String[] args) {
        try {//try clause
            //int[] c = new int[5];
            int[] d = new int[6];
            //System.out.println("Element 6 at 5 = " +c[5]);
            System.out.println("Element 6 at 5 = " + d[5]);
        } catch (ArrayIndexOutOfBoundsException e) { //catch clause
            System.out.println("Exception thrown" + e);
        } finally {//finally clause - no matter what happens, this executes
            System.out.println("Finally finished try-catch");
        }
       //System.out.println("Finally finished try-catch");
    }
}
