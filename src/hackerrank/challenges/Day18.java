package hackerrank.challenges;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day18 {

    Queue<Character> queue = new LinkedList();//initialises a new linkedlist 
    //and called it queue
    Stack<Character> stack = new Stack();//initialises a new stack 

    //pushes the character onto the stack
    void pushCharacter(char ch) {
        stack.push(ch);
    }

    //removes the object at the top of the stack
    char popCharacter() {
        return stack.pop();
    }

    //adds the character to our queue (first in - first out)
    void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    //retreives and removes the head character from our queue
    char dequeueCharacter() {
        return queue.remove();
    }

}
