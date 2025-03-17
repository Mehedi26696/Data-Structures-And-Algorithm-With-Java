
// Reverse a Linked List using Iterative and Recursive methods

// https://leetcode.com/problems/reverse-linked-list/description/

// Time Complexity: O(n) for both methods
// Space Complexity: O(1) for Iterative and O(n) for Recursive


class LL {
    Node head;  

    public LL() {
        head = null;
    }

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    //Reverse the Linked List
    public void reverse() {
        Node current = head;
        Node prev = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }


    //Reverse the Linked List using Recursion
    public void reverseRecursion() {
        head = reverseRecursion(head);
    }

    private Node reverseRecursion(Node current) {
        if (current == null || current.next == null) {
            return current;
        }
        Node newHead = reverseRecursion(current.next);
        current.next.next = current;
        current.next = null;
        return newHead;
    }

    // Print the Linked List
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


public class Question_11 {
    
    public static void main(String[] args) {
        LL ll = new LL();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.add(10);

        System.out.println("Original Linked List:");
        ll.print();

        ll.reverse();
        System.out.println("Reversed Linked List:");
        ll.print();

        ll.reverseRecursion();
        System.out.println("Reversed Linked List using Recursion:");
        ll.print();
    }
}