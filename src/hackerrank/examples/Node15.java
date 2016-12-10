package hackerrank.examples;

public class Node15 {
    //Properties
    Node15 next;
    int data; //All data in our nodes have to be an int

    public Node15(int newData) {
        data = newData;
        next = null;
    }

    public Node15(int newData, Node15 newNext) {
        data = newData;
        next = newNext;
    }
    
    public int getData(){
        return data;
    }
    
    public Node15 getNext(){
        return next;
    }
    
    public void setData(int newData){
        data = newData;
    }
    
    public void setNext(Node15 newNode) {
        next = newNode;
    }
}
