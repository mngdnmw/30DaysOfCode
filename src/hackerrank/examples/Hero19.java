package hackerrank.examples;

public class Hero19 implements Character19 {

    public String weapon = "The force";

    public void heal() {
        System.out.println("The hero heals you!");
    }

    public void attack() {
        System.out.println("The hero attacks the enemy!");

    }

    @Override
    public String getWeapon() {
        return weapon;
    }

}
