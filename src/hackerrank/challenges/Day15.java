//package hackerrank.challenges;
//
//import java.util.*;
//
//public class Day15 {
//
//    class Node {
//
//        int data;
//        Node next;
//
//        Node(int d) {
//            data = d;
//            next = null;
//        }
//    }
//
//    public static Node insert(Node head, int data) {
//
//        if (head == null) {//if the head node is null, it means the list is empty and so we want to add the int data as the first node and then sets the address of the next node as null
//            return new Node(data);
//        } else if (head.next == null) {//if the address of the node after the head is null, it must mean that that node is the last link, so we will add another node and set the value of the next node to the data we got and the address pointer as null
//            head.next = new Node(data);
//        } else {//if the are more than 2 nodes in the linked list, then we will call the insert method on itself and set the head.next as the head of the node (even though it may be the 3rd node) which means either the head is going to be null or the node after it will (otherwise it will keep traverse through the nodes until it hits the last node)
//            insert(head.next, data);
//        }
//        return head; //every return statement is inside an if statement, so the compiler needs a return for when none of the ifs evaluate true. However it is possible to throw an exception and get out of the method without returning anything
//    }
//
//    public static void display(Node head) {
//        Node start = head;
//        while (start != null) {
//            System.out.print(start.data + " ");
//            start = start.next;
//        }
//    }
//
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        Node head = null;
//        int N = sc.nextInt();
//
//        while (N-- > 0) {
//            int ele = sc.nextInt();
//            head = insert(head, ele);
//        }
//        display(head);
//        sc.close();
//    }
//}
