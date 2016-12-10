
package hackerrank.examples;

import java.util.HashMap;
import java.util.Map;

public class Maps8 {

    public Maps8() {
        //I had to put this directly in the constructor, because there was no psvm
        //Couldn't just put these in the public class Maps8
        
        //English to Spanish dictionary
        
        //String is the datatype of our key, our value is also going to be string
        Map<String,String> engSpanDic = new HashMap<String, String>();
        
        //Put stuff in the dictionary (Key, Value)
        engSpanDic.put("Monday", "Lunes");
        engSpanDic.put("Tuesday", "Martes");
        engSpanDic.put("Wednesday", "Miércoles");
        engSpanDic.put("Thursday", "Jueves");
        engSpanDic.put("Friday", "Viernes");
        engSpanDic.put("Saturday", "Sábado");
        engSpanDic.put("Sunday", "Domingo");
        
        //Retrieve thigns from our dictionary
        System.out.println(engSpanDic.get("Monday"));
        System.out.println(engSpanDic.get("Tuesday"));
        System.out.println(engSpanDic.get("Wednesday"));
        System.out.println(engSpanDic.get("Thursday"));
        System.out.println(engSpanDic.get("Friday"));
        
        //Print out all keys
        System.out.println(engSpanDic.keySet());
        //Print out all values
        System.out.println(engSpanDic.values());
        //Print out size of map
        System.out.println("The size of our dictionary is "+engSpanDic.size());
        
        //Shopping list
        Map<String,Boolean> shoppingList = new HashMap<String, Boolean>();
        
        //Put stuff in our dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE); //same as writing true, but 
        //it refers to the boolean object, which has the property of true 
        //(which is in green) rather than just us putting in the primative 
        //values of true
        shoppingList.put("Oreo", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);
        
        //Retrieve items
        System.out.println("We need sugar: " +shoppingList.get("Sugar"));
        System.out.println("We need oreos: " +shoppingList.get("Oreo"));
        
        //Key-value pairs print out. It does not appear in the order we put them in
        System.out.println(shoppingList.toString());
        
        //Is empty?
        System.out.println("The shopping list is empty: "+shoppingList.isEmpty());
        
        //Remove an item from the dictionary
        shoppingList.remove("Eggs");
        System.out.println(shoppingList.toString());
        //Replace vlaues for a certain key
        shoppingList.replace("Bread", Boolean.FALSE);
        System.out.println(shoppingList.toString());
        //Clear dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        
    }

   
}
