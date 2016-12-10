package hackerrank.challenges;

public class Day4 {
    
    private int age;

    public Day4(int InitialAge) {
        if (InitialAge > 0) {
            this.age = InitialAge;
        }
        else {
           System.out.println("Age is not valid, setting age to 0.");
           this.age = 0;
        }
    }
   
    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if (age < 13) {
            System.out.println("You are young");
        } 
        else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager");
        }
        else if (age>18) {
            System.out.println("You are old");
        }
    }
  
    public void yearPasses() {
  	// Increment this person's age.
        age++;
	}
    
}
