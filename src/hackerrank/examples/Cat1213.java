package hackerrank.examples;

public class Cat1213 extends Animal1213{

    public Cat1213() {
        super(7);
        System.out.println("A cat has been created");
    }
    
    public void meow(){
        System.out.println("A cat meows");   
    }
    
    public void prance(){
        System.out.println("A cat prances");
    }

    public void eat() {
        System.out.println("A cat eats");
    }

    @Override
    public void sleep(){
        System.out.println("A cat is sleeping");
    }
}
