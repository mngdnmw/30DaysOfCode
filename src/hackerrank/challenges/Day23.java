package hackerrank.challenges;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author meng
 */
public class Day23
{

    class Node
    {

        Node left, right;
        int data;

        Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }

    class Solution
    {

        void levelOrder(Node root)
        {
            Queue<Node> myQueue = new LinkedList<>();
            
            if (root != null)
            {
                //enqueue/add current root to linkedList
                myQueue.add(root);
            }
            
            //while there are nodes/roots to process
            while (!myQueue.isEmpty())
            {
                //dequeue/removes next node
                Node node = myQueue.remove();
                
                //System.out.print(node.data + " ");
                
                //enqueues child elements from next level in order
                if (node.left != null)
                {
                    myQueue.add(node.left);
                }
                if (node.right != null)
                {
                    myQueue.add(node.right);
                }
            }
        }
    }

    public Node insert(Node root, int data)
    {
        if (root == null)
        {
            return new Node(data);
        } else
        {
            Node cur;
            if (data <= root.data)
            {
                cur = insert(root.left, data);
                root.left = cur;
            } else
            {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
//
//    public static void main(String args[])
//    {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        Node root = null;
//        while (T-- > 0)
//        {
//            int data = sc.nextInt();
//            root = insert(root, data);
//        }
//        levelOrder(root);
//    }
}
