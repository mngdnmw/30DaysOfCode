package hackerrank.examples;

import java.util.concurrent.TimeUnit;

public class HotChoc17 {

    //everything is going to be static in this class because we don't want to 
    //make an instance of HotChoc17 - e.g. have a HotChoc171, HotChoc172 etc.
    //if we did want to do that then we would make the variables not static and 
    //make them set by a constuctor. but we're not going to do that here because
    //the average will never change
    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChoc(double temp) throws TooHotException17, TooColdException17 {
        if (temp >= tooHot) {
            throw new TooHotException17();
        } else if (temp <= tooCold) {
            throw new TooColdException17();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        double currentCocoaTemp = 170;
        boolean wrongTemp = true;

        while (wrongTemp) {
            try {

                drinkHotChoc(currentCocoaTemp);
                System.out.println("This is goodddddd");
                wrongTemp = false;

            } catch (TooHotException17 e1) {

                System.out.println("TOO HOT!");
                currentCocoaTemp = currentCocoaTemp - 5;

            } catch (TooColdException17 e2) {

                System.out.println("TOO COLD!");
                currentCocoaTemp = currentCocoaTemp + 5;

            }
            TimeUnit.SECONDS.sleep(2); //waits two seconds before redoing the loop
           

        }
        System.out.println("...And it's gone");
    }
}
