package hackerrank.challenges;

/**
 *
 * @author meng
 */
public class Day24

{

    class Node
    {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }

    }

    public static Node removeDuplicates(Node head)
    {
        Node current = head;

        if (head == null)
        //If the head is null, it means the list is empty

        {
            return null;
        }

        while (current.next != null)
        {
            //If this node has the same data as the next node
            if (current.data == current.next.data)
            //Then set the reference of the nextNode to the node after nextNode
            {
                current.next = current.next.next;
            } else
            {
                current = current.next;
            }

        }
        return head;

    }
}
