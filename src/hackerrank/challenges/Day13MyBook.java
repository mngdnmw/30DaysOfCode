package hackerrank.challenges;

public class Day13MyBook extends Day13Book{
    
    int price;
    
    public Day13MyBook(String t, String a, Integer p) {
        super(t, a);
        price = p;
    }

    @Override
    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + Integer.toString(this.price));
    }
    
}
