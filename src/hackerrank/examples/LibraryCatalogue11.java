package hackerrank.examples;

import java.util.*;

public class LibraryCatalogue11 {
    
    Map<String,Book11> bookCollection = new HashMap<String,Book11>(); 
    //Book needs to be capitalised because it is the class
    //<> are called carrots, open and close
    
    //properties/fields/global variables
    int currentDay = 0;
    int lengthOfCheckOutPeriod =7;
    double initialLateFee = 0.5;
    double feePerLateDay = 1.00;
    
    //constructor 1
    public LibraryCatalogue11(Map<String,Book11> collection) {
        this.bookCollection = collection;
    }

    //constructor 2
    public LibraryCatalogue11(Map<String, Book11> collection, 
            int lengthOfCheckOutPeriod, double initalLateFee, 
            double feePerLateDay) {
        this.bookCollection = collection;
        this.lengthOfCheckOutPeriod = lengthOfCheckOutPeriod;
        this.initialLateFee = initalLateFee;
        this.feePerLateDay = feePerLateDay;
    }
    
    //getters
     public int getCurrentDay() {
        return currentDay;
    }
     
    public Map<String, Book11> getBookCollection() {
        return bookCollection;
    }
   
    public Book11 getBook(String bookTitle){
        return getBookCollection().get(bookTitle);    
    }
    
    public int getLengthOfCheckOutPeriod() {
        return lengthOfCheckOutPeriod;
    }
           
    public double getInitialLateFee() {
        return initialLateFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }
    
    //setters
    public void nextDay(){
        currentDay++;
    }
    
    public void setDay(int day){
        currentDay = day;
    }
    
    //instance methods
    public void checkOut(String title){
        Book11 book = getBook(title);
        if(book.getIsCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        }
        else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out " 
                    +title
                    +". It is due on day "
                    +(getCurrentDay() 
                    +getLengthOfCheckOutPeriod())
                    +".");
        }
    }

    public void returnBook(String title) {
        Book11 book = getBook(title);
        int daysLate = currentDay
                - (book.getDayCheckedOut()
                + getLengthOfCheckOutPeriod());
        if (daysLate > 0) {
            System.out.println("You owe the library $"
                    + (getInitialLateFee()
                    + daysLate * getFeePerLateDay()
                    + " because your book is "
                    + daysLate
                    + " days overdue."));
        }
        else {
            System.out.println("Book returned, thank you");
        }
        book.setIsCheckedOut(false, -1);
    }

    public void sorryBookAlreadyCheckedOut(Book11 book) {
        System.out.println("Sorry "
                + book.getTitle()
                + "is already checked out. It should be back on day "
                + (book.getDayCheckedOut()
                + getLengthOfCheckOutPeriod()) + ".");

    }
     
//    public void setBookCollection(Map<String, Book11> bookCollection) {
//        this.bookCollection = bookCollection;
//    }
//
//    public void setInitialLateFee(double initialLateFee) {
//        this.initialLateFee = initialLateFee;
//    }
//    public void setLengthOfCheckOutPeriod(int lengthOfCheckOutPeriod) {
//        this.lengthOfCheckOutPeriod = lengthOfCheckOutPeriod;
//    }
//
//    public void setFeePerLateDay(double feePerLateDay) {
//        this.feePerLateDay = feePerLateDay;
//    }
//    
//     public void setCurrentDay(int currentDay) {
//        this.currentDay = currentDay;
//    }
    public static void main(String[] args) {
        Map<String, Book11> bookCollection = new HashMap<String,Book11>();
        Book11 harry = new Book11("Harry Potter", 23462424, 99999);
        bookCollection.put("Harry Potter", harry);
        LibraryCatalogue11 lib = new LibraryCatalogue11(bookCollection);
        lib.checkOut("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOut("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOut("Harry Potter");
        
    }
    
}
