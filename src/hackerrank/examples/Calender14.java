package hackerrank.examples;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender14 {
//package: a gorup os similar classes
    //types of packages: 
        //1. user defined, 
        //2. built-in (e.g. java.lang, java.uil, java.oi etc.) 
            //anything not in java.lang has to be imported to be used
    
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0);//today's date
        //cal.add(Calendar.DATE, 100);//100 days from now
        System.out.println(cal.getTime());
        SimpleDateFormat format1 = new SimpleDateFormat("dd-yyyy-MM");
        String formatted = format1.format(cal.getTime());
        System.out.println(formatted);
        
    }

//scope = lifetime & accessibility of a variable 
    // you have a class level, method level, private/public and looping/control 
    // statement level scope
    
    
}
