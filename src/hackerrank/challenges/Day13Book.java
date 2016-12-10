package hackerrank.challenges;

abstract class Day13Book {
    String title;
    String author;
    
    Day13Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();
}
