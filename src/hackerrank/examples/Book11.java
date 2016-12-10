package hackerrank.examples;

public class Book11 {
    
    //properties, fields, global variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;//whether the book is checked out
    int dayCheckedOut = -1;

    //constructor
    public Book11(String bookTitle, int bookPageCount, int ISBN) {
        this.title = bookTitle; // the title of this object of this book we are 
        //creating will be set to bookTitle, which is what we passed in
        this.pageCount = bookPageCount;
        this.ISBN = ISBN;
        isCheckedOut = false;
    }
    
    //getters & setters - instance methods which allow you to get certain 
    //properties of the instance to let you know their values
    //getters
    public String getTitle() {
        return this.title;//code inside the brackets are called implementation
    } 

    public int getPageCount() {
        return this.pageCount;
    } 

    public int getISBN() {
        return this.ISBN;
    }

    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }

    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }

    //setters
    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);  
    }
    
    private void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }
    
//    public void setISBN(int ISBN) {
//        this.ISBN = ISBN;
//    }
//    
//    public void setTitle(String title) {
//        this.title = title;
//    }
//    
//    public void setPageCount(int pageCount) {
//        this.pageCount = pageCount;
//    }

   
    
}
