package hackerrank.examples;

import java.util.LinkedList;

public class LinkedList15 {
    //Advantages. Linked lists are a dynamic data structure, 
    //which can grow and be pruned, allocating and deallocating memory while 
    //the program is running
    
    //properties
    Node15 head;
    int count;
    
//    //constructors
//    public LinkedList15() {
//        head = null;
//        count =0;
//    }
    
    public LinkedList15(Node15 newHead){
        head = newHead;
        count =1;
    }
    
    //methods
    //add
    public void add(int newData){
        Node15 temp = new Node15(newData);
        Node15 current = head;
        while(current.getNext() != null){
            current = current.getNext();   
        }
        current.setNext(temp);
        count++;
    }
    //get
    public int get(int index){
        if (index<=0){
            return -1;
        }
        Node15 current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }
    
    //size
    public int size(){
        return count;
    }
    
    //isEmpty
    public boolean isEmpty(){
        return head == null;
    }
    
    //remove
    public void remove(){
        //remove from the back of the list
        Node15 current = head; 
        while(current.getNext().getNext()!=null){
            current=current.getNext();
        }
        current.setNext(null);
        count--;
    }
    
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("alice");
        System.out.println(linkedlist);
    }
}
