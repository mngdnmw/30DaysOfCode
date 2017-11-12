package hackerrank.examples;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author meng
 */
public class User28
{

    String username;
    String password;
    int age;
    Set<Integer> orderIds;

    public User28(String custName, String custP, int custAge, Set<Integer> orderIds)
    {
        this.username = custName;
        this.password = custP;
        this.age = custAge;
        this.orderIds = orderIds;
    }
    
    public static void main(String[] args)
    {
        Set a = new HashSet();
        a.add(1212);
        User28 m = new User28("Me", "Hi", 10, a);
        
    }
}
