package hackerrank.examples;

import java.util.LinkedList;
import java.util.Stack;

public class Queue18 {

    LinkedList queue;

    //Making a queue instance
    public Queue18() {
        queue = new LinkedList();
    }

    //Is our queue empty?
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    //What is the size of our queue?
    public int size() {
        return queue.size();
    }

    //Add n to the back of our list - enqueuing an item
    public void enqueue(String n) {
        queue.addLast(n);
    }

    //Removing n at the front of our list - dequeuing an item
    public String dequeue() {
        return (String) queue.remove(0);
    }

    //Peek at the first item
    public String peek() {
        return (String) queue.get(0);
    }

    public static void main(String[] args) {
//        Queue18 numberQueue = new Queue18();
//        numberQueue.enqueue(5);
//        numberQueue.enqueue(6);
//        numberQueue.enqueue(7);
//        System.out.println("First out: "+numberQueue.dequeue());
//        System.out.println("Peek at second item: "+numberQueue.peek());
//        System.out.println("Second out: "+numberQueue.dequeue());
//        System.out.println("Third out: "+numberQueue.dequeue());
//        
//        Queue18 stringQueue = new Queue18();
//        stringQueue.enqueue("hi");
//        stringQueue.enqueue("there");
//        System.out.print(stringQueue.dequeue()+" ");
//        System.out.print(stringQueue.dequeue()+".");
//          
          Stack<String> stack = new Stack<>();
          stack.push("there");
          stack.push("hi");
          System.out.println(stack.pop()+" ");
          System.out.println("Peek: " +stack.peek());
          System.out.println(stack.size()+"!");
          System.out.println("Size: " +stack.size());
          

            
    }
}
