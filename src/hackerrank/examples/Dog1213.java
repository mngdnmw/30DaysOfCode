package hackerrank.examples;

public class Dog1213 extends Animal1213 {

    public Dog1213() {
        super(15);//references the super class, which is animal
        System.out.println("A dog has been created");
    }
    
    public void ruff(){
        System.out.println("The dog says ruff");
        
    }
    
    public void run(){
        System.out.println("A dog is running");
    }

    public void eat() {
        System.out.println("A dog is eating");
    }
    
    //public abstract void eat(); //this would only work if we make Dog1213 abstract,
    //and we'd have to specify a specific type of Dog1213 that detends Dog1213 to have 
    //the eat method (e.g. Poodles, which we will have to make another class for)
        

}
