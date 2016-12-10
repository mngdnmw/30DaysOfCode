package hackerrank.examples;

/**
 *
 * @author Meng
 */
public class Enemy19 implements Character19 {

    public String weapon = "Lightsaber";

    @Override//you don't necessarily need this override because 
    //you can see which methods in here matches which method in the interface,
    //but it might be nice for other people to read
    public void attack() {
        System.out.println("The enemy attacks you!");
    }

    public void heal() {
        System.out.println("The enemy heals himself!");
    }

    public void weaponDraw() {
        System.out.println("");
    }

    public String getWeapon() {
        return weapon;
    }
}
