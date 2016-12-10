package hackerrank.challenges;

import java.util.*;
import java.io.*;

public class Day8 {

    public Day8() {
        
        //initialise a new hashmap with nothing inside, and assign the keys
        //to be strings and values to be integers
        Map<String,Integer> phoneBook = new HashMap<String, Integer>(); 
        //things in the <> has to be written out in whole and capitalised
        //this has something to do with how it is stored in memory

        //scans in the info
        Scanner in = new Scanner(System.in);
     
        //scans in the number of people
        int n = in.nextInt();
        //for loop that scans the name and the phone number
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            
            //store the name and phone number into the phonebook
            phoneBook.put(name, phone);
            
        }
        //while loop will only run if the scanner has another token in its input (this method         
        //is a boolean, and returns true if there are more tokens
        while(in.hasNext()){
            //this didn't work, so I found out about the containsKey method and
            //used that instead
//            String s = in.next();
//            int phoneNumber = phoneBook.get(s);
//            if(phoneBook.get(s)==null){
//                System.out.println("Not found");
//            }
//            else{
//                System.out.println(s+"="+phoneNumber);
//            }

           //if statement that looks up to see if the name that has been scanned is a key in             
           //the hashmap. This is a new method I've never used before. Originally I had     
           //tried to use **int phoneNumber = phoneBook.get(s); if(phoneBook.get(s)==null)               
           // do xyz**, but that doesn't work, because essentially I said if the phone     
           //number exists, then print out the info. But you can't return a boolean from an             
           //int, because an int is never null (so it would never print out the info). 
            String s = in.next();
           if(phoneBook.containsKey(s)){
               System.out.println(s+"="+phoneBook.get(s));
           }
           else{
               System.out.println("Not found");
           }
        }
        in.close();
        

    }  
    
}
