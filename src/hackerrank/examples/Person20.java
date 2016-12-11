package hackerrank.examples;

import static hackerrank.examples.HairColour.*;

public class Person20 {
    HairColour hairColour = BLACK;
    
    public Person20(){
        
    }
    public static void main(String[] args) {
        Person20 peterParker = new Person20();
        Person20 spiderMan = peterParker;//this is aliasing, meaning they are 
        //pointing to the same object in memory
        
        peterParker.hairColour=PINK;
        
        System.out.println("Hair colour of Peter Parker: "+peterParker.hairColour);
        System.out.println("Hair colour of Spiderman: "+spiderMan.hairColour);
        
        //encapsulation - what is created inside a set of {} only lives inside 
        //the {}. When the function ends, our spiderMan, peterParker pointers and 
        //the Person20 objects they point to are no longer needed because there 
        //is no way to access them once the last curly bracket closes (unless 
        //they were declared as instance variables outside and has a reference 
        //to the objects). So essentially this person object has no reference 
        //when the bracket closes and can be deleted, because we don't need it 
        //anymore. It doesn't just sit in memory and Java deallocates memory and 
        //resuses it.
        //Garbage collection in java - deallcoates memory and reuses the space 
        //for something else - helps us not to run out of memory
        //When objects can no longer be access, they are removed by the garbage 
        //collector 
        //The Garbage Collection is a part of the Java Virtual Machine (an abstract
        //computing machine that allows a computer to run Java)
            //1. Specification - what is required for you to run your program?
            //2. Implementation - a program that meets these specification needs
            //3. Instance - an implementation in action (execution) - the 
            //program is compiled into Java byte code 
    }
}
