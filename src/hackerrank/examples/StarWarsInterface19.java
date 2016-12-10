package hackerrank.examples;

import java.util.Random;

public class StarWarsInterface19 {

    //A collection of abstract methods
    //Template of functionality - contains no implementations or constructors
    //Normally you use interface to show a certain funcationality 
    //- e.g. the comparable interface
    
    //Interfaces can extend other interfaces - same type of idea as inheritance
    //Interface character{}
        //Interface Jedi extends Character{}
        //This lets you have different ranks of Jedis
    //The only way to use an interface is to create a class that implements that
    //interface
    //You can't instantiate just an interface becuase there are no constructors 
    //and if there are no constructors then you can't make instances of it
    //You implement an interface but extend a class
    
    public static Character19 summonCharacter() {
        Random r = new Random();
        if (Math.abs(r.nextInt()) % 2 == 0) {
            return new Enemy19();
        } else {
            return new Hero19();
        }
    }

    public static void main(String[] args) {
        Enemy19 darthVader = new Enemy19();
        Hero19 obiWanKenobi = new Hero19();
        darthVader.attack();
        obiWanKenobi.attack();
        darthVader.heal();
        obiWanKenobi.heal();
        System.out.println("Enemy weapon: " + darthVader.getWeapon());
        System.out.println("Hero weapon: " + obiWanKenobi.getWeapon());

        Character19 spy = summonCharacter();
        spy.attack();
        spy.heal();
        spy.getWeapon();

    }

}
